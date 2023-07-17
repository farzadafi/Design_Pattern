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