package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.User;
import java.utl.Optional
public interface UserRepository extends JpaRepository<User, Long>{
    
}
