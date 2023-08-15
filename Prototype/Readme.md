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

#### When we use from prototype?

1. When we want to create multiple instances of an object that share common properties , we can use the
   prototype pattern in Java.
   For example, let's say we are developing a game and need to create multiple enemies with
   different characteristics, such as health, strength, and speed. Instead of creating separate classes for each enemy,
   we
   can use a prototype object to define the common properties and create clones from it. This helps in efficient memory
   usage and reduces the code duplication.

2. Another scenario where the prototype pattern can be used is when we need to create copies of complex objects, but the
   process of creating these objects is expensive and time-consuming. By using the prototype pattern, we can create a
   prototype object and clone it whenever needed, thereby saving resources and improving performance. For instance,
   consider a scenario where we are developing a graphics editor and need to duplicate shapes, fonts, or other graphical
   elements. The prototype pattern allows us to clone these objects instead of recreating them from scratch.

3. In some cases, we may want to dynamically add or remove functionality from an object at runtime. The prototype
   pattern can support this requirement by allowing us to clone an existing object and modify its behavior as needed.
   For example, suppose we are building a software system with multiple user roles (e.g., admin, manager, employee).
   Each role may have some unique permissions or functionality. By using the prototype pattern, we can create a base
   prototype object for the common functionality and clone it for each role, adding or removing specific features as
   required.

4. When dealing with multithreaded environments, the prototype pattern can be useful for thread safety. Instead of
   creating new objects by initializing them in threads, we can use a prototype object and clone it within each thread.
   This ensures that each thread has its own separate instance and avoids any synchronization issues that may arise from
   concurrent object creation or modification.

#### Advantage

1. **Object creation efficiency** : The Prototype pattern allows objects to be cloned, reducing the need for expensive
   object
   creation operations. Instead of creating an object from scratch, a new object can be created by cloning an existing
   prototype.

2. **Reduced duplication of code**: With the Prototype pattern, you can define a set of initial properties in a
   prototype
   object and then clone it to create new instances. This helps to avoid duplicating code for initializing objects with
   identical properties.

3. **Flexibility in object creation**: By allowing objects to be cloned, the Prototype pattern provides flexibility in
   creating new object instances. You can easily create variations of an existing object by modifying its cloned version
   without affecting the original object.
4. **Improves performance**: The use of cloning in the Prototype pattern can improve performance by avoiding unnecessary
   object creation operations. Cloning an existing prototype is generally faster than creating a completely new object
   from scratch.