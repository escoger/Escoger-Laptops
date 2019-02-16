package com.escoger.laptops.services;

import java.util.List;

import com.escoger.laptops.beans.AllLaptopBean;

public interface LaptopService {
	

	public List<AllLaptopBean> getAllLaptops();
	public List<Object> getAllLaptopsBasedOnBrand(String brand);
	public List<Object> getAllLaptopsBasedOnBrandAndScreensize(String brand, String Screensize);
	public List<Object> getAllLaptopsBasedOnBrandAndRam(String ramSize, String brand);
	public List<Object> getAllLaptopsBasedOnBrandAndMemory(String brand, String memory);
	public List<Object> getAllLaptopsBasedOnBrandAndProcessor(String brand, String processor);
	public List<Object> getAllLaptopsBasedOnBrandAndColour(String brand, String colour);
	public List<Object> getAllLaptopsBasedOnBrandAndRecentLaunches(String brand);
	public List<Object> getAllLaptopsBasedOnBrandAndType(String brand, String type);
	public List<Object> getAllLaptopsBasedOnBrandAndPriceRange(String brand, String priceRange);
	public List<Object> getAllLaptopsBasedOnBrandAndOS(String os, String brand);
	public List<Object> getAllLaptopsBasedOnBrandAndGraphics(String brand, String graphics);
	public List<Object> getAllLaptopsBasedOnBrands(List<Object> brands);
	public List<Object> getAllLaptopsBasedOnRecentLaunches();
	public List<Object> getAllLaptopsBasedOnOS(String os);
	public List<Object> getAllLaptopsBasedOnRamSize(String ram);
	
	
}

