package main.java;

public class PageRender {
    public void render(String path) {
        GlassViewEngine glassViewEngine = new GlassViewEngine();
        String renderMatcha = glassViewEngine.render(path);
        System.out.println(renderMatcha);
    }
}
