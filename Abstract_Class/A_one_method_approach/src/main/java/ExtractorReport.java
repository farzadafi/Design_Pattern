package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractorReport {
    
    public static String parse(Pattern pattern, String path) throws FileNotFoundException {
        StringBuilder out = new StringBuilder();
        URL url = ExtractorReport.class.getResource(path);
        assert url != null;
        File file = new File(url.getPath());
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext())
            scanner.nextLine();
        else
            return "Empty file";
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = pattern.matcher(nextLine);
            boolean matches = matcher.matches();
            if (matches) {
                out.append(nextLine).append("\n");
            }
        }
        return out.length() == 0 ? "Empty file" : out.toString();
    }

    public static void prepareAndSendReport(Pattern pattern, String reportName, String path) throws FileNotFoundException {
        System.out.println("Starting report " + reportName);
        String report = parse(pattern, path);
        System.out.println(report);
    }
}