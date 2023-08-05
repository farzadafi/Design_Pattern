### Problem

in this example we have an entity with a name's Address, This entity has some attributes:

```java
    private String country; //require
private String province; //require
private String city; //require
private String street; //require
private String subStreet; //optional
private String postalCode; //optional
private String houseNumber; //optional
```

fourth of the first attributes are required, and a third of attributes are optional, please think about a situation you
just enter that requires attributes, and the other case all requires, and one optional field, and another case all
requires, and two optional and ...
without Builder, you have two ways, create a couple of constructors, or create a constructor for the required attribute,
and after that use from setter method to set the optional attribute :|
