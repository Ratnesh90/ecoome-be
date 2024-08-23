package com.chhah.ecomme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Product_details", schema = "public" )
public class Product {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="id")
	    private Integer id;

	    @Column(name="name", nullable=false, length=100)
	    private String name;

	    @Column(name="description",  length=500)
	    private String description;

	    @Column(name="stock", nullable=false,length=50)
	    private String stock;

	    @Column(name="price", nullable=false,length=50)
	    private Long price;

	    @Column(name="category",  length=50)
	    private String category;

		public Product(Integer id, String name, String description, String stock, Long price, String category) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.stock = stock;
			this.price = price;
			this.category = category;
		}

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStock() {
			return stock;
		}

		public void setStock(String stock) {
			this.stock = stock;
		}

		public Long getPrice() {
			return price;
		}

		public void setPrice(Long price) {
			this.price = price;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	    
	    

}
