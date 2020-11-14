package com.vic.rabbitmq.app.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vic.rabbitmq.app.json.CustomLocalDateSerializer;

public class InvoiceCancelledMessage {
	
	@JsonSerialize(using = CustomLocalDateSerializer.class)
	private LocalDate cancelDate;
	private String invoiceNumber;
	private String reason;
	public LocalDate getCancelDate() {
		return cancelDate;
	}
	
	public InvoiceCancelledMessage() {
	}	
	
	public InvoiceCancelledMessage(LocalDate cancelDate, String invoiceNumber, String reason) {
		super();
		this.cancelDate = cancelDate;
		this.invoiceNumber = invoiceNumber;
		this.reason = reason;
	}



	public void setCancelDate(LocalDate cancelDate) {
		this.cancelDate = cancelDate;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "InvoiceCancelledMessage [cancelDate=" + cancelDate + ", invoiceNumber=" + invoiceNumber + ", reason="
				+ reason + "]";
	}	
	
	
}
