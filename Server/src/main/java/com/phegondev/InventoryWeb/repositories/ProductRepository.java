package com.phegondev.InventoryWeb.repositories;

import com.phegondev.InventoryWeb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> FindByNameContainingOrDescriptionContaining(String name, String description);
}
