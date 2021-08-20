package com.cg.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.main.beans.Product;
import com.cg.main.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prepository;
	
	public void addProduct(Product p)
	{
		prepository.saveAndFlush(p);
	}
	
	public List<Product> findProducts()
	{
		return prepository.findAll();
	}
	
	public Optional<Product> findProductsById(Integer id)
	{
		return prepository.findById(id);
	}
}
