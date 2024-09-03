package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BankDTO;

public class BankForm extends BaseForm {

	@NotEmpty(message = "please enter name here")
	private String name;

	@NotNull(message = "please enter account number")
	@Min(value = 1)
	private long accountNumber;

	@NotEmpty(message = "please enter loan here")
	private String pendingLoan;

	/*
	 * @NotNull(message = "please enter creation date") private Date creationDate;
	 */

	@NotNull(message = "please enter balance here")
	@Min(value = 1)
	private long balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPendingLoan() {
		return pendingLoan;
	}

	public void setPendingLoan(String pendingLoan) {
		this.pendingLoan = pendingLoan;
	}

	/*
	 * public Date getCreationDate() { return creationDate; }
	 * 
	 * public void setCreationDate(Date creationDate) { this.creationDate =
	 * creationDate; }
	 */

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public BaseDTO getDto() {

		BankDTO dto = initDTO(new BankDTO());
		dto.setName(name);
		dto.setAccountNumber(accountNumber);
		dto.setPendingLoan(pendingLoan);
		/* dto.setCreationDate(creationDate); */
		dto.setBalance(balance);

		return dto;
	}
}
