package com.gg.managebean;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.gg.model.Users;
import com.gg.transaction.Ejb;

@ManagedBean(name="user")
public class UserBean {
	@EJB
	private Ejb ejb;
	private Date date=new Date();
	
	private Users user=new Users();

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	public String addUser() {
		return "main";
	}
	
	public void addNewUser(){
		try{
			user.setCreatedDateTime(date);
			user.setActive(true);
			
			if(ejb.getAllEntities(Users.class).stream().anyMatch(u->u.getUserName().equals(user.getUserName()))){
				FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "User name already exist."));
			}else if(ejb.getAllEntities(Users.class).stream().anyMatch(u->u.getEmail().equals(user.getEmail()))){
				FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "User email already exist."));
			}else if(ejb.getAllEntities(Users.class).stream().anyMatch(u->u.getMobile().equals(user.getMobile()))){
				FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "User mobile already exist."));
			}else{
				ejb.setData(getUser());
				FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "User created successfully."));
			}			
						
		}catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "User creation failed", "Can not ctreate new User."));		}
	}
}
