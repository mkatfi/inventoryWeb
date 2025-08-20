package com.phegondev.InventoryWeb.repositories;

import com.phegondev.InventoryWeb.models.Supplier;
import com.phegondev.InventoryWeb.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionRepository extends JpaRepository<Transaction, Long> , JpaSpecificationExecutor<Transaction> {
}
