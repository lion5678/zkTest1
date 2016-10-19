package com.model;

public class LoginModel {

	public LoginModel(){
		
	}
	
	public boolean login(String id, String pwd){
		if("aa".equals(id) && "11".equals(pwd))
			return true;
		return false;
	}
}
