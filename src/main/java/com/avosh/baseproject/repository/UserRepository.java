package com.avosh.baseproject.repository;


import com.avosh.baseproject.entity.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<UserEntity, Integer> {

    Optional<UserEntity> findByUser(String User);

}
