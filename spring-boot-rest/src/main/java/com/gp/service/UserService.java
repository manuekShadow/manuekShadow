package com.gp.service;

import com.gp.model.User;
import com.gp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User get(long userId) {
        return repository.findOne(userId);
    }

    public List<User> list() {
        Iterable<User> users = repository.findAll();
        List<User> list = new ArrayList<User>();
        users.forEach(list::add);
        return list;
    }

    public User create(User user) {
        return repository.save(user);
    }
}
