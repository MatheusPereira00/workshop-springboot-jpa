package com.matheus.workshop.app.controller;

import com.matheus.workshop.domain.model.Users;
import com.matheus.workshop.app.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public ResponseEntity<List<Users>> findAll() {
        List<Users> list = usersService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id){
        Users obj = usersService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
