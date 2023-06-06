package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ExtractorReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    private String parse(String path) throws FileNotFoundException {
        StringBuilder out = new StringBuilder();
        URL url = getClass().getResource(path);
        assert url != null;
        File file = new File(url.getPath());
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext())
            scanner.nextLine();
        else
            return "Empty file";
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);
            boolean matches = matcher.matches();
            if (matches) {
                out.append(nextLine).append("\n");
            }
        }
        return out.length() == 0 ? "Empty file" : out.toString();
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting report " + getReportName());
        String report = parse(path);
        System.out.println(report);
        System.out.println("Send Report " + getReportName());
    }
}
