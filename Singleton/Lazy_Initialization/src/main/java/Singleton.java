// this method is not recommended, because is not Thread safe
public class Singleton {

    private static Singleton Instance = null;

    private int data = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (Instance == null)
            Instance = new Singleton();
        return Instance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
