public class Client {
    public static void main(String[] args) {
        Menu root = new Menu("//transfer", "Transfer Money");
        root.add(new MenuItem("//card to card", "card to card"));
        root.add(new MenuItem("//account", "By Account number"));

        Menu subMenu = new Menu("//by Iban", "by Iban");
        subMenu.add(new MenuItem("//paya", "paya"));
        subMenu.add(new MenuItem("//satna", "satna"));

        root.add(subMenu);
        System.out.println(root);
    }
}
