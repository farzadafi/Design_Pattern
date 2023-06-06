package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractorReport {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}");

    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");

    private static final Pattern WORD_PATTERN = Pattern.compile("[A-Za-z]+");

    public static String parse(String reportType, String path) throws FileNotFoundException {
        StringBuilder out = new StringBuilder();
        URL url = ExtractorReport.class.getResource(path);
        assert url != null;
        File file = new File(url.getPath());
        Scanner scanner = new Scanner(file);

        Pattern pattern;
        if(reportType.equals("word"))
            pattern = WORD_PATTERN;
        else if(reportType.equals("number"))
            pattern = NUMBER_PATTERN;
        else
            pattern = EMAIL_PATTERN;

        if(scanner.hasNext())
            scanner.nextLine();
        else
            return "Empty file";

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = pattern.matcher(nextLine);
            boolean matches = matcher.matches();
            if(matches){
               out.append(nextLine).append("\n");
            }
        }
        if(out.length() == 0)
            return "Not match any thing";
        else
            return out.toString();
//        return out.length() == 0 ? "Not match any thing" : out.toString();
    }

    public static void prepareAndSendReport(String reportType, String reportName, String path) throws FileNotFoundException {
        System.out.println("Starting Report: " + reportName);
        String report = parse(reportType, path);
        System.out.println(report);
    }
}
