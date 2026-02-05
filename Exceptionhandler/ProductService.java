package EceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepo productrepo;

	public Product createProdu(Product product) {
		if(productrepo.findByName(product.getName()).isPresent()){
			throw new DuplicateNameException("The name "+product.getName()+" is already available");
			
		}
		else 
			return productrepo.save(product);
		
		
		
	}

	public Product getProduct(Integer id) {
		
		
		return productrepo.findById(id).orElseThrow(()-> new IdNotFoundException("The "+id+ " is not present"));
		
	}

	public void delProduct(Integer id) {
		productrepo.deleteById(id);
		
	}

}
