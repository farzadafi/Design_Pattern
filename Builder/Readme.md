# Builder

![Builder_image](https://github.com/farzadafi/Design_Pattern/blob/master/image/Builder.png)

image from refactoring.guru

* the builder design pattern separates the construction of a complex object from its
  representation
* uses the same construction processes to create the same object
* however, these processes can create different representations of the object
* uses a step-by-step approach to create the object
* the builder class is independent of other objects
* useful when creating the object is very complex and is independent of the assembly of
  the parts of the object

### Example
* an example would be creating your own computer
* different parts are assembled depending upon the order received by the customer
* a customer can demand a 500 GB hard disk with an Intel processor
* another customer can choose a 250 GB hard disk with an AMD processor