package com.escoger.laptops.repo.config;

import java.util.Collection;
import java.util.List;

import com.escoger.laptops.beans.AllLaptopBean;

public interface AllLaptopsRepo  {
	public List<AllLaptopBean> getAllLaptops();

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndGraphics(String brand, String graphics, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndOS(String os, String brand, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndPriceRange(String brand, String priceRange, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndType(String brand, String type, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndRecentLaunches(String brand,Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndColour(String brand, String colour, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndProcessor(String brand, String processor, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndMemory(String brand, String memory, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrandAndRam(String brand, String ram, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrand(String brand, Class clazz);

	Collection<? extends Object> getAllLaptopsBasedOnBrands(List<Object> brands, Class clazz);

	public List<AllLaptopBean> getAllLaptopsBasedOnRecentLaunches();

	public Collection<? extends Object> getAllLaptopsBasedOnOS(String os);
		
}
