/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.repository;


import com.avosh.baseproject.entity.SecUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends BaseRepository<SecUserRole, Long> {
    List<SecUserRole> findBySecUserId(Long id);

}
