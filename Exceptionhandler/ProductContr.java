package EceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductContr {
	
	@Autowired
	ProductService productservice;
	
	
	@PostMapping("/createproduct")
	public Product createProdu(@RequestBody Product product) {
		return productservice.createProdu(product);
		
	}
	
	@GetMapping("/getproduct/{id}")
	public Product getProduct(@PathVariable Integer id) {
		return productservice.getProduct(id);
	}
	
	@DeleteMapping("deleteproduct/{id}")
	public void delProduct(@PathVariable Integer id) {
		productservice.delProduct(id);
	}
	

	
	
}
