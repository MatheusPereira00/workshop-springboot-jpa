package com.matheus.workshop.Controller;

import com.matheus.workshop.Model.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @GetMapping
    public ResponseEntity<Users> findAll() {
        Users u = new Users(1L, "Maria", "maria@email.com", "11961568913", "12345");
        return ResponseEntity.ok().body(u);
    }
}
