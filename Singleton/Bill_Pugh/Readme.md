## Bill Pugh Approach

* in most of the scenarios, Singleton classes are created for resources such as File System,
  Database connections etc ...
* we should avoid the instantiation until/unless client calls the getInstance method
* so, Bill Pugh came up with a different approach to create the Singleton class using an inner
  static helper class
* this is the most widely used approach for the Singleton class
* does not require synchronization, is thread safe and only creates the instance when
  the client needs it
* it is easy to understand and implement
* regarded as the standard method to implement singletons in Java