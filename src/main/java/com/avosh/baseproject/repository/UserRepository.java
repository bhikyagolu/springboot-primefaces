package com.avosh.baseproject.repository;



import com.avosh.baseproject.entity.SecUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<SecUser, Long> {

    SecUser findByEmail(String email);

    @Query("UPDATE SecUser SET password = :newPassword WHERE id = :id")
    void updatePassword(String newPassword, Long id);

}
