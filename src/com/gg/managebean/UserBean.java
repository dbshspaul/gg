package com.gg.managebean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.gg.model.Users;
import com.gg.transaction.Ejb;

@ManagedBean(name="user")
public class UserBean {
	@EJB
	private Ejb ejb;
	
	private Users user;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	public String addUser() {
		return "main";
	}
}
