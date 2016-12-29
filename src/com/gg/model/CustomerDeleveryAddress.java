package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CustomerDeleveryAddress
 *
 */
@Entity

public class CustomerDeleveryAddress implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public CustomerDeleveryAddress() {
		super();
	}
	@Id@GeneratedValue
	private int id;
   
}
