package com.ecom.Ecommerce.Project.services;


import com.ecom.Ecommerce.Project.entities.Product;
import com.ecom.Ecommerce.Project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private  ProductRepository productRepo;




    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepo.findById(id);
    }

    public Product updateProduct(Product product, Long id) {
        Optional<Product> existProduct=productRepo.findById(id);
        if (!existProduct.isPresent()){
            return null;
        }
        Product updatePro= existProduct.get();
        updatePro.setName(product.getName());
        updatePro.setDescription(product.getDescription());
        updatePro.setPrice(product.getPrice());
        updatePro.setStock(product.getStock());

        return productRepo.save(updatePro);
    }


    public void deleteProduct(Long id) {
       productRepo.deleteById(id);
    }
}
