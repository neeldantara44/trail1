package com.cg.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.beans.Product;
import com.cg.main.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService pservice;
	
	@PostMapping("/addP")
	public void addP(@RequestBody Product p)
	{
		pservice.addProduct(p);
	}
	
	@GetMapping("/getAll")
	public List<Product> getAll()
	{
		return pservice.findProducts();
	}
	
	@GetMapping("/getId/{id}")
	public Product findById(@PathVariable Integer id)
	{
		return pservice.findProductsById(id).get();
	}
}
