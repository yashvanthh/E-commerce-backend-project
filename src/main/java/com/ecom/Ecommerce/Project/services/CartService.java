package com.ecom.Ecommerce.Project.services;

import com.ecom.Ecommerce.Project.entities.Product;
import com.ecom.Ecommerce.Project.entities.User;
import com.ecom.Ecommerce.Project.repositories.ProductRepository;
import com.ecom.Ecommerce.Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    // Add product to cart
    public List<Product> addProductToCart(Long userId, Long productId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        user.getCart().add(product);
        userRepo.save(user);
        return user.getCart();
    }

    // Remove product from cart
    public List<Product> removeProductFromCart(Long userId, Long productId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        user.getCart().remove(product);
        userRepo.save(user);
        return user.getCart();
    }

    // View cart
    public List<Product> viewCart(Long userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        return user.getCart();
    }

    // Clear cart
    public void clearCart(Long userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        user.getCart().clear();
        userRepo.save(user);
    }
}