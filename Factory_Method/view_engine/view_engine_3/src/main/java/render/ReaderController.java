package main.java.render;

public class ReaderController extends MugRender {

    private final GlassRender glassRender = new GlassRender();

    public void readFile() {
        System.out.println("Render with MugRender framework");
        render("filename.txt");

        System.out.println("\nRender with GlassRender framework");
        glassRender.render("filename.txt");
    }
}
