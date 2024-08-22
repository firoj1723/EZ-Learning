package com.ezlearning.platform.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class OrderPay {
	    
	    @Id
		@GeneratedValue /* (strategy = GenerationType.AUTO) */
	    private long id;
	    private double price = 50;
	    private String currency = "USD";
	    private String method;
	    private String intent = "sale";
	    private String description = "Payment";
	    
		public OrderPay() {
			
		}
		
		
		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getMethod() {
			return method;
		}
		public void setMethod(String method) {
			this.method = method;
		}
		public String getIntent() {
			return intent;
		}
		public void setIntent(String intent) {
			this.intent = intent;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}

		public OrderPay(double price, String currency, String method, String intent, String description) {
			
			this.price = price;
			this.currency = currency;
			this.method = method;
			this.intent = intent;
			this.description = description;
		}

		@Override
		public String toString() {
			return "Order [price=" + price + ", currency=" + currency + ", method=" + method + ", intent=" + intent
					+ ", description=" + description + "]";
		}
	    
	    

}
