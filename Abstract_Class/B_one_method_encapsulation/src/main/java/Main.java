package main.java;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/main/resources/data.txt";
        ExtractorReport.prepareAndSendReport("number", "number", path);

        System.out.println();
        ExtractorReport.prepareAndSendReport("word", "word", path);

        System.out.println();
        ExtractorReport.prepareAndSendReport("email", "email", path);
    }
}
