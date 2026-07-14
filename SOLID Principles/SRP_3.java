class fileParser {
    private ReadFile readfile;
    private ParsingCSV parsercsv;
    private FileValidator filevalidator;
    private Storing store;

    fileParser(ReadFile readfile, ParsingCSV parsercsv, FileValidator filevalidator, Storing store) {
        this.readfile = readfile;
        this.parsercsv = parsercsv;
        this.filevalidator = filevalidator;
        this.store = store;
    }

    void fileOperations() {
        // Reading the file
        readfile.readFileFromDisk();

        // Parsing the CSV Rows
        parsercsv.parseCSVRows();

        // Validating the File Contents
        filevalidator.validateFile();

        // Writing the file to the database
        store.writeToDB();
    }

}

class ReadFile {
    void readFileFromDisk() {
        // Code to read the file from the disk...
    }
}

class ParsingCSV {
    void parseCSVRows() {
        // Code to parse CSV rows...
    }
}

class FileValidator {
    void vaidateFile() {
        // Code to validate the file...
    }
}

class Storing {
    void writeToDB() {
        // Code to write it to the Database...
    }
}