package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stock
 *
 */
@Entity

public class Stock implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Stock() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
