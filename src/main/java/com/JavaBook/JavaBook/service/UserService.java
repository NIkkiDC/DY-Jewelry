package com.JavaBook.JavaBook.service;

import com.JavaBook.JavaBook.exception.InfoExistException;
import com.JavaBook.JavaBook.model.LoginRequest;
import com.JavaBook.JavaBook.model.LoginResponse;
import com.JavaBook.JavaBook.model.User;
import com.JavaBook.JavaBook.repository.UserRepository;
import com.JavaBook.JavaBook.security.JWTUtils;
import com.JavaBook.JavaBook.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private JWTUtils jwtUtils;
    private AuthenticationManager authenticationManager;
    private MyUserDetails myUserDetails;

    @Autowired
    public UserService(UserRepository userRepository, @Lazy PasswordEncoder passwordEncoder, JWTUtils jwtUtils, @Lazy AuthenticationManager authenticationManager, MyUserDetails myUserDetails) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtils = jwtUtils;
        this.authenticationManager = authenticationManager;
        this.myUserDetails = myUserDetails;
    }

    /**
     * Method creates a new registered user.
     * @param userObject
     * @return
     */
    public User createUser (User userObject) {
        if (!userRepository.existsByEmailAddress(userObject.getEmailAddress())) {
            // create new user and encode raw password
            userObject.setPassword(passwordEncoder.encode(userObject.getPassword()));
            return userRepository.save(userObject);
        } else {
            // user already registered and should log in, perhaps?
            throw new InfoExistException("User w/ email address " + userObject.getEmailAddress() + " already exist.");
        }
    }

    /**
     * Method finds and returns user by email address.
     * @param email
     * @return
     */
    public User findUserByEmailAddress(String email) {
        return userRepository.findUserByEmailAddress((email));
    }

    /**
     *
     * @param loginRequest
     * @return
     */
    public ResponseEntity<?> loginUser(LoginRequest loginRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            myUserDetails = (MyUserDetails) authentication.getPrincipal();
            // generate token
            final String JWT = jwtUtils.generateJwtToken(myUserDetails);
            return ResponseEntity.ok(new LoginResponse(JWT));
        } catch (Exception e) {
            return ResponseEntity.ok(new LoginResponse("Error:  username or password is incorrect."));
        }
    }
}