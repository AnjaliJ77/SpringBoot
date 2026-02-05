package EceptionHandling;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer >{
	
	
	//First way to create derived query...using field
	Optional<Product> findByName(String name);
	Optional<Product> findByPrice(int price);

	
	
	// Combining fields
	// List<Product> findByNameAndPrice(String name, int price);
	
	// Using operator
//	List<Product> findByNameContaining(String name);
//	List<Product> findByPriceGreaterthan(int price);
}
