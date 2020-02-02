package exceptions.example.handler.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import exceptions.example.handler.entities.Product;
import exceptions.example.handler.services.IServiceProduct;
import exceptions.example.handler.utils.CustomObjectResponse;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

	@Autowired
	private IServiceProduct productService;
	
    @PostMapping(value="/addProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Object> addProduct(@RequestBody Product product){
    	productService.addProduct(product);
        return new ResponseEntity<Object>(new CustomObjectResponse("Creation done"), HttpStatus.OK);
    }
    @GetMapping(value="/allProducts", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Product>> getAllProducts(){
    	return new ResponseEntity<List<Product>>(productService.getAll(), HttpStatus.OK);
    }
    @GetMapping(value="/product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Product> getOneProduct(@PathVariable("id") int id){
    	return new ResponseEntity<Product>(productService.getOne(id), HttpStatus.OK);
    }
}
