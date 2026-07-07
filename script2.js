function greet() {
    fetch("https://api.dragonstone.rajranjan.qzz.io/api/projects/d5c2d0f7-6f6e-4d1c-9d5b-8a6d7e2b9c31")
    .then((response) => response.json())
    .then((data) => console.log(data));
}

console.log("Start");
greet();
console.log(crypto.randomUUID())
console.log("End")