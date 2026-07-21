package com.example.SpringBootDemo.Controller;

import com.example.SpringBootDemo.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @GetMapping("/getproducts")
    public List<Product> getProduct() {
        return List.of(
                new Product(1, "Mobile", 43000),
                new Product(2, "Laptop", 65000));
    }

    @GetMapping("/getproductsbyid/{id}")
    public String getProductById(@PathVariable Integer id) {
        return "Searching for Product with the id " + id.toString();
    }

    @GetMapping("/search")
    public String searchQuery(@RequestParam String keyword, @RequestParam(defaultValue = "10") Integer limit) {
        return "Searching for the keyword: " + keyword + ", with the limit: " + limit;
    }

    @PostMapping("createproduct")
    public String createProduct(@RequestBody Product product) {
        return "New Product is Created with name: " + product.getName();
    }
}
