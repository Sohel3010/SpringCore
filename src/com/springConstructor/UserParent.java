package com.springConstructor;

public class UserParent {
	private String name;
	private int id;
	private String address;
	private int income;
	private CompanyDetails cd;

	public UserParent(String name, int id, String address, int income, CompanyDetails cd) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.income = income;
		this.cd = cd;
	}

	@Override
	public String toString() {
		return "UserParent [name=" + name + ", id=" + id + ", address=" + address + ", income=" + income + ", cd=" + cd
				+ "]";
	}

}
