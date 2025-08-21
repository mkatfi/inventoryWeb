package com.phegondev.InventoryWeb.services;

import com.phegondev.InventoryWeb.dtos.Response;
import com.phegondev.InventoryWeb.dtos.SupplierDTO;

public interface SupplierService {


    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);
}
