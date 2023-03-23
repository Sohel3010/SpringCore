package com.autowiring;

public class CompanyDetails {
	private EmployeeDetails empD;
	private String companyName;
	public EmployeeDetails getEmpD() {
		return empD;
	}
	public void setEmpD(EmployeeDetails empD) {
		this.empD = empD;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "CompanyDetails [empD=" + empD + ", companyName=" + companyName + "]";
	}

	

}
