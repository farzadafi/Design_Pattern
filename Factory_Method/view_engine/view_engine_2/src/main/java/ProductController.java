package main.java;

public class ProductController extends PageRender {
    public void listProduct() {
        render("products.html", new GlassViewEngine());
    }
}
