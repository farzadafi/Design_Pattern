package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractorReport {

  private final Pattern pattern;
  private final String reportName;

  public ExtractorReport(Pattern pattern, String reportName) {
    this.pattern = pattern;
    this.reportName = reportName;
  }

  public void prepareAndSendReport(String path) throws FileNotFoundException {
    StringBuilder out = new StringBuilder();
    URL url = getClass().getResource(path);
    assert url != null;
    File file = new File(url.getPath());
    Scanner scanner = new Scanner(file);
    if (scanner.hasNext())
      scanner.nextLine();
    else
      return;
    while (scanner.hasNext()) {
      String nextLine = scanner.nextLine();
      Matcher matcher = pattern.matcher(nextLine);
      boolean matches = matcher.matches();
      if (matches) {
        out.append(nextLine).append("\n");
      }
    }
    String report = out.length() == 0 ? "Empty file" : out.toString();
    System.out.println("Starting report " + reportName);
    System.out.println(report);
  }
}