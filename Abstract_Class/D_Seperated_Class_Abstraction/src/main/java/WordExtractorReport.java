package main.java;

import java.util.regex.Pattern;

public class WordExtractorReport extends ExtractorReport {

    private static final Pattern PATTERN =
            Pattern.compile("[A-Za-z]+", Pattern.CASE_INSENSITIVE);


    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Word";
    }
}
