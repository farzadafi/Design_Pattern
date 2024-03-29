package item.drink;

import item.Item;
import packing.Bottle;
import packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}