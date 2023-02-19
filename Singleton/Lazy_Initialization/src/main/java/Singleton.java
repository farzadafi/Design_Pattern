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
}
