package item.burger;

import item.Item;
import packing.Packing;
import packing.Wrapper;

public abstract class Burger implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}