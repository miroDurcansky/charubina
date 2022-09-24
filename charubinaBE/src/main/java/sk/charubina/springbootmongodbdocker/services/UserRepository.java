package sk.charubina.springbootmongodbdocker.services;

import sk.charubina.springbootmongodbdocker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
