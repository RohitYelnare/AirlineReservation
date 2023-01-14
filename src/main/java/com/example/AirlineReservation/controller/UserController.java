package com.example.AirlineReservation.controller;


import com.example.AirlineReservation.model.User;
import com.example.AirlineReservation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/v1/api")
@CrossOrigin
public class UserController {

    @Autowired
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/loginUser")
    public User loginUser(@RequestParam(value = "email", required = true) String email,
                          @RequestParam(value = "password", required = true) String password) {
        List<User> allUsers = userService.getAllUsers();

        for(User u: allUsers) {
            if(Objects.equals(u.getEmail(), email) && Objects.equals(u.getPassword(), password)) {
                return u;
            }
        }

        return null;
    }
    @PostMapping("/signup")
    public User signupUser(@RequestBody User u) {
        return userService.addUser(u);
    }
}
