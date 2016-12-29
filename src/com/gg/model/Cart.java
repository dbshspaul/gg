package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cart
 *
 */
@Entity

public class Cart implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Cart() {
		super();
	}
	@Id@GeneratedValue
	private int id;
   
}
