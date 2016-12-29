package com.gg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
public class Category implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Category() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private boolean isActive;

	@OneToMany(mappedBy = "category")
	private List<SubCategory> subCategories;
}
