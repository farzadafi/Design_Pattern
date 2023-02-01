import com.google.common.base.Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ExtractorRepost {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    private String parse(String path) throws FileNotFoundException {
        StringBuilder out = new StringBuilder();
        File file = new File(path);
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
                out.append(nextLine).append("/n");
            }
        }
        return Strings.isNullOrEmpty(out.toString()) ? "Empty file" : out.toString();
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting report " + getReportName());
        String report = parse(path);
        System.out.println(report);
        System.out.println("Send Report " + getReportName());
    }
}
