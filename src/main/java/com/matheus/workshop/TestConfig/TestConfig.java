package com.matheus.workshop.TestConfig;

import com.matheus.workshop.Model.Users;
import com.matheus.workshop.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        Users u1 = new Users(null, "Maria Brown", "maria@gmail.com", "1196178914", "123456");
        Users u2 = new Users(null, "Junior Brown", "junior@gmail.com", "1196178914", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
