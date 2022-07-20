package com.hackthon.codestars.CheckBalanceApp.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomeUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("jayshri")){
            return new User("jayshri","jayshri123",new ArrayList<>());
        }
        else{
            throw new UsernameNotFoundException("user not found");
        }
    }
}
