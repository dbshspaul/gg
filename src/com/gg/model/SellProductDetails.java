package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SellProductDetails
 *
 */
@Entity

public class SellProductDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public SellProductDetails() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
