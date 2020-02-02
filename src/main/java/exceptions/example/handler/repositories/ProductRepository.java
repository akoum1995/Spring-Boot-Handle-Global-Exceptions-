package exceptions.example.handler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import exceptions.example.handler.entities.Product;


@Repository("productRepository")
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
