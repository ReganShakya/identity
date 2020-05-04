/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.identity.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author regan
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @GetMapping
    public String login(){
        return "login";
    }
    
    @GetMapping(value = "/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:login";
    }
}
