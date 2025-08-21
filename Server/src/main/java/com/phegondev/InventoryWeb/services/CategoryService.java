package com.phegondev.InventoryWeb.services;

import com.phegondev.InventoryWeb.dtos.CategoryDTO;
import com.phegondev.InventoryWeb.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
