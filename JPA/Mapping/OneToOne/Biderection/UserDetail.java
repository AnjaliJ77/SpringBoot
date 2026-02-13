package OneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;

@Entity
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long uid;
	@Column(name = "Username", unique = true)
	String uname;
	int uage;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	private UserAddress useraddress;

	public UserDetail() {
		
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public UserAddress getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(UserAddress useraddress) {
		this.useraddress = useraddress;
	}
	
	

}
