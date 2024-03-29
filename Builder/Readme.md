# Builder

![Builder_image](https://github.com/farzadafi/Design_Pattern/blob/master/image/Builder.png)

image from refactoring.guru

* the main.builder design pattern separates the construction of a complex object from its
  representation
* uses the same construction processes to create the same object
* however, these processes can create different representations of the object
* uses a step-by-step approach to create the object
* the main.builder class is independent of other objects
* useful when creating the object is very complex and is independent of the assembly of
  the parts of the object

### Example

* an example would be creating your own computer
* different parts are assembled depending upon the order received by the customer
* a customer can demand a 500 GB hard disk with an Intel processor
* another customer can choose a 250 GB hard disk with an AMD processor

### Why Builder?

* this pattern was introduced to solve problems with the Factory and Abstract Factory design patterns
    - these patterns do not work well when the Object to be created contains a lot of attributes

    * there are three major issues
        1. too many arguments to pass from the client to the Factory class
            * can be error prone
            * it's hard to maintain the order of the arguments on the client side

        2. some parameters might be optional
            * in the Factory pattern we are forced to send all the parameters
            * optional parameters need to be sent as NULL

        3. if the object is heavy and its creation is complex
            * all that complexity will be part of factory classes which can cause major confusion

* one way to solve the optional parameters problem
    - provide a constructor with required parameters and then different setter
      methods to set the optional parameters
    - however, the Object state will be inconsistent until/unless all the attributes
      are set explicitly

* a better approach is to use the Builder pattern
    - provides a way to build the object step-by-step
    - provides a method that will actually return the final complex object

### Advantages

* it encapsulates the way a complex object is constructed
    - separates the code of assembling from its representation
    - hides the complex construction process and represents it as a simple process

* Allow objects to be constructed in a multistep and varying process (as opposed to one-step factories)

* hides the internal representation of the product from the client

* product implementations can be swapped in and out because the client only sees an
  abstract interface

* focuses on "how the product will be made"

### Disadvantages

* constructing objects requires more domain knowledge of the client than when
  using a Factory

* requires some amount of code duplication

### Approach 

[complex_object](https://github.com/farzadafi/Design_Pattern/tree/master/Builder/complex_object)
[construction_process](https://github.com/farzadafi/Design_Pattern/tree/master/Builder/construction_process)
