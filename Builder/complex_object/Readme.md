### Complex Object Approach

the algorithm for creating a complex object should be independent of the
parts that make up the object and how they're assembled.

If the algorithm for creating a complex object is not independent of the parts that make up the object and how they're
assembled, then the resulting code may become tightly coupled and difficult to maintain, especially as the complexity of
the object increases.

For example, imagine you want to create a complex object such as a custom car, and you decide to create a single class
that handles the construction of the car. This class would likely contain many methods and dependencies, such as methods
to add the engine, wheels, seats, and other components, as well as dependencies on various parts suppliers and
manufacturers. As the complexity of the car increases, this class would become increasingly difficult to maintain, and
any changes to the construction process would require significant modifications to the class and this contravened from
open/close principle

Using the Builder pattern, on the other hand, allows for a more modular and flexible approach to constructing complex
objects. By separating the construction process into independent builder classes, the algorithm for constructing the
object can remain the same, while different builders can be used to construct different variations of the object. This
makes the code easier to maintain and modify, as changes to the construction process can be made by modifying the
builder classes, rather than a single monolithic class.