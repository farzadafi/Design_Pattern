package main.java.render;

import main.java.viewEngine.ViewEngine;

public abstract class PageRender {
    public void render(String viewName) {
        ViewEngine viewEngine = createViewEngine();
        String renderPage = viewEngine.render(viewName);
        System.out.println(renderPage);
    }

    public abstract ViewEngine createViewEngine();
}
