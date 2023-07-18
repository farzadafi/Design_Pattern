## Lazy Evaluation

#### problem with this approach

* this implementation are not thread safe

```java
    public static Singleton getInstance(){
        if(Instance==null)
        Instance=new Singleton();
        return Instance;
        }
```

* suppose two calls to getInstance() are made at virtually the same time
    - the first thread checks to see whether the instance exists. It does not, it goes into the part
      of the code that will create the first instance
* however, before it has done that, suppose a second thread also looks to see whether the
  instance member is null
    - because the first thread has not created anything yet, the instance is still equal to null,
      so the second thread also goes into the code that will create an object
* both threads now perform a new on the Singleton object, thereby creating two objects

if you create a connection, may have to connection :), this is very bad