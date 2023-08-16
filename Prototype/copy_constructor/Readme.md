### Copy Constructor Approach

use from constructor for create a copy object, pass original object to constructor and use
from that for create a new copy object from that

#### Advantage

* does not force us to implement any interface or throw any exception
* does not require any casts
* does not require us to depend on an unknown object creation mechanism
* does not require parent classes to follow any contract or implement anything
* allows us to modify final fields
* allows us to have complete control over object creation
    - we can write our own initialization logic in it
* we can also create conversion constructors
    - allow us to convert one object to another object