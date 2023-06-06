### Second approach: write anything in one method with encapsulate data

In this code, the encapsulation and other things are observed
One disadvantage of this code is that it is tightly coupled to the specific file format and patterns that are being used
for parsing. If there were to be a change in the file format or the types of patterns needed to be extracted, the code
would need to be modified accordingly.

In terms of the ***Open/Close*** principle, this code does not fully adhere to it as it is not easily extensible. If we wanted
to add a *new pattern* to extract, we would need to modify the parse() method and add another conditional statement to
check for the new pattern type. This violates the "Open" part of the principle which states that a class should be open
for extension but closed for modification.

[**go to third approach**](https://github.com/farzadafi/Design_Pattern/tree/master/Abstract_Class/C_Seperated_Class_Composition)
