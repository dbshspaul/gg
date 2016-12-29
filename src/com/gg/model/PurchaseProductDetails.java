package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PurchaseProductDetails
 *
 */
@Entity

public class PurchaseProductDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public PurchaseProductDetails() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
