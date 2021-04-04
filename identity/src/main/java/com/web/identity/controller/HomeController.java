/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.identity.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author regan
 */
@Controller
@RequestMapping
public class HomeController {
    
    private static final Logger LOG = Logger.getLogger(HomeController.class);
    
    @GetMapping(value = {"/","/home"})
    public String index(){
        LOG.info("User logged in.");
        return "index";
    }
}
