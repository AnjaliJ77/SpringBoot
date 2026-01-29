package com.Spring.UserRegistration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usertable")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Size(min = 3, max = 17, message = "Pls enter the anme which has having more than 3 char")
	@NotBlank(message = "Mandatory field")
	private String uname;
	
	
	@NotBlank(message = "Mandatory field")
	@Pattern(regexp = ".*[a-z].*", message = "Should contains Small")
	@Pattern(regexp = ".*[A-Z].*", message = "Should contains Capital Letters")
	@Pattern(regexp = ".*[0-9].*", message = "Should contains number")
	private String pwd;
	
	@NotBlank(message = "Mandatory field")
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
