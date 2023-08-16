### Cloneable Interface

* The Cloneable interface in Java is a marker interface(1) that is used to indicate that an object can be cloned.
  - It is part of the Java cloning mechanism, which allows creating a copy of an object without invoking its constructor.

* When a class implements the Cloneable interface, it is providing a signal to the Java runtime that instances of that
  class can be cloned. 
  - However, it does not guarantee successful cloning of objects. 
  - This is because the clone method, which is responsible for creating the copy, is protected and declared in the Object class.

* To use the Cloneable interface, a class needs to implement it and provide an implementation of the clone method. 
- The clone method creates a shallow copy(2) of the object by simply copying the fields of the original object to the new
  object. 
- Note that the clone method returns an Object and needs to be cast to the appropriate class type for use.

* It is important to note that the Cloneable interface does not contain any methods. 
- It only serves as a marker to indicate that a class can be cloned. 
- Additionally, the Cloneable interface is a part of the Java language for backward
compatibility and is not recommended to be used in new code.

* The Cloneable interface is useful in situations where a new object is required to be created with the same state as an
  existing object. 
- However, it is important to be cautious when using cloning as it can be a bit error-prone. 
- It is recommended to use alternative methods such as copy constructors or deep copy techniques to create object copies,
  especially in complex scenarios.


1. *marker interface*: 
   - A marker interface in Java is an interface that doesn't have any methods or fields declared in it.
   -  It serves as a special type of interface that is used to indicate something about the classes that implement it.
   - . The purpose of a marker interface is to allow code to check for the presence of the marker interface to determine whether a class has a certain characteristic or behavior.
   - For example, the Serializable interface in Java is a marker interface.
   -  It is implemented by classes that can be serialized, meaning they can be converted into a byte stream for storage or transmission, and then can be deserialized to recreate the object.
2.  *shallow copy* :
    -  a shallow copy refers to copying the values of the fields from the original object to the new object without duplicating any shared references.
    - This means that if the original object contains any references to other objects, the new object will have those references pointing to the same objects as the original object.
    - In other words, modifications made to the shared objects will be reflected in both the original and cloned objects.

*. [first read shape_clone](https://github.com/farzadafi/Design_Pattern/tree/master/Prototype/cloneable_interface/Shape_Clone) <br>
*.[second read car_clone](https://github.com/farzadafi/Design_Pattern/tree/master/Prototype/cloneable_interface/Car_Clone) 