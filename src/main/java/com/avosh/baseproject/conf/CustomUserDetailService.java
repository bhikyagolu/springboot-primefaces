package com.avosh.baseproject.conf;


import com.avosh.baseproject.dto.SecUserDto;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.entity.SecUserRole;
import com.avosh.baseproject.repository.RoleRepository;
import com.avosh.baseproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        SecUser secUser = userRepository.findByEmail(s);
        SecUserRole secUserRole = roleRepository.findBySecUserId(secUser.getId());


        SecUserDto userDto = new SecUserDto(secUser.getId(),secUser.getName(),secUser.getFamily(),secUser.getGender()
        ,secUser.getCellphone(),secUser.getPhone(),secUser.getEmail(),secUser.getAddress(),secUser.getPassword()
        ,secUser.getNationalcode(),secUser.getIsLogin(),secUser.getIsEnable(),secUser.getLastLogin(),secUser.getCreateDate()
        ,secUser.getUpdateDate(),secUser.getToken());
        CustomUserDetail userDetail = new CustomUserDetail(userDto);
        return userDetail;
    }
}
