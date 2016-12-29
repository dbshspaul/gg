package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PurchaseDetails
 *
 */
@Entity

public class PurchaseDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public PurchaseDetails() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
