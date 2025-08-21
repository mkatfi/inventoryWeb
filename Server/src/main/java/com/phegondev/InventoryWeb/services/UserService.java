package com.phegondev.InventoryWeb.services;

import com.phegondev.InventoryWeb.dtos.LoginRequest;
import com.phegondev.InventoryWeb.dtos.RegisterRequest;
import com.phegondev.InventoryWeb.dtos.Response;
import com.phegondev.InventoryWeb.dtos.UserDTO;
import com.phegondev.InventoryWeb.models.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);


}

