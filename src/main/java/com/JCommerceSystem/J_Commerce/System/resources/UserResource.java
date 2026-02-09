package com.JCommerceSystem.J_Commerce.System.resources;

import com.JCommerceSystem.J_Commerce.System.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll () {
        User u = new User(1L, "Juan", "juan@gmail.com", "987654321", "123456" );
        return ResponseEntity.ok().body(u);
    }
}
