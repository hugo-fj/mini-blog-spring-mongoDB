package br.com.techugo.apiminiblog.repository;

import br.com.techugo.apiminiblog.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
