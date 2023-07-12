package main.java.viewEngine;

public class GlassViewEngine implements ViewEngine {
    @Override
    public String render(String viewName) {
        return viewName + " View file rendered with glass view engine";
    }
}
