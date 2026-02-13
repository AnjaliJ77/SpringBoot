package OneToOne;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class UserAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String village;
	String street;
	public UserAddress() {
		
	}
	@OneToOne(mappedBy = "useraddress")    // it wont create any FK here
	UserDetail userdetail;
	
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public UserDetail getUserdetail() {
		return userdetail;
	}
	public void setUserdetail(UserDetail userdetail) {
		this.userdetail = userdetail;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	

}
