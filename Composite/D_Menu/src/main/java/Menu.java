public class Menu extends MenuComponent {

    public Menu(String url, String name) {
        super(url, name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("::menu::");
        stringBuilder.append(print());
        getChildren().forEach(leaf -> stringBuilder.append(leaf.toString()));
        return stringBuilder.toString();
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        getChildren().add(menuComponent);
        return this;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        getChildren().remove(menuComponent);
        return this;
    }
}
