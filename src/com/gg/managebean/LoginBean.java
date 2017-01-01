package com.gg.managebean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.gg.util.ManageSession;

@ManagedBean(name="login")
public class LoginBean {
	private String username;
	private String password;
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

	public String getCheckLogin(){
		if(username.equals("admin")&& password.equals("admin")){
			ManageSession.getSession().setAttribute("username", username);
			return "main";
		}else {
			ManageSession.getSession().removeAttribute("username");
			 FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login failed", "Invalid username/password");
		        FacesContext.getCurrentInstance().addMessage("msg", facesMsg);
			return "login";
		}
	}
	
	public String logout(){
		ManageSession.getSession().removeAttribute("username");
		return "login";
	}
}
