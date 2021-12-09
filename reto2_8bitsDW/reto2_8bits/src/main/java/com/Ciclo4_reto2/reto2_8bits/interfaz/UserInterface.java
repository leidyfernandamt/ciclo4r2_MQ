package com.Ciclo4_reto2.reto2_8bits.interfaz;

import com.Ciclo4_reto2.reto2_8bits.Model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lei20
 */
public interface UserInterface extends MongoRepository<User, Integer>{

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
}

