package com.gg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: QuantityUnitType
 *
 */
@Entity

public class QuantityUnitType implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public QuantityUnitType() {
		super();
	}
 
	@Id@GeneratedValue
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private boolean isActive;
	
	@OneToMany(mappedBy="quantityUnitType")	
	private List<QuantityUnitName> quantityUnitNames;
}
