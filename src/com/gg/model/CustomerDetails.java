package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CustomerDetails
 *
 */
@Entity

public class CustomerDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public CustomerDetails() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
