package com.autowiring;

public class EmployeeDetails {
	private String name;
	private int id;
	private String skills;
	private String experience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", id=" + id + ", skills=" + skills + ", experience=" + experience
				+ "]";
	}

}
