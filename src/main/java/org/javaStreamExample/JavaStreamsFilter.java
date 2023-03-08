package org.javaStreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.Integer;
import java.lang.Float;

public class JavaStreamsFilter {

    public static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        productList.add(new Product(1, "Hp", 1000f));
        productList.add(new Product(2, "Hp1", 10003f));
        productList.add(new Product(3, "Hp2", 10004f));

        withoutStreamAPI();

    }

    private static void withoutStreamAPI() {
        // without Stream API's
        List<Float> productPriceList = new ArrayList<Float>();
        // filtering data of list
        for (Product product : productList) {
            if (product.getPrice() > 100) {
                // adding price to a productPriceList
                productPriceList.add(product.getPrice());
            }
        }

        // displaying data
        for (Float price : productPriceList) {
            System.out.println(price);
        }
    }
}