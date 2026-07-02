import { useEffect, useRef } from "react";

const SVG_NS = "http://www.w3.org/2000/svg";

const config = {
  rotate: true,
  particleCount: 99,
  trailSpan: 0.64,
  durationMs: 4600,
  rotationDurationMs: 28000,
  pulseDurationMs: 10000,
  strokeWidth: 4.4,

  spiralR: 3,
  spiralr: 1,
  spirald: 3,
  spiralScale: 2.2,
  spiralBreath: 0.45,

  point(progress, detailScale) {
    const t = progress * Math.PI * 2;

    const d = this.spirald + detailScale * 0.25;

    const baseX =
      (this.spiralR - this.spiralr) * Math.cos(t) +
      d *
        Math.cos(
          ((this.spiralR - this.spiralr) / this.spiralr) * t
        );

    const baseY =
      (this.spiralR - this.spiralr) * Math.sin(t) -
      d *
        Math.sin(
          ((this.spiralR - this.spiralr) / this.spiralr) * t
        );

    const scale =
      this.spiralScale + detailScale * this.spiralBreath;

    return {
      x: 50 + baseX * scale,
      y: 50 + baseY * scale,
    };
  },
};

export default function Loader() {
  const groupRef = useRef(null);
  const pathRef = useRef(null);

  useEffect(() => {
    const group = groupRef.current;
    const path = pathRef.current;

    path.setAttribute("stroke-width", config.strokeWidth);

    // Create particles
    const particles = [];

    for (let i = 0; i < config.particleCount; i++) {
      const circle = document.createElementNS(
        SVG_NS,
        "circle"
      );

      circle.setAttribute("fill", "currentColor");

      group.appendChild(circle);
      particles.push(circle);
    }

    const normalizeProgress = (progress) =>
      ((progress % 1) + 1) % 1;

    const getDetailScale = (time) => {
      const pulseProgress =
        (time % config.pulseDurationMs) /
        config.pulseDurationMs;

      const pulseAngle = pulseProgress * Math.PI * 2;

      return (
        0.52 +
        ((Math.sin(pulseAngle + 0.55) + 1) / 2) * 0.48
      );
    };

    const getRotation = (time) => {
      if (!config.rotate) return 0;

      return (
        -(
          (time % config.rotationDurationMs) /
          config.rotationDurationMs
        ) * 360
      );
    };

    const buildPath = (detailScale, steps = 480) => {
      let d = "";

      for (let i = 0; i <= steps; i++) {
        const point = config.point(i / steps, detailScale);

        d += `${i === 0 ? "M" : "L"} ${point.x.toFixed(
          2
        )} ${point.y.toFixed(2)} `;
      }

      return d;
    };

    const getParticle = (
      index,
      progress,
      detailScale
    ) => {
      const tailOffset =
        index / (config.particleCount - 1);

      const point = config.point(
        normalizeProgress(
          progress - tailOffset * config.trailSpan
        ),
        detailScale
      );

      const fade = Math.pow(1 - tailOffset, 0.56);

      return {
        x: point.x,
        y: point.y,
        radius: 0.9 + fade * 2.7,
        opacity: 0.04 + fade * 0.96,
      };
    };

    const startedAt = performance.now();

    let animationFrame;

    const render = (now) => {
      const time = now - startedAt;

      const progress =
        (time % config.durationMs) /
        config.durationMs;

      const detailScale = getDetailScale(time);

      group.setAttribute(
        "transform",
        `rotate(${getRotation(time)} 50 50)`
      );

      path.setAttribute(
        "d",
        buildPath(detailScale)
      );

      particles.forEach((node, index) => {
        const particle = getParticle(
          index,
          progress,
          detailScale
        );

        node.setAttribute(
          "cx",
          particle.x.toFixed(2)
        );

        node.setAttribute(
          "cy",
          particle.y.toFixed(2)
        );

        node.setAttribute(
          "r",
          particle.radius.toFixed(2)
        );

        node.setAttribute(
          "opacity",
          particle.opacity.toFixed(3)
        );
      });

      animationFrame = requestAnimationFrame(render);
    };

    animationFrame = requestAnimationFrame(render);

    return () => {
      cancelAnimationFrame(animationFrame);

      particles.forEach((particle) => particle.remove());
    };
  }, []);

  return (
    <div
      style={{
        width: "220px",
        height: "220px",
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        color: "#ffffff",
      }}
    >
      <svg
        viewBox="0 0 100 100"
        width="100%"
        height="100%"
        fill="none"
        style={{ overflow: "visible" }}
      >
        <g ref={groupRef}>
          <path
            ref={pathRef}
            stroke="currentColor"
            strokeLinecap="round"
            strokeLinejoin="round"
            opacity="0.1"
          />
        </g>
      </svg>
    </div>
  );
}