package com.example.openbootcampjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.openbootcampjwt.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
