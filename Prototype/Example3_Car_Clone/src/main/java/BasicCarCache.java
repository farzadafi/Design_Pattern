import car.BasicCar;
import car.Ford;
import car.Nano;

import java.util.Hashtable;

public class BasicCarCache {

    private final Hashtable<String, BasicCar> hashtable = new Hashtable<>();

    {
        hashtable.put("ford", new Ford("ford", 4000L));
        hashtable.put("nano", new Nano("nano", 5000L));
    }

    public BasicCar getBasicCar(String type) {
        if (hashtable.containsKey(type))
            return hashtable.get(type).clone();
        return null;
    }
}
