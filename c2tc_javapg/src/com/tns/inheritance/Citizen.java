package com.tns.inheritance;
// base class
public class Citizen {
	private String name;
	private long aadharNo;
	private String address;
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno + "]";
	}
	private long phno;
	public Citizen(String name, long aadharNo, String address, long phno) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	

}
