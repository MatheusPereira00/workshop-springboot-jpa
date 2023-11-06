package com.matheus.workshop.Repository;

import com.matheus.workshop.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Long> {
}
