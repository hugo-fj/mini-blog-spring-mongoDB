package br.com.techugo.apiminiblog.services;

import br.com.techugo.apiminiblog.domain.User;
import br.com.techugo.apiminiblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
