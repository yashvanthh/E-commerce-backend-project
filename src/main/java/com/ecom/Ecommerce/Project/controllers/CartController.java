package com.ecom.Ecommerce.Project.controllers;


import com.ecom.Ecommerce.Project.entities.Cart;
import com.ecom.Ecommerce.Project.entities.Product;
import com.ecom.Ecommerce.Project.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/cart/{userId}/add/{productId}")
    public List<Product> addProductToCart(@PathVariable Long userId, @PathVariable Long productId){
        return cartService.addProductToCart(userId, productId);
    }

    @DeleteMapping("/cart/{userId}/remove/{productId}")
    public List<Product> removeProductFromCart(@PathVariable Long userId, @PathVariable Long productId){
        return cartService.removeProductFromCart(userId, productId);
    }

    @GetMapping("/cart/{userId}")
    public List<Product> viewCart(@PathVariable Long userId){
        return cartService.viewCart(userId);
    }

    @DeleteMapping("/cart/{userId}/clear")
    public void clearCart(@PathVariable Long userId){
        cartService.clearCart(userId);
    }
}


