/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.Device;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends BaseRepository<Device, Long> {

    Device findByTokenAndMac(String token, String mac);

    Device findByToken(String token);

    Long deleteByToken(String token);

}
