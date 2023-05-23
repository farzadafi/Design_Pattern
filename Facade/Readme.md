# Facade

That provides a simplified **interface** to a larger body of code, such as a library or complex subsystem.

The pattern involves creating a simple **interface** that hides the **complexity** of the underlying system and provides
a set
of methods that clients can use to interact with the system.

<br>

The **Facade** pattern is often used to:

1. **simplify** the interface to a complex system

2. making it **easier** to use and reducing the amount of code that a client needs to write.

3. It is also useful for **decoupling clients** from the implementation details of
   a system, allowing the system to evolve without affecting its clients.

<br>

In the Facade pattern, a single class (the facade) provides a simplified interface to a complex subsystem, which may
consist of multiple classes and interfaces. The facade encapsulates the complexity of the subsystem and exposes a
simple, **high-level** interface that clients can use to interact with the system.

<h3>benefits</h3>

1. Simplifying the interface to a complex system, making it easier to use.
2. Encapsulating the complexity of a system, making it easier to modify and maintain.
3. Decoupling clients from the implementation details of a system, allowing the system to evolve without affecting its
   clients.
4. Promoting code reuse by providing a single interface to a complex subsystem.