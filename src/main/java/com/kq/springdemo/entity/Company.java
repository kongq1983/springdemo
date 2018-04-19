package com.kq.springdemo.entity;
/**
 * TODO
 * @author kongqi
 * @date  2018-04-18 13:34 
 * @since 
 */
public class Company {
	
	private String id;
	private String name;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
