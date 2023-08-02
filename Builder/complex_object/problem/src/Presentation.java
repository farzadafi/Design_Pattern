import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private final List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationFormat format) {
        if(format == PresentationFormat.PDF) {
            var pdf = new PdfDocument();
            for(Slide slide: slides) {
                pdf.addPage(slide.getText());
            }
        }
        else if(format == PresentationFormat.MOVIE) {
            var movie = new Movie();
            for(Slide slide: slides) {
                movie.addFrame(slide.getText(), 3);
            }
        }
    }
}
