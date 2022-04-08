package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entities.Product;

public interface ProductRepo extends CrudRepository<Product , Serializable> {

	
}
