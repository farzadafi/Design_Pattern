package main.builder;

import main.Slide;

public interface PresentationBuilder {
    void addSlide(Slide slide);
}