package com.example.conference.service;

import com.example.conference.model.User;
import com.example.conference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }
}
