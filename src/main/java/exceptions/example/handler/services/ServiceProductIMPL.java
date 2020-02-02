package exceptions.example.handler.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exceptions.example.handler.entities.Product;
import exceptions.example.handler.repositories.ProductRepository;

@Service(value = "productService")

public class ServiceProductIMPL implements IServiceProduct {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void addProduct(Product p) {
		productRepository.save(p);
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product getOne(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

}
