package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpecificationDetails
 *
 */
@Entity

public class SpecificationDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public SpecificationDetails() {
		super();
	}
   
	@Id@GeneratedValue
	private int id;
}
