package edu.by.controller;

import edu.by.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sukora Stas.
 */
@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        products.add(new Product(1L, "Audi", "rs6", 99000.0));
        products.add(new Product(1L, "Mazda", "6", 15000.4));
        return products;
    }
}
