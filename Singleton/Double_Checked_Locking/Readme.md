### Double-checked locking approach

```java
    public static Singleton getInstance() {
        if (Instance == null)
            synchronized (Singleton.class) {
                if (Instance == null)
                    Instance = new Singleton();
            }
        return Instance;
    }
```

* this approach will use a synchronized block inside the if condition with an additional
  check to ensure that only one instance of the singleton class is created
    * intent is to optimize away unnecessary locking, increase performance
    * the synchronization check happens at most one time, so it will not be a bottleneck
* use "double-checked locking" to reduce the use of synchronization in getInstance()

* with double-checked locking, we first check to see if an instance is created, and if not,
  THEN we synchronize
    * we only synchronize the first time through, just what we want

this is not bad :)