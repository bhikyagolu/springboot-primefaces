/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.repository;


import com.avosh.baseproject.entity.SecUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends BaseRepository<SecUserRole, Long> {
    SecUserRole findBySecUserId(Long id);

}
