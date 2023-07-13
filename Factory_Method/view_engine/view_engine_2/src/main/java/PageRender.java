package main.java;

public class PageRender {
    public void render(String path, ViewEngine viewEngine) {
        String pageRenderStr = viewEngine.render(path);
        System.out.println(pageRenderStr);
    }
}
