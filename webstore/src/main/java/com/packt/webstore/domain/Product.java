package com.packt.webstore.domain;

import java.math.BigDecimal;

import javax.validation.constraints.*;

import org.springframework.web.multipart.MultipartFile;

import com.packt.webstore.validator.ProductId;

public class Product {
	
	@Pattern(regexp="[0-9]+", message="{Pattern.Product.productId.validation}")
	@ProductId
	private String productId;
	@Size(min=4, max=50,message="{Size.Product.name.validation}")
	private String name;
	@Min(value=0, message="{Min.Product.unitPrice.validation}")
	@Digits(integer=8, fraction=2, message="{Digits.Product.unitPrice.validation}")
	@NotNull(message="{NotNull.Product.unitPrice.validation}")
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discountnued;
	private String condition;
	private MultipartFile productImage;
	
	public Product() {
		super();
	}
	
	public Product(String productId, String name, BigDecimal unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public long getUnitsInOrder() {
		return unitsInOrder;
	}

	public void setUnitsInOrder(long unitsnOrder) {
		this.unitsInOrder = unitsnOrder;
	}

	public boolean isDiscountnued() {
		return discountnued;
	}

	public void setDiscountnued(boolean discountnued) {
		this.discountnued = discountnued;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if(productId == null) {
			if(other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
		}
	
	@Override 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Product [productId= " + productId + ", nazwa=" + name +"]";
	}
}
