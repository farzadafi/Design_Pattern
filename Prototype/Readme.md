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

#### Example

first: <br>
In some games, we want trees or buildings in the background. We may realize that we don't have to create new trees or
buildings and render them on the screen every time the character moves.
So, we create an instance of the tree first. Then we can create as many trees as we want from this instance (prototype)
and update their positions. We may also choose to change the color of the trees for a new level in the game.

second: <br>

- suppose we have an Object that loads data from database
- we need to modify this data in our program multiple times
- not a good idea to create the Object using the new keyword and load all the data again from database
- we can cache the object, returns a clone of the object on the next request
- update the database when needed
- reduces the number of database calls

