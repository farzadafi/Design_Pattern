package main.java.render;

import main.java.viewEngine.GlassViewEngine;
import main.java.viewEngine.ViewEngine;

public class GlassRender extends PageRender {
    @Override
    public ViewEngine createViewEngine() {
        return new GlassViewEngine();
    }
}
