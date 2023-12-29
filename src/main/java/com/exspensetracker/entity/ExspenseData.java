package com.exspensetracker.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class ExspenseData  {
	@Id
private int id;
private String category;
private Date date;
private double amount;
private String work;
private String receiver;
private String message;
	private String type;
	private double inHandBalance;
private double bankBalance;
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
	public double getInHandBalance() {
	return inHandBalance;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public void setInHandBalance(double inHandBalance) {
	this.inHandBalance = inHandBalance;
}
public double getBankBalance() {
	return bankBalance;
}
public void setBankBalance(double bankBalance) {
	this.bankBalance = bankBalance;
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
public ExspenseData() {
	super();
}



	

}
