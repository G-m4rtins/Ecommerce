package com.example.ecommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ecommerce.demo.model.enums.Role;
import com.example.ecommerce.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/registro")
    public ResponseEntity getRegistro(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        return ResponseEntity.ok().body("Registro obtenido");
    }

    @PostMapping("/registro")
    public ResponseEntity postRegistro(@RequestParam String name, @RequestParam String email, @RequestParam String password, @RequestParam Role Role) {
        userService.registerUser(name, email, password, Role);
        return ResponseEntity.ok().body("Usuario registrado");
    }
    


}
