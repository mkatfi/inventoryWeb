package com.phegondev.InventoryWeb.repositories;

import com.phegondev.InventoryWeb.models.Category;
import com.phegondev.InventoryWeb.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
