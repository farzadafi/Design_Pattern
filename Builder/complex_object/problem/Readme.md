please see this package code and think about what problem of this code?

ok, now see problems of this code:

```java
    public void export(PresentationFormat format){
        if(format==PresentationFormat.PDF){
        var pdf=new PdfDocument();
        for(Slide slide:slides){
        pdf.addPage(slide.getText());
        }
        }
        else if(format==PresentationFormat.MOVIE){
        var movie=new Movie();
        for(Slide slide:slides){
        movie.addFrame(slide.getText(),3);
        }
        }
        }
```

1. The first problem is it violates the Open/Close Principle, so if tomorrow we want to support a new
   presentation format, we have to come back and modify this method

2. The second problem is the tight coupling between the presentation class and these other classes
   lik PdfDocument, Movie, and so on, so as we support more presentation format, out coupling
   increase

3. The third problem is that our presentation class should also have knowledge of the
   structure of these classes, For example , it knows that our PdfDocument have pages:
    ```java
        pdf.addPage(slide.getText());
    ```
   and movies have frames:
    ```java
        movie.addFrame(slide.getText(),3);
    ```
   so as we support more presentation format, this class is going to get so much knowledge
   so much knowledge that really belong somewhere else