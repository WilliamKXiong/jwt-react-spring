package com.jwt.jwt;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwt;

	//return ResponseEntity.ok(new AuthenticationResponse(jwt)); //HomePageController
	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}

	public String getToken() {
		return this.jwt;
	}

}
