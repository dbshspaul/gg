package com.gg.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserDetails
 *
 */
@Entity

public class UserDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public UserDetails() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private boolean isActive;
	@Lob
	private byte[] profilePictute;

	@ManyToOne@JoinColumn(name = "userId")
	private Users users;

}
