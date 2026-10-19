package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add (new DigitalProduct( 1L, "E-book", 9.99, "/d1/1", 4.2));
        products.add (new PhysicalProduct(2L, "Book", 12.99, "15x3x30", 0.8));
    }

    public List<Product> getAllProducts() {

        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }



    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p->p.getId().equals(id))
                .findFirst();
    }


    public void deleteProduct(Long id){
        products.removeIf(p->p.getId().equals(id));
    }

    public List<Product> findByName(String name){
        return products.stream()
                .filter(p->p.getName().contains(name))
                .toList();
    }



}
