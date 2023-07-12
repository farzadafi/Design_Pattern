package main.java;

public class Controller {
    public void render(String viewName, ViewEngine viewEngine) {
        String renderMatcha = viewEngine.render(viewName);
        System.out.println(renderMatcha);
    }
}
