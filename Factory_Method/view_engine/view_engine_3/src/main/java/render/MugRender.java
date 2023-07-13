package main.java.render;

import main.java.viewEngine.MugViewEngine;
import main.java.viewEngine.ViewEngine;

public class MugRender extends PageRender {
    @Override
    public ViewEngine createViewEngine() {
        return new MugViewEngine();
    }
}
