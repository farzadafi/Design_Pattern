package main.java.render;

public class ProductController extends MugRender {

    private final GlassRender glassRender = new GlassRender();

    public void listProduct() {
        System.out.println("Render with MugRender framework");
        render("products.html ");

        System.out.println("\nRender with GlassRender framework");
        glassRender.render("products.html");
    }
}
