import java.util.Hashtable;

public class BasicCarCache {

    private Hashtable<String, BasicCar> hashtable = new Hashtable<>();

    public BasicCar getBasicCar(String type) {
        if(hashtable.containsKey(type))
            return hashtable.get(type).clone();
        return null;
    }


}
