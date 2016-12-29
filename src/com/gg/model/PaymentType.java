package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PaymentType
 *
 */
@Entity

public class PaymentType implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public PaymentType() {
		super();
	}
	
	@Id@GeneratedValue
	private int id;
   
}
