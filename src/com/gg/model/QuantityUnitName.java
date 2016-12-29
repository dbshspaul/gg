package com.gg.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: QuantityUnitName
 *
 */
@Entity

public class QuantityUnitName implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public QuantityUnitName() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private boolean isActive;
	
	@ManyToOne@JoinColumn(name="quantityUnitTypeId")	
	private QuantityUnitType quantityUnitType;
   
}
