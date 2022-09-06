package com.example.spring.boot.redis.example.repository;

import com.example.spring.boot.redis.example.model.User;

import java.util.List;

public interface UserDao {

    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);

}
