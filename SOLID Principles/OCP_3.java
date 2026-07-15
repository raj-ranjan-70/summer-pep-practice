interface ImageExporter {
    void exportImage();
}

class PNGExporter implements ImageExporter {

    @Override
    public void exportImage() {
        // Code to export image in PNG format...
    }
}

class JPGExporter implements ImageExporter {

    @Override
    public void exportImage() {
        // Code to export image in JPG format...
    }
}

class JPEGExporter implements ImageExporter {

    @Override
    public void exportImage() {
        // Code to export image in JPEG format...
    }
}