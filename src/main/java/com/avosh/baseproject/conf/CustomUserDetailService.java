package com.avosh.baseproject.conf;


import com.avosh.baseproject.entity.UserEntity;
import com.avosh.baseproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
         Optional<UserEntity> user = userRepository.findByUser(s);

        return user.map(CustomUserDetail::new).get();
    }
}
