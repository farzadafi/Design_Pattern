### First approach: write anything in one method

In this implementation with a single method has some limitations:

1. **Lack of encapsulation**: The logic for generating each type of report is spread across a single method, making it
   harder to read and maintain. If we need to modify the logic for generating a specific type of report, we would need
   to modify the method, which could affect the logic for other types of reports.

2. **Limited reusability**: The method is tightly coupled to a specific file path and pattern, making it harder to reuse
   the
   code in different parts of the application. If we need to generate reports based on different patterns or file paths,
   we
   would need to modify the method or create a new one.

3. **Limited flexibility**: The method can only support a single pattern and report name at a time, making it harder to
   add
   support for new types of reports or different patterns. If we need to support new types of reports or different
   patterns, we would need to modify the method or create a new one.

4. **Maintainability**: The code is harder to maintain because the logic for generating each type of report is spread
   across a
   single method. If we need to modify the logic for generating a specific type of report, we would need to modify the
   method, which could affect the logic for other types of reports.

5. **Testability**: The method is harder to test because the logic for generating each type of report is spread across a
   single
   method. If we need to test the code for a specific type of report, we would need to create mock files with specific
   patterns and test the method as a whole.

### How to work:

The **ExtractorReport** class provides a static method called ***prepareAndSendReport()*** that takes a regular
expression
pattern, report name, and file path as arguments. It reads lines from the file and extracts those that match the
pattern, then prints the resulting report to the console and returns it as a string.

The **Main** class uses the ***prepareAndSendReport()*** method to extract data from a file located at
/main/resources/data.txt.
It defines three regular expression patterns for extracting numbers, email addresses, and words, and calls
prepareAndSendReport() with each pattern and a corresponding report name.

### result of this code:

When executed, this program will print three reports to the console, one for each type of data, that show the lines in
the input file that match the corresponding regular expression pattern.

[**go to second approach**](https://github.com/farzadafi/Design_Pattern/tree/master/Abstract_Class/B_one_method_encapsulation)