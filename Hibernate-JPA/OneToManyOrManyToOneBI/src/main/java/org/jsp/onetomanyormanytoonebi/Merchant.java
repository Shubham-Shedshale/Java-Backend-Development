package org.jsp.onetomanyormanytoonebi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Merchant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gstnum;
	private String email;
	private long phone;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "m")
	private List<Product> plist;
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGstnum() {
		return gstnum;
	}
	public void setGstnum(String gstnum) {
		this.gstnum = gstnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", gstnum=" + gstnum + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}
	
	
}
