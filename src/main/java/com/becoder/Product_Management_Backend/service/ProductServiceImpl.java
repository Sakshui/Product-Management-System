package com.becoder.Product_Management_Backend.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.becoder.Product_Management_Backend.model.Product;

import com.becoder.Product_Management_Backend.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		Product product=productRepo.findById(id).get();
		
		if(product!=null) {
			productRepo.delete(product);
			return "Product deleted successfully";
		}
		return "Something wrong with the server";
		
	}

	@Override
	public Product editProduct(Product product) {
	    Product existingProduct = productRepo.findById(product.getId()).orElse(null);
	    if (existingProduct != null) {
	        existingProduct.setProductName(product.getProductName());
	        existingProduct.setDescription(product.getDescription());
	        existingProduct.setPrice(product.getPrice());
	        existingProduct.setStatus(product.getStatus());
	        return productRepo.save(existingProduct);
	    }
	    return null;
	}

}
