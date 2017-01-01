package com.gg.managebean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "navigation")
public class NavigationBean {
	public String navigateAddUser() {
		return "user";
	}
}
