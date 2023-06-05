package main.java;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class EmailExtractorReport {

  private static final Pattern PATTERN =
      Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  private final ExtractorReport extractorReport;

  public EmailExtractorReport() {
    extractorReport = new ExtractorReport(PATTERN, "Email");
  }

  public void prepareAndSendReport(String path) throws FileNotFoundException {
    extractorReport.prepareAndSendReport(path);
  }
}