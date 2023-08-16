### Serialization Approach

* another way to copy an object is to use a serialize/deserialize approach
    - instead of cloning, you can serialize an object and then immediately deserialize it
    - would result in a new instance created
* we will still not be able to modify the final fields
* we still do not have any control on object construction
* we still need to implement Serializable, which is similar to Cloneable
* the serialization process is slower than Object.clone()

#### Advantage
* provides deep cloning
* suitable even for complex object graph
* can be used on existing classes that currently provides just shallow copy