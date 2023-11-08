package com.matheus.workshop.app.service;

import com.matheus.workshop.domain.model.Users;
import com.matheus.workshop.infra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> findAll() {
        return  userRepository.findAll();
    }

    public Users findById(Long id){
        Optional<Users> obj = userRepository.findById(id);
        return obj.get();
    }
}
