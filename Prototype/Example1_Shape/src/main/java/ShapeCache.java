import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        return shapeHashtable.get((shapeId));
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(), circle);

        Sqaure sqaure = new Sqaure();
        sqaure.setId("2");
        shapeHashtable.put(sqaure.getId(), sqaure);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashtable.put(rectangle.getId(), rectangle);
    }
}
