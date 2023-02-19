public class Singleton {

    //todo volatile this instance?
    private static Singleton Instance = null;

    private int data = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (Instance == null)
            synchronized (Singleton.class) {
                Instance = new Singleton();
            }
        return Instance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
