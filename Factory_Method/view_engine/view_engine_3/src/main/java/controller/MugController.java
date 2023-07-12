package main.java.controller;

import main.java.viewEngine.MugViewEngine;
import main.java.viewEngine.ViewEngine;

public class MugController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new MugViewEngine();
    }
}
