package br.com.techugo.apiminiblog.resources;

import br.com.techugo.apiminiblog.domain.User;

import br.com.techugo.apiminiblog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
   // public ResponseEntity<List<User>> findAll(){
       // List<User> list = service.findAll();
       // return ResponseEntity.ok().body(list);
     public List<User>findAll(){
        return this.service.findAll();
    }
}
