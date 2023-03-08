import color.Blue;
import color.Green;
import shape.Circle;
import shape.Shape;
import shape.Square;

public class Client {
    public static void main(String[] args) {
        Blue blue = new Blue();
        Shape blueCircle = new Circle(blue);
        blueCircle.applyColor();
        blueCircle.draw();

        System.out.println();
        Green green = new Green();
        Shape greenSquare = new Square(green);
        greenSquare.applyColor();
        greenSquare.draw();
    }
}
