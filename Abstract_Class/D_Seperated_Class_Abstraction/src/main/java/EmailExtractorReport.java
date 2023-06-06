package main.java;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {

    private static final Pattern PATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email";
    }
}
