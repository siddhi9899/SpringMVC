package com.shopmart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "PRODUCT")
@Table(name = "PRODUCT")
public class Product {

	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productId_generator")
	@SequenceGenerator(name="productId_generator", sequenceName = "SHOPMART_PRODUCT_SEQ", allocationSize=1)
	@Column(name = "PRODUCT_ID", updatable = false, nullable = false)
	int productId;
	
	@Column(name = "PRODUCT_NAME")
	String productName;
	
	@Column(name = "PRODUCT_PRICE")
	double productPrice;
	
	@Column(name = "PRODUCT_DESCRIPTION")
	String productDescription;
	
	@Column(name = "CATEGORY_ID")
	int categoryId;
	
	@Column(name = "AVAILABLE_QUANTITY")
	int availableQuantity;
	
	@Column(name = "SOLD_QUANTITY")
	int soldQuantity;
	
	@Column(name = "PRODUCT_PIC_NAME")
	String productPicName;


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public int getSoldQuantity() {
		return soldQuantity;
	}

	public void setSoldQuantity(int soldQuantity) {
		this.soldQuantity = soldQuantity;
	}
	
	public String getProductPicName() {
		return productPicName;
	}

	public void setProductPicName(String productPicName) {
		this.productPicName = productPicName;
	}

}
