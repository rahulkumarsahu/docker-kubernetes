package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;

enum GroupBy {

	BRAND("brand"), COLOR("color"), SIZE("size");
	String value;

	GroupBy(String name) {
		value = name;
	}

	String getValue() {
		return value;
	}
}

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getProducts(String groupByValue, String actualValue) {
		GroupBy groupBy = GroupBy.valueOf(groupByValue.toUpperCase());
		switch (groupBy) {
		case BRAND:
			return productRepository.findByBrandId(Integer.valueOf(actualValue));
		case COLOR:
			return productRepository.findByColorId(Integer.valueOf(actualValue));
		case SIZE:
			return productRepository.findBySize(actualValue);
		default:
			return null;
		}
	}

}
