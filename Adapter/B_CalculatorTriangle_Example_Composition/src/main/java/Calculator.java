public interface Calculator {
    double getArea(Rectangle rectangle);
}

class CalculatorImpel implements Calculator {

    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
