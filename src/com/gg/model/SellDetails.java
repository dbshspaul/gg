package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SellDetails
 *
 */
@Entity

public class SellDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public SellDetails() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
