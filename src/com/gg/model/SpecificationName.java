package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpecificationName
 *
 */
@Entity

public class SpecificationName implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public SpecificationName() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
