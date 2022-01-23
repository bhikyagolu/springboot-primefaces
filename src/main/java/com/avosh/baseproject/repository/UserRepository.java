package com.avosh.baseproject.repository;



import com.avosh.baseproject.entity.SecUserEntity;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<SecUserEntity, Integer> {

    SecUserEntity findByEmail(String email);

}
