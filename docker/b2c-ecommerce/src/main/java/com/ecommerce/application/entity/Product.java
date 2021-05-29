package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Table(name = "b2c_product")
@Data
public class Product {
	@Id
	private Integer id;
	private String name;
	private Integer quantity;
	private String size;

	@Column(name = "brand_id")
	private Integer brandId;

	@Column(name = "color_id")
	private Integer colorId;

	@Column(name = "product_category_id")
	private Integer categoryId;

	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "brand_id")
	private Brand brand;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "color_id")
	private Color color;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "product_category_id")
	private ProductCategory productCategory;

}
