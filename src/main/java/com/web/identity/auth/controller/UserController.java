package com.web.identity.auth.controller;

import com.web.identity.auth.entity.User;
import com.web.identity.auth.repository.RoleRepository;
import com.web.identity.core.controller.CRUDController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 22, 2022
 */
@Controller
@RequestMapping(value="/users")
public class UserController 
        extends CRUDController<User, Integer>{
    
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    public UserController() {
        super("User","auth","users");
        this.viewPath="users";
    }

    @Override
    public String create(Model model) {
        model.addAttribute("roles", roleRepository.findAll());
        return super.create(model); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(@PathVariable("id")Integer id, Model model) {
        model.addAttribute("roles", roleRepository.findAll());
        return super.edit(id, model); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String save(User entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }
        
}