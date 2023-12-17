package com.exspensetracker.dto;

import java.util.Date;

public class ExspenseDataDTO  {
private int id;
private String category;
private Date date;
private double amount;
private String work;
private String receiver;
private String message;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getWork() {
	return work;
}
public void setWork(String work) {
	this.work = work;
}
public String getReceiver() {
	return receiver;
}
public void setReceiver(String receiver) {
	this.receiver = receiver;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public ExspenseDataDTO() {
	super();
}



	

}
