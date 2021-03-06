package com.escoger.laptops.beans;

import java.io.Serializable;

public class LaptopsRamBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String brand;
	private String model_number;
	private String model_Name;
	private String image_url;
	private String price ;
	private String best_price;
	private String ram_size;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel_number() {
		return model_number;
	}
	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}
	public String getModel_Name() {
		return model_Name;
	}
	public void setModel_Name(String model_Name) {
		this.model_Name = model_Name;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBest_price() {
		return best_price;
	}
	public void setBest_price(String best_price) {
		this.best_price = best_price;
	}
	public String getRam() {
		return ram_size;
	}
	public void setRam(String ram) {
		this.ram_size = ram;
	}

}
