package com.avosh.baseproject.repository;



import com.avosh.baseproject.entity.SecUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<SecUser, Long> {

    SecUser findByEmail(String email);

}
