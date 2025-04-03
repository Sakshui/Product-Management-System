package com.becoder.Product_Management_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.becoder.Product_Management_Backend.model.Product;
import com.becoder.Product_Management_Backend.service.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<?> saveProduct(@RequestBody Product product){
		return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllProduct(){
		return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProductById(@PathVariable Integer id){
		return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
		return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
	}
	
	@PutMapping("/editproduct/{id}")
	public ResponseEntity<?> editProduct(@RequestBody Product product) {
	    Product updatedProduct = productService.editProduct(product);
	    if (updatedProduct != null) {
	        return ResponseEntity.ok(updatedProduct); // Product edited successfully
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	            .body("Product not found with id: " + product.getId());
	    }
	}
	
	

}
