package main.java;

import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    String path = "/main/resources/data.txt";

    EmailExtractorReport emailReport = new EmailExtractorReport();
    emailReport.prepareAndSendReport(path);

    NumberExtractorReport numberReport = new NumberExtractorReport();
    numberReport.prepareAndSendReport(path);

    WordExtractorReport wordReport = new WordExtractorReport();
    wordReport.prepareAndSendReport(path);
  }
}