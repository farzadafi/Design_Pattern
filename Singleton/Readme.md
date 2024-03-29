# Singleton

![Singleton_image](https://github.com/farzadafi/Design_Pattern/blob/master/image/Singleton_image_1.png)
</br>
image from refactoring.guru

### Overview

- the Singleton pattern is one of the simplest design patterns in Java
    - comes under creational pattern as this pattern provides one of the best ways to create an object

- ensures a class only has one instance, and provide a global point of access to it

- we are taking a class and letting it manage a single instance of itself
    - also preventing any other class from creating a new instance on its own
    - to get an instance, you have got to go through the class itself

- we are also providing a global access point to the instance
    - whenever you need an instance, just query the class, and it will hand you back the single instance
    - a global variable makes an object accessible, but it does not keep you from instantiating multiple objects

- it is important for some classes to have exactly one instance for example JDBC connection
    - Multiple instances of the Connection object can lead to resource contention and reduce performance.
      By using a singleton, you can ensure that there is only one instance of the Connection object and reduce
      the overhead associated with creating multiple connections.
    - A singleton can provide a global point of access to the Connection object,
      making it easy to share the connection across different parts of the application.
    - By controlling the creation and management of the Connection object,
      you can ensure that it is properly closed and released when it is no longer needed.

### Advantage :)

1. Provides a single point of access
   The singleton pattern provides a single point of access to an object.
   This makes it easy to manage and use the object in different parts of the application.
2. Ensures a single instance
   The singleton pattern ensures that only one instance of the object is created
   and that it is shared across the application. This can help to reduce resource usage and improve performance.
3. Allows lazy initialization
   The singleton pattern allows lazy initialization of the object,
   which means that the object is not created until it is actually needed. This can help to reduce memory usage and
   improve performance.

### Disadvantage :(

1. Can be difficult to test
   Singleton objects can be difficult to test because they are designed to have only one instance.
   This can make it challenging to create unit tests that isolate the behavior of the object.
2. Can lead to tight coupling
   The singleton pattern can lead to tight coupling between classes,
   which can make it difficult to modify or replace the object in the future. This can make the code more brittle and
   less flexible.
3. Can introduce global state
   The singleton pattern can introduce global state into the application, which can make it difficult to reason about
   the behavior of the system. Changes to the singleton object can have unintended consequences for the application.

### Implementation Overview

1. Make the constructor of the class private: This prevents the class from being instantiated from outside the class.

2. Create a private static instance variable of the class: This will hold the single instance of the class.

3. Create a public static method that returns the instance of the class: This method should create the instance if it
   doesn't exist yet, and return the existing instance otherwise.

4. Optionally, make the class final: This ensures that the class cannot be subclassed and the single instance cannot be
   overwritten.

## main approach implement

### Lazy Evaluation approach

* it is not multi-thread safe
* use this approach if you are not worried about multiple threads
* this is not a recommended approach :|

[see code of lazy approach](https://github.com/farzadafi/Design_Pattern/tree/master/Singleton/Lazy_Initialization)

### Synchronized approach

* thread safe
* use when performance is not critical to your application, but, it is multithreaded
* straightforward and effective

[see code of synchronized approach](https://github.com/farzadafi/Design_Pattern/tree/master/Singleton/Synchronized_Method)

### Double-checked locking approach

* thread safe
* increases performance from the synchronized approach

[see code of Double-checked locking approach](https://github.com/farzadafi/Design_Pattern/tree/master/Singleton/Double_Checked_Locking)

### Eager Evaluation approach

* if your application always creates and uses an instance of the Singleton
* does not use a lot of resources
* thread safe
* the instance is created even though client application might not be using it

[see code of Eager_Evaluation](https://github.com/farzadafi/Design_Pattern/tree/master/Singleton/Eager_Evaluation)

### Bill Pugh approach

* thread safe
* high performance
* ensures that the instance is only created if a client needs it
* create the Singleton class using an inner static helper class
* regarded as the standard method to implement singletons in Java

[see code of Bill Pugh](https://github.com/farzadafi/Design_Pattern/tree/master/Singleton/Bill_Pugh)
