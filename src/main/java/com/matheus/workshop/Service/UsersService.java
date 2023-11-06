package com.matheus.workshop.Service;

import com.matheus.workshop.Model.Users;
import com.matheus.workshop.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> findAll() {
        return  userRepository.findAll();
    }
}
