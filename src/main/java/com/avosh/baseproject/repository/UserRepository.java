package com.avosh.baseproject.repository;



import com.avosh.baseproject.entity.SecUser;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<SecUser, Integer> {

    SecUser findByEmail(String email);

}
