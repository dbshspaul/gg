package com.gg.managebean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "navigation")
public class NavigationBean {
	public String navigateMain() {
		return "main";
	}

	public String navigateAddUser() {
		return "user";
	}

	public String navigateProductAdmin(){
		return "productAdmin";
	}
}
