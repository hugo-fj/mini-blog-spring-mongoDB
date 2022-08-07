package br.com.techugo.apiminiblog.services;

import br.com.techugo.apiminiblog.domain.User;
import br.com.techugo.apiminiblog.repository.UserRepository;
import br.com.techugo.apiminiblog.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        return repo.findById(id)
                    .orElseThrow(() -> new ObjectNotFoundException("Usuário não existe"));
    }
}
