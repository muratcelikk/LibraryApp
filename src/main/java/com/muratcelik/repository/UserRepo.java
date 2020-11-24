package com.muratcelik.repository;

import com.muratcelik.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository < User, Long > {
    User findByEmail(String email);
}
