### Third approach: write in seperated class with Composition

implementation with separate classes for each report:

1. **Encapsulation**: Each report is encapsulated in a separate class, which makes the code easier to read and maintain.
   The logic for parsing and generating each type of report is contained within a single class, making it easier to
   understand and modify.

2. **Reusability**: The classes can be reused in different parts of the code. Once a class is defined, it can be used to
   generate reports based on its specific pattern in different parts of the code without having to redefine the pattern
   or
   the logic for generating the report.

3. **Flexibility**: The classes can be extended or modified to support new types of reports or different patterns. For
   example,
   if we wanted to add support for extracting URLs from a file, we could create a new class called UrlExtractorReport
   that
   extends the ExtractorReport class and defines a new pattern for matching URLs.

4. **Maintainability**: The code is easier to maintain because the logic for generating each type of report is separated
   into
   separate classes. If we need to modify the logic for generating a specific type of report, we can do so without
   affecting the logic for other types of reports.

5. **Testability**: The classes can be tested in isolation, making it easier to write unit tests for each type of
   report. We
   can create mock files with specific patterns and test that each report generates the expected output for that
   pattern.

### How to work:

1. The ExtractorReport class defines a generic report extractor that takes a regular expression pattern and a report
   name as input. It reads a text file line by line, matches each line against the pattern, and constructs a report
   containing all matching lines. Once the report is ready, it prints it to the console.

2. The EmailExtractorReport, NumberExtractorReport, and WordExtractorReport classes extend the ExtractorReport class and
   define specific patterns for extracting email addresses, phone numbers, and words from the text file, respectively.

3. The main.Main class is the entry point of the program. It creates instances of the EmailExtractorReport,
   NumberExtractorReport, and WordExtractorReport classes, and invokes their prepareAndSendReport() methods with the
   path
   of the text file to be processed. Each report extractor reads the file, extracts the relevant data, and prints the
   report to the console.

4. The text file to be processed is located in the /main/resources/data.txt directory relative to the classpath. This
   file
   contains a list of lines, each of which may or may not contain email addresses, phone numbers, or words.


[**go to fourth approach**](https://github.com/farzadafi/Design_Pattern/tree/master/Abstract_Class/D_Seperated_Class_Abstraction)


