package exceptions.example.handler.services;

import java.util.List;

import exceptions.example.handler.entities.Product;

public interface IServiceProduct {
	public void addProduct(Product p);
	public List<Product> getAll();
	public Product getOne(int id);

}
