package main.java.viewEngine;

public class MugViewEngine implements ViewEngine {
    @Override
    public String render(String viewName) {
        return viewName + " View file rendered with mug view engine";
    }
}
