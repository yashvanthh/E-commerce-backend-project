package com.ecom.Ecommerce.Project.repositories;

import com.ecom.Ecommerce.Project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
