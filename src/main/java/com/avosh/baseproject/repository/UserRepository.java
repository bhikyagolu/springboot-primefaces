package com.avosh.baseproject.repository;


import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.SecUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends BaseRepository<SecUser, Long> {

    SecUser findByEmail(String email);

    SecUser findByCellphone(String cellphone);

    @Transactional
    @Modifying
    @Query("UPDATE SecUser s SET s.password = :newPassword WHERE s.id = :id")
    void updatePassword(@Param("newPassword") String newPassword, @Param("id") Long id);


    @Transactional
    @Modifying
    @Query("UPDATE SecUser s SET s.phone = :#{#userDto.phone} , s.address = :#{#userDto.address}  WHERE s.id = :#{#userDto.id}")
    void updateContact(@Param("userDto") UserDto userDto);

    @Transactional
    @Modifying
    @Query("UPDATE SecUser s SET s.name = :#{#userDto.name} , s.family = :#{#userDto.family} , s.nationalcode = :#{#userDto.nationalcode} " +
            ", s.iban = :#{#userDto.iban} , s.about = :#{#userDto.about} , s.gender = :#{#userDto.gender} WHERE s.id = :#{#userDto.id}")
    Integer updateProfile(@Param("userDto") UserDto userDto);
}
