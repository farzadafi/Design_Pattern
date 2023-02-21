public class Singleton {

    private int data = 0;

    private Singleton() {

    }

    private static final class SingletonHelper {

        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.singleton;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
