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
@Table(name="gym")
public class Gym {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="gymid")
	private int gymId;
	@Column(name="gymlocation")
	private String gymLocation;
	@Column(name="gymaddress")
	private String gymAddress;
	
	public Gym(){}
    
	public Gym(int gymId, String gymLocation, String gymAddress) {
		super();
		this.gymId = gymId;
		this.gymLocation = gymLocation;
		this.gymAddress = gymAddress;
	}

	public int getGymId() {
		return gymId;
	}

	public void setMemberId(int gymId) {
		this.gymId = gymId;
	}

	public String getGymLocation() {
		return gymLocation;
	}

	public void setGymLocation(String gymLocation) {
		this.gymLocation = gymLocation;
	}

	public String getGymAddress() {
		return gymAddress;
	}

	public void setGassword(String gymAddress) {
		this.gymAddress = gymAddress;
	}


	@Override
	public String toString() {
		return "GymBean [gymId=" + gymId 
				+ ", gymLocation=" + gymLocation 
				+ ", gymAddress=" + gymAddress 
				 + "]";
	}

}

