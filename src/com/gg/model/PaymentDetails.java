package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PaymentDetails
 *
 */
@Entity

public class PaymentDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public PaymentDetails() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
