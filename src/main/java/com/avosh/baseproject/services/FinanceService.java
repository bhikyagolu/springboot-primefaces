/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.FinanceDto;
import com.avosh.baseproject.entity.Finance;
import com.avosh.baseproject.repository.FinanceRepository;

public interface FinanceService extends BaseService<FinanceRepository, Finance, FinanceDto> {
}
