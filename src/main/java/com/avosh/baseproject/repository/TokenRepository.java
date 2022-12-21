/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.Device;
import com.avosh.baseproject.entity.SecUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends BaseRepository<Device, Long> {
   SecUser findByMacAndSecUserIdCellphone(String token,String cellphone);
}
