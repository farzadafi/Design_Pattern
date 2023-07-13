package main.java.render;

import main.java.viewEngine.ViewEngine;

public abstract class PageRender {
    public void render(String path) {
        ViewEngine viewEngine = createViewEngine();
        String renderPage = viewEngine.render(path);
        System.out.println(renderPage);
    }

    public abstract ViewEngine createViewEngine();
}
