public interface Calculator {
    double getArea(Rectangle rectangle);
}

class CalculatorImpel implements Calculator {

    private Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.lengh * rectangle.width;
    }
}
