package main.java;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class NumberExtractorReport {

  private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

  private final ExtractorReport extractorReport;

  public NumberExtractorReport() {
    extractorReport = new ExtractorReport(PATTERN, "Phone Number");
  }

  public void prepareAndSendReport(String path) throws FileNotFoundException {
    extractorReport.prepareAndSendReport(path);
  }
}