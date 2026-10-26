package com.tesing.tesing.service;

import com.tesing.tesing.model.User;
import com.tesing.tesing.repository.UserRepo;
import org.springframework.stereotype.Service;
import com.tesing.tesing.exception.UserNotFoundException;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User findUserById(String id) {
        return userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }
}
