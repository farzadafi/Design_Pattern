package main.java;

public class ReaderController extends PageRender {
    public void readFile() {
        render("filename.txt", new GlassViewEngine());
    }
}
