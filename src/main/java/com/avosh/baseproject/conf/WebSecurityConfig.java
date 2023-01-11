package com.avosh.baseproject.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    CustomUserDetailService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Disabled for development
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/s/**").hasAnyRole("USER")
                .antMatchers("/user").hasAnyRole("USER")
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/javax.faces.resource/**").permitAll()
                .antMatchers("/service/**").permitAll()
                .antMatchers("/ws/**").permitAll()
                .antMatchers("/actuator/**").hasAnyRole("ADMIN")
                .antMatchers("/swagger-ui/**").hasAnyRole("ADMIN")
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
                .and()
                .rememberMe().key("uniqueAndSecret")
        ;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}