package Prototype.Car_Clone.src.main.java;

import Prototype.Car_Clone.src.main.java.car.BasicCar;
import Prototype.Car_Clone.src.main.java.car.Ford;
import Prototype.Car_Clone.src.main.java.car.Nano;

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
