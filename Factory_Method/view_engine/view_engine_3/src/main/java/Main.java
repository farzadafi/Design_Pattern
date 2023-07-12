package main.java;

import main.java.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.listProduct();
    }
}
