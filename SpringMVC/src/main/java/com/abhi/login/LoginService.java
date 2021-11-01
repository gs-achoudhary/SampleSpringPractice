package com.abhi.login;


import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String name, String password) {
		return name.equalsIgnoreCase("abhi") && password.equals("1234");
	}

}
