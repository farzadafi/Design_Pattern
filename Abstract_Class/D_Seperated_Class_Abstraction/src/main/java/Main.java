package main.java;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        new NumberExtractorReport().prepareAndSendReport("data.txt");
        new EmailExtractorReport().prepareAndSendReport("data.txt");
        new WordExtractorReport().prepareAndSendReport("data.txt");
    }
}
