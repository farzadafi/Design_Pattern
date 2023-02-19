public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(5);
        System.out.printf("First reference is %s%n", singleton);
        System.out.printf("Singleton data value is %s%n", singleton.getData());

        singleton = Singleton.getInstance();
        System.out.printf("%nSecond reference is %s%n", singleton);
        System.out.printf("Singleton data value is %s%n", singleton.getData());

    }
}
