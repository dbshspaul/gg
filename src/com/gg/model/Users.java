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
	private String urerName;
	private String email;
	private String mobile;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private boolean isActive;

	@OneToMany(mappedBy = "users")
	private List<UserDetails> userDetailses;
}
