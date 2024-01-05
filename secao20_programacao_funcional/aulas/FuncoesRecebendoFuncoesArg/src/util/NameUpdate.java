package util;

import entities.Product;

import java.util.function.Function;

public class NameUpdate implements Function<Product, String> {
    @Override
    public String apply(Product s) {
        return s.getName().toUpperCase();
    }
}
