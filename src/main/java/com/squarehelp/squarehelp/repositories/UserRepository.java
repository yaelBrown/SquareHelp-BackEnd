package com.squarehelp.squarehelp.repositories;


import com.squarehelp.squarehelp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUserName(String username);
}
