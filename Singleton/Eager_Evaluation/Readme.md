## Eager Evaluation

* in eager initialization, the instance of Singleton Class is created at the time of class loading
* the easiest method to create a singleton class
* it has a drawback in that the instance is created even though the client application might not be using it
* using this approach, we rely on the JVM to create the unique instance of the Singleton when the class is loaded
* the JVM guarantees that the instance will be created before any thread accesses the static unique instance
  variable (threadsafe)

```java
    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
        }
```