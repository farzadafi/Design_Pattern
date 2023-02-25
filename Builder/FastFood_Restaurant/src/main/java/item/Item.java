package item;

import packing.Packing;

public interface Item {
   String name();
   Packing packing();
   float price();
}