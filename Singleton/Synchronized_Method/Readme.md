## Synchronized approach

##### problem with synchronized approach

```java
    public synchronized static Singleton getInstance(){
        if(Instance==null)
        Instance=new Singleton();
        return Instance;
        }
```

* one big problem is that the synchronization may end up being a severe bottleneck
    * all the threads will have to wait for the check on whether the object already exists
    * reduces the performance because of cost associated with the synchronized method

* the only time synchronization is relevant is the first time through this method
    * once we have set the unique instance variable to an instance of Singleton, we have no
      further need to synchronize this method
    * after the first time through, synchronization is totally unneeded overhead