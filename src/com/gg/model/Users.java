package com.gg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Users
 *
 */
@Entity
public class Users implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Users() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
	private String userName;
	private String name;
	private String email;
	private String mobile;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private boolean isActive;

	@OneToMany(mappedBy = "users")
	private List<UserDetails> userDetailses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<UserDetails> getUserDetailses() {
		return userDetailses;
	}

	public void setUserDetailses(List<UserDetails> userDetailses) {
		this.userDetailses = userDetailses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
