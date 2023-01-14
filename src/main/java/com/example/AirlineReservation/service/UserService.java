package com.example.AirlineReservation.service;


import com.example.AirlineReservation.model.User;
import com.example.AirlineReservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    User addUser(User u);
}
