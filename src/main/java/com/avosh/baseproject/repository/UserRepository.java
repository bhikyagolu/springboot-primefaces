package com.avosh.baseproject.repository;



import com.avosh.baseproject.entity.SecUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends BaseRepository<SecUser, Long> {

    SecUser findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE SecUser s SET s.password = :newPassword WHERE s.id = :id")
    void updatePassword(@Param("newPassword")String newPassword,@Param("id") Long id);

}
