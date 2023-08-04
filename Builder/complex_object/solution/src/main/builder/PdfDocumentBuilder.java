package main.builder;

import main.PdfDocument;
import main.Slide;

public class PdfDocumentBuilder implements PresentationBuilder {
    private final PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }

    public PdfDocument getDocument() {
        return this.document;
    }
}
