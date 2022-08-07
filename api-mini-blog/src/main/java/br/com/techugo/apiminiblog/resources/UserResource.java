package br.com.techugo.apiminiblog.resources;

import br.com.techugo.apiminiblog.domain.User;

import br.com.techugo.apiminiblog.dto.UserDTO;
import br.com.techugo.apiminiblog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
   // public ResponseEntity<List<User>> findAll(){
       // List<User> list = service.findAll();
       // return ResponseEntity.ok().body(list);
     public List<UserDTO>findAll(){
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return listDto;
        //return this.service.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable String id){
        return this.service.findById(id);
    }
}
