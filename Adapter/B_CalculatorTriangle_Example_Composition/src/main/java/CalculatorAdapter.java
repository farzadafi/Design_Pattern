public class CalculatorAdapter implements Calculator{

    private final Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        CalculatorImpel calculatorImpel = new CalculatorImpel();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = triangle.base;
        rectangle1.width = 0.5 * triangle.height;
        return calculatorImpel.getArea(rectangle1);
    }
}
