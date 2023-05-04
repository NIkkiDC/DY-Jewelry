package com.JavaBook.JavaBook.repository;

import com.JavaBook.JavaBook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // register


    boolean existsByEmailAddress(String emailAddress);

    // login
   User findUserByEmailAddress(String emailAddress);
}
