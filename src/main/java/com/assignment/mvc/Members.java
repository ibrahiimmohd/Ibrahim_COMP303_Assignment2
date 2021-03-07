/*  
 * Ibrahim Ali
 * 301022172
 * 09-03-2021
 * */

package com.assignment.mvc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="members")
public class Members {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="memberid")
	private int memberId;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="phone")
	private String phone;
	@Column(name="addresscity")
	private String addressCity;
	@Column(name="postalcode")
	private String postalCode;
	@Column(name="gymid")
	private int gymId;
	
	public Members(){}
    
	public Members(int memberId, String email, String password, String firstName, String lastName, String phone, String addressCity, String postalCode, int gymId) {
		super();
		this.memberId = memberId;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.addressCity = addressCity;
		this.postalCode = postalCode;
		this.gymId = gymId;

	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public int getGymId() {
		return gymId;
	}

	public void setGymId(int gymId) {
		this.gymId = gymId;
	}


	@Override
	public String toString() {
		return "MembersBean [memberId=" + memberId 
				+ ", email=" + email 
				+ ", password=" + password 
				+ ", firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", phone=" + phone 
				+ ", addressCity=" + addressCity
				+ ", postalCode=" + postalCode
				+ ", gymId=" + gymId
				 + "]";
	}

}

