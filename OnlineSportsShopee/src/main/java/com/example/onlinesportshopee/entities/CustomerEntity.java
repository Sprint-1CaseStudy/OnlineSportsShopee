package com.example.onlinesportshopee.entities;

import java.time.LocalDate;
import java.util.ArrayList;
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
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "contactno")
	private String contactNo;
	@Column(name = "DateOfBirth")
	private LocalDate doB;
	@OneToMany(mappedBy = "customerEntity",cascade = CascadeType.ALL)
	private List<AddressEntity> addressEntity;
	@OneToMany(mappedBy="customerEntity",cascade=CascadeType.ALL)
	private List<OrderEntity> orderEntity;
	
	public CustomerEntity() {
		
	}
	
	public CustomerEntity(Long id, String name, String email, String contactNo, LocalDate doB,
			List<AddressEntity> addressEntity, List<OrderEntity> orderEntity) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.doB = doB;
		this.addressEntity = addressEntity;
		this.orderEntity = orderEntity;
	}
	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
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
	public List<AddressEntity> getAddressEntity() {
		return addressEntity;
	}
	public void setAddressEntity(List<AddressEntity> addressEntity) {
		this.addressEntity = addressEntity;
	}
	public List<OrderEntity> getOrderEntity() {
		return orderEntity;
	}
	public void setOrderEntity(List<OrderEntity> orderEntity) {
		this.orderEntity = orderEntity;
	}
	
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", doB=" + doB + ", addressEntity=" + addressEntity + ", orderEntity=" + orderEntity + "]";
	}
	
}
