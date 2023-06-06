package main.java;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class WordExtractorReport {

  private static final Pattern PATTERN =
      Pattern.compile("[A-Za-z]+", Pattern.CASE_INSENSITIVE);

  private final ExtractorReport extractorReport;

  public WordExtractorReport() {
    extractorReport = new ExtractorReport(PATTERN, "Word");
  }

  public void prepareAndSendReport(String path) throws FileNotFoundException {
    extractorReport.prepareAndSendReport(path);
  }
}