package main.java;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/main/resources/data.txt";

        Pattern numberPattern = Pattern.compile("\\d+");
        String numberReport = ExtractorReport.prepareAndSendReport(numberPattern, "Number", path);

        Pattern emailPattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}");
        String emailReport = ExtractorReport.prepareAndSendReport(emailPattern, "Email", path);

        Pattern wordPattern = Pattern.compile("[A-Za-z]+");
        String wordReport = ExtractorReport.prepareAndSendReport(wordPattern, "Word", path);
    }
}