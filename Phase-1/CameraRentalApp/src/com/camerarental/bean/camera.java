package com.camerarental.bean;

public class camera {
	private int id;
private String brand;
private String model;
private float perDayPrice;
public camera(int id, String brand, String model, float perDayPrice, String status) {
	super();
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.perDayPrice = perDayPrice;
	this.status = status;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
private String status;

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
public void setid(int id) {
	id++;
}

public camera() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "camera [id=" + id + ", brand=" + brand + ", model=" + model + ", perDayPrice=" + perDayPrice + ", status="
			+ status + "]";
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public float getPerDayPrice() {
	return perDayPrice;
}
public void setPerDayPrice(float perDayPrice) {
	this.perDayPrice = perDayPrice;
}



}
