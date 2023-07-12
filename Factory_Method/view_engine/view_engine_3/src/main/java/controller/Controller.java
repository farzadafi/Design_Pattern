package main.java.controller;

import main.java.viewEngine.GlassViewEngine;
import main.java.viewEngine.ViewEngine;

public class Controller {
    public void render(String viewName) {
        ViewEngine viewEngine = createViewEngine();
        String renderMatcha = viewEngine.render(viewName);
        System.out.println(renderMatcha);
    }

    protected ViewEngine createViewEngine() {
        return new GlassViewEngine();
    }
}
