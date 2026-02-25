package H2AndUUID.Student;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity

@Table(name = "StudentUUID")
public class StuEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;     //Univerdsaly unic ID
	private String sname;
	private String email;
	public StuEntity() {
		super();
	}
	public UUID getId() {
		return id;
	}
	public String getSname() {
		return sname;
	}
	public String getEmail() {
		return email;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

}
