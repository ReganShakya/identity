/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.web.identity.utils;

import javax.validation.constraints.NotEmpty;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 */
public class AuthenticationRequest {

	@NotEmpty
	private String username;

	@NotEmpty
	private String password;

	public AuthenticationRequest() {
	}
	
	public AuthenticationRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

