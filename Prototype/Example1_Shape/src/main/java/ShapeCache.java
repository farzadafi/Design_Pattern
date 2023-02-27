import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        return shapeHashtable.get((shapeId));
    }
}
