## Prototype

![prototype](https://github.com/farzadafi/Design_Pattern/blob/master/image/prototype.png)
image from refactoring.guru

#### Overview

* prototype pattern refers to creating a duplicate object while keeping performance in mind

- specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying this
  prototype

* used when creation of an object is costly, requires a lot of time and resources and you have a similar object already
  existing
    - creating a new instance is normally treated as an expensive operation
    - focus here is to reduce the expense of this creational process of a new instance
* provides a mechanism to copy the original object to a new object and then modify it according to our needs
    - uses java cloning to copy the object (shallow) or de-serialization when you need deep copies
* a key aspect of this pattern is that the client code can make new instances without knowing which specific class is
  being instantiated
* mandates that the Object which you are copying should provide the copying feature
    - should not be done by any other class
    - whether to perform a shallow or deep copy of the Object depends on the requirements and design



