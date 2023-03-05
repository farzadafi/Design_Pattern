public class Client {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("Class Adapter is returning " + classAdapter.getInteger());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValueImpel());
        System.out.println("\nObject Adapter is returning " + objectAdapter.getInteger());
    }
}
