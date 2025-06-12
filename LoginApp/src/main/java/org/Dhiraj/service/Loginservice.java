package org.Dhiraj.service;

import java.util.HashMap;

import org.Dhiraj.dto.User;



public class Loginservice {
	HashMap<String,String> users=new HashMap<String,String>();
	public Loginservice() {
		users.put("Dhiraj","Dhiraj");
		users.put("Dhiraj","Ghuge");
		users.put("Dhiraj1","learn Java");
		
		
	}
	public boolean authentic(String userId,String Password) {
		if(Password ==null || Password.trim()=="") {
			return false;
		}
		return true;
	}
	 public  User getuserDetails(String userId) {
		 
		 User user = new User();
		    user.setUserName(userId); 
		    user.setUserId(users.get(userId));

		    return user;
	    }
}
