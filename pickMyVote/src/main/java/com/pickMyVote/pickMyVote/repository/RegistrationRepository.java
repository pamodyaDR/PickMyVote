package com.pickMyVote.pickMyVote.repository;

import com.pickMyVote.pickMyVote.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);      //just declare in interface
    public User findByEmailAndPassword(String email, String password);
}

