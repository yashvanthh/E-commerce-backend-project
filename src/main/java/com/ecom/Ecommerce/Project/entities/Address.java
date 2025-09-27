package com.ecom.Ecommerce.Project.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
}
