package com.cg.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.main.beans.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
//	public void addProduct(Product p);
//	
//	//@Query("SELECT new Product(id, pname, price)FROM Product p")
//	List<Product> findProducts();
//	
//	//@Query("SELECT new Product(id, pname, price)FROM Product p where id = pid")
//	Product findProductsById(Integer pid);
}
