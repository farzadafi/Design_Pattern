public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 10);
        Calculator calculatorAdapter = new CalculatorAdapter(triangle);
        System.out.println(calculatorAdapter.getArea(null));
    }
}
