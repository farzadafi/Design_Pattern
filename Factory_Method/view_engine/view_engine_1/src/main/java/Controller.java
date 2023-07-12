package main.java;

public class Controller {
    public void render(String viewName) {
        GlassViewEngine glassViewEngine = new GlassViewEngine();
        String renderMatcha = glassViewEngine.render(viewName);
        System.out.println(renderMatcha);
    }
}
