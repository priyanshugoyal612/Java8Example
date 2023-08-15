package com.java8.examples;

public class Address implements Comparable<Address>{
	
	Integer id;
	String addressId;
	String addressName;

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	

	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
				//return this.id - a.id;
	}
	

}
