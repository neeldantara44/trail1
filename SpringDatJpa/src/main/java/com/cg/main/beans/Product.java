package com.cg.main.beans;

import javax.persistence.*;
@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String pname;
	@Column
	private Double price;
	
	public Product(){}

	public Product(Integer id, String pname, Double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
