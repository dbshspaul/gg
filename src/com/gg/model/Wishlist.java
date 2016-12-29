package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Wishlist
 *
 */
@Entity

public class Wishlist implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Wishlist() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
