public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    private int data = 0;

    public static Singleton getInstance() {
        return singleton;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
