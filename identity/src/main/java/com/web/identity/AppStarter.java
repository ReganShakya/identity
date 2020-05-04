/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.identity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author regan
 */
@SpringBootApplication
public class AppStarter {
    public static void main(String[] args){
        SpringApplication.run(AppStarter.class, args);
        
        BCryptPasswordEncoder encoder=
                new BCryptPasswordEncoder();
        System.out.println("password:  " + encoder.encode("identitypassword"));
    }
}
