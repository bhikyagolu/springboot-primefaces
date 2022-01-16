package com.avosh.baseproject.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    CustomUserDetailService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println(passwordEncoder.encode("pass"));
        auth.userDetailsService(userDetailsService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Disabled for development
        http.authorizeRequests()
                .antMatchers("/").permitAll()
//                .antMatchers("/s/**").hasAnyRole("user")
                .antMatchers("/user").hasAnyRole("user")
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/ws/**").permitAll()
                .antMatchers("/actuator/**").permitAll()
                .antMatchers("/swagger-ui/**").permitAll()
                .antMatchers("/ns/**").permitAll()
                .and()
                .csrf().disable()
                .formLogin()
                .loginPage("/ns/login.xhtml").permitAll()
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/s/dashboard.xhtml")
                .failureUrl("/ns/login.xhtml?error=true")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .deleteCookies("JSESSIONID").permitAll()
                .and().rememberMe();
    }

//        http.authorizeRequests()
//                .antMatchers("/").anonymous()
////                .antMatchers("/s/**").hasAnyRole("user")
//                .antMatchers("/user").hasAnyRole("user")
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("/ws/**").permitAll()
//                .antMatchers("/actuator/**").permitAll()
//                .antMatchers("/swagger-ui/**").permitAll()
//                .antMatchers("/ns/**").permitAll()
//                .and().formLogin().loginPage("/ns/login.xhtml").permitAll()
//                .defaultSuccessUrl("/s/dashboard.xhtml", true)
//                .failureUrl("/ns/login.xhtml?error=true")
//                .and()
//                .logout()
//                .logoutUrl("/logout")
////                .deleteCookies("JSESSIONID").permitAll()
//                .and().rememberMe();
//        http.csrf().disable();
//    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}