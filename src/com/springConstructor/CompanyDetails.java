package com.springConstructor;

public class CompanyDetails {
	private String companyName;
	private int companyId;
	private String companyAdd;

	public CompanyDetails(String companyName, int companyId, String companyAdd) {
		super();
		this.companyName = companyName;
		this.companyId = companyId;
		this.companyAdd = companyAdd;
	}

	@Override
	public String toString() {
		return "CompanyDetails [companyName=" + companyName + ", companyId=" + companyId + ", companyAdd=" + companyAdd
				+ "]";
	}

}
