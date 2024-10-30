package com.example.demo.controller;

import com.example.demo.DTO.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/initial")
public class InitialController {

    private UserService userService;
    @Autowired
    public InitialController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public User getUser(@RequestParam Integer id){
        return userService.getUser(id);
    }
   @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user){

   }

}
