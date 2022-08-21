/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.web.identity.utils;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 */
public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;

	private final String jwttoken;
	
	private String username;
	
	private List<String> roles;

	public AuthenticationResponse(String jwttoken,String username,List<String> roles) {
		this.jwttoken = jwttoken;
		this.username = username;
		this.roles = roles;
	}

    public AuthenticationResponse(String jwt) {
        this.jwttoken = jwt;
    }

	public String getToken() {
		return this.jwttoken;
	}

	public String getUsername() {
		return username;
	}

	public List<String> getRoles() {
		return roles;
	}

}