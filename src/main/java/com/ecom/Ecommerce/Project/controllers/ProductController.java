package com.ecom.Ecommerce.Project.controllers;


import com.ecom.Ecommerce.Project.entities.Product;
import com.ecom.Ecommerce.Project.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }


    @GetMapping("products/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){

        return productService.getProductById(id);
    }

    @PutMapping("products/{id}")
    public Product updateProduct(@RequestBody Product product,@PathVariable Long id){
            return productService.updateProduct(product,id);
        }

    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
