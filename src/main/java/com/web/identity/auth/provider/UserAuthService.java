/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.identity.auth.provider;

import com.web.identity.auth.entity.Role;
import com.web.identity.auth.entity.User;
import com.web.identity.auth.repository.RoleRepository;
import com.web.identity.auth.repository.UserRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author regan
 */
@Service
public class UserAuthService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RoleRepository roleRepository;
            
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user=userRepository.findByUserName(username);
        if(user==null){
            throw new UsernameNotFoundException(username + " does not exit");
        }
        AuthUser authUser = new AuthUser(username, user.getPassword(), getAuthorities(username));
        return authUser;
    }
    
    private Collection<?extends GrantedAuthority> getAuthorities(String username){
        List<SimpleGrantedAuthority> roles=
                new ArrayList<>();
        User user=userRepository.findByUserName(username);
        
        Role role=roleRepository
                .findById(user.getRole().getId()).get();        
        roles.add(new SimpleGrantedAuthority(role.getName()));
        return roles;
    }    
}
