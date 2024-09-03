package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;

public class pendingLoanForm extends BaseForm {
	
	@NotEmpty(message = "please enter pending loan")
	private String pendingLoan;

	public String getPendingLoan() {
		return pendingLoan;
	}

	public void setPendingLoan(String pendingLoan) {
		this.pendingLoan = pendingLoan;
	}

}
