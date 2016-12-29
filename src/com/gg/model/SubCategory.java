package com.gg.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubCategory
 *
 */
@Entity

public class SubCategory implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public SubCategory() {
		super();
	}
   
	@Id@GeneratedValue
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private boolean isActive;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
}
