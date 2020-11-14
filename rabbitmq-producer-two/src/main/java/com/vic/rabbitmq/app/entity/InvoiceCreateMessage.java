package com.vic.rabbitmq.app.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vic.rabbitmq.app.json.CustomLocalDateSerializer;

public class InvoiceCreateMessage {

	private double amount;
	@JsonSerialize(using = CustomLocalDateSerializer.class)
	private LocalDate createdDate;
	private String currency;
	private String invoiceNumber;
			
	public InvoiceCreateMessage() {
		
	}
	
	public InvoiceCreateMessage(double amount, LocalDate createdDate, String currency, String invoiceNumber) {
		super();
		this.amount = amount;
		this.createdDate = createdDate;
		this.currency = currency;
		this.invoiceNumber = invoiceNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	@Override
	public String toString() {
		return "InvoiceCreateMessage [amount=" + amount + ", createdDate=" + createdDate + ", currency=" + currency
				+ ", invoiceNumber=" + invoiceNumber + "]";
	}	
}
