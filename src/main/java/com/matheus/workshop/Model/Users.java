package com.matheus.workshop.Model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}

