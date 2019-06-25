package com.starter.document;

public class Address {

	private String hNo;
	private String loc;
	
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Address() {
		super();
	}
	public Address(String hNo, String loc) {
		super();
		this.hNo = hNo;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", loc=" + loc + "]";
	}
	
	
}
