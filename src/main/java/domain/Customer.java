package domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final long id;
    private final String name;
    private List<Product> products;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
        products = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
