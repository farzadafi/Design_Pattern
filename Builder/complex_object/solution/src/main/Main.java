package main;

import main.builder.MovieBuilder;
import main.builder.PdfDocumentBuilder;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("main.Slide 1"));
        presentation.addSlide(new Slide("main.Slide 2"));

        var builder = new PdfDocumentBuilder();
        presentation.export(builder);
        var pdf = builder.getDocument();

        System.out.println();

        var builderMovie = new MovieBuilder();
        presentation.export(builderMovie);
        var movie = builderMovie.getMovie();
    }
}
