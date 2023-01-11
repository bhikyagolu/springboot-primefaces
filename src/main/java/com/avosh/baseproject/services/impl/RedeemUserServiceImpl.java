/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.dto.RedeemUserDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Redeem;
import com.avosh.baseproject.entity.RedeemUser;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.RedeemUserRepository;
import com.avosh.baseproject.services.RedeemUserService;
import com.avosh.baseproject.util.Empty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class RedeemUserServiceImpl implements RedeemUserService {
    private static final Logger log = Logger.getLogger(RedeemUserServiceImpl.class);

    @Autowired
    private RedeemUserRepository repository;

    @Override
    public void save(RedeemUserDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        RedeemUser redeemUser = new RedeemUser();
        Redeem redeem = new Redeem();
        redeem.setId(dto.getId());
        redeemUser.setRedeemId(redeem);
        redeemUser.setId(dto.getId());
        redeemUser.setSecUserId(new SecUser(auth.getSecUser().getId()));
        if (Empty.isEmpty(dto.getCreateDate())) {
            redeemUser.setCreateDate(new Date());
        }
        repository.save(redeemUser);
    }

    @Override
    public List<RedeemUserDto> retrieveAll() {
        List<RedeemUserDto> list = new ArrayList<>();
        Iterable<RedeemUser> itr = repository.findAll();
        for (RedeemUser redeemUser : itr) {
            UserDto userDto = new UserDto();
            userDto.setId(redeemUser.getSecUserId().getId());
            userDto.setName(redeemUser.getSecUserId().getName());
            userDto.setFamily(redeemUser.getSecUserId().getFamily());


            RedeemDto redeemDto = new RedeemDto();
            redeemDto.setId(redeemUser.getRedeemId().getId());
            redeemDto.setCode(redeemUser.getRedeemId().getCode());
            redeemDto.setDesc(redeemUser.getRedeemId().getDesc());


            RedeemUserDto redeemUserDto = new RedeemUserDto(redeemUser.getId(), redeemUser.getCreateDate(), redeemDto, userDto);
            list.add(redeemUserDto);
        }
        return list;
    }

    @Override
    public RedeemUserDto retrieveById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
