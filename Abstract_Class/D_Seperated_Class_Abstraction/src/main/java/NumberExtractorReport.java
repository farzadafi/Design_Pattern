package main.java;

import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    public Pattern getPattern() {
        return PATTERN;
    }

    public String getReportName() {
        return "Phone Number";
    }
}
