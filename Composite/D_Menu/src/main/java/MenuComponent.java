import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MenuComponent {
    private final String url;
    private final String name;
    private List<MenuComponent> children;

    public MenuComponent(String url, String name) {
        this.url = url;
        this.name = name;
        children = new ArrayList<>();
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("not supported in this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("not supported in this level");
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuComponent that = (MenuComponent) o;
        return Objects.equals(url, that.url) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, name);
    }
}
