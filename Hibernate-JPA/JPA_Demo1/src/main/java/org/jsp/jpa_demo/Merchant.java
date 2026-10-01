package org.jsp.jpa_demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
@NamedNativeQuery(name="FetchAllGstNo",query="select gst_num from Merchant")
@NamedNativeQuery(name="FetchAllNames",query="select name from Merchant")
@NamedNativeQuery(name="FetchAllEmailIds",query="select email from Merchant")
@NamedQuery(name="VerifyMerchantByEmailAndPass",query="select m from Merchant m where m.email=?1 and m.password=?2")
@NamedQuery(name="VerifyMerchantByIdAndPass",query="select m from Merchant m where m.id=?1 and m.password=?2")
@NamedQuery(name="FindMerchantByPhone",query="select m from Merchant m where m.phone=?1")
@NamedQuery(name="FindMerchantByGstNo", query="select m from Merchant m where m.gst_num=?1")
@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gst_num;
	private String email;
	private long phone;
	private String password;
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
	public String getGst_num() {
		return gst_num;
	}
	public void setGst_num(String gst_num) {
		this.gst_num = gst_num;
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
		return "Merchant [id=" + id + ", name=" + name + ", gst_num=" + gst_num + ", email=" + email + ", phone="
				+ phone + ", password=" + password + "]";
	}
	
	
	
	

}
