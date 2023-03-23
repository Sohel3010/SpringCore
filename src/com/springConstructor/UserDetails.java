package com.springConstructor;

public class UserDetails {
	private String name;
	private int id;

	public UserDetails(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", id=" + id + "]";
	}

}
