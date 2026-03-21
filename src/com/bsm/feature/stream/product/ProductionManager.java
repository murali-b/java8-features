package com.bsm.feature.stream.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductionManager {
    private static List< Product > productsList = new ArrayList< Product >();
    static void main(String[] args) {

            // Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
        productsList.add(new Product(6, "Apple Laptop", 190000f));

          /* Map<String,Double> prodNameAndSalary = productsList.stream().
                   collect(Collectors.toMap(prod->prod.getName(),prod->(double)prod.getPrice()));
        System.out.println(prodNameAndSalary);*/
        Map<String,Double> prodGroup = productsList.stream().
                collect(Collectors.groupingBy(Product::getName,Collectors.summingDouble(Product::getPrice)));
        System.out.println(prodGroup);

    }
}
