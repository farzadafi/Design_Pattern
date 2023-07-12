# Factory method

![factory_method](https://github.com/farzadafi/Design_Pattern/blob/master/image/Factory_method.png) </br>
image from *refactoring.guru*
#### overview

- one of the most used design patterns in Java
    * a creational pattern
    * factories handle the details of object creation

- this pattern defines an interface for creating an object (Creator)

- when a class needs to instantiate a subclass of another class, but doesn't know which one
    * it lets subclasses decide which class to instantiate
- Create objects without exposing the creation logic to the client (Creator) and refers to the newly
  created object using a common interface (Product)
- gives us a way to encapsulate the instantiations of concrete types

#### Framework

- the factory method is used in frameworks
    * frameworks exist at an abstract level

- frameworks use abstract classes to define and maintain relationships between objects
    * often responsible for creating these objects as well

- the framework should not know and should not be concerned about instantiating specific objects
    * need to defer the decisions about specific objects to the users of the framework

- use the Factory Method pattern when
    * a class cannot anticipate the class of objects it must create
    * a class wants its subclasses to specify the objects it creates

- also useful when implementing parallel class hierarchies
    * when some of the responsibilities shift from one class to another

  #### Example

- suppose you have two different types of televisions
    * one with an LED screen and another with an LCD screen

- If either of the tv's start to malfunction, you will call a TV repairman

- the repairman must ask first what kind of TV is broken

- as per your input, he will carry the required instruments with him to fix the tv

#### Advantage

- decouples the business logic of creation of a class from the actual logic of the class (i.e.
  decouples the implementation of the product from its use)
    * you can add additional products or change a product's implementation and it will not
      affect your Creator
    * the Creator is not tightly coupled to any Concrete Product

- allows you to change the design of your application more readily
    * makes our code more robust, less coupled and easy to extend

- promotes the approach of coding to an interface rather than implementation

- provides abstraction between implementation and client classes through inheritance

- connects parallel class hierarchies

#### Disadvantage

- makes code more difficult to read as all of your code is behind an abstraction that may in
turn hide abstractions

- can be classed as an anti-pattern when it is incorrectly used
    * some people use it to wire up a whole application

- sometimes making too many objects often can decrease performance

