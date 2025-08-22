package com.phegondev.InventoryWeb.services;

import com.phegondev.InventoryWeb.dtos.Response;
import com.phegondev.InventoryWeb.dtos.TransactionRequest;
import com.phegondev.InventoryWeb.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);

}


