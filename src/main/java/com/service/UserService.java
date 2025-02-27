package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);

    List<User> findAllUsers();
}
