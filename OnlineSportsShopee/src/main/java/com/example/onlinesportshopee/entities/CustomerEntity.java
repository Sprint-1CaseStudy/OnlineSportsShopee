package com.example.onlinesportshopee.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.example.onlinesportshopee.model.Address;
import com.example.onlinesportshopee.entities.AddressEntity;

@Entity
@Table(name = "Customer")
public class CustomerEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "user_id")
	private String userID;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "contactno")
	private String contactNo;
	@Column(name = "DateOfBirth")
	private LocalDate doB;
	@OneToMany(mappedBy = "customerEntity",cascade = CascadeType.ALL)
	private List<AddressEntity> addresslist;
	
	
	
	public CustomerEntity(String userID, String name, String email, String contactNo, LocalDate doB,
			List<AddressEntity> addresslist) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.doB = doB;
		this.addresslist = addresslist;
	}

	public CustomerEntity() {
		super();
	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public LocalDate getDoB() {
		return doB;
	}
	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}
	public List<AddressEntity> getaddress()
	{
		return addresslist;
	}
	public void setaddress(List<AddressEntity> address)
	{
		this.addresslist = address;
	}

	@Override
	public String toString() {
		return "CustomerEntity [userID=" + userID + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", doB=" + doB + ", addresslist=" + addresslist + "]";
	}
}
