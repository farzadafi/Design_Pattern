public class Client {
    public static void main(String[] args) {
        Captain captain = Captain.getInstance();
        System.out.println(captain);
        Captain captain1 = Captain.getInstance();
        System.out.println(captain1);
    }
}
