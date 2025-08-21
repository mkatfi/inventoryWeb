package com.phegondev.InventoryWeb.repositories;

import com.phegondev.InventoryWeb.models.Supplier;
import com.phegondev.InventoryWeb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
