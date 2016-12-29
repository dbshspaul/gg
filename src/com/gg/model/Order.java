package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity

public class Order implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Order() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
