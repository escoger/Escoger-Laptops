package com.escoger.laptops.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.escoger.laptops.beans.AllLaptopBean;
import com.escoger.laptops.repo.config.AllLaptopsRepo;


public class LaptopServiceImpl implements LaptopService{
	private static final Logger logger = LoggerFactory.getLogger(LaptopServiceImpl.class);


	private final AllLaptopsRepo laptopDao;
	
	
	
	public LaptopServiceImpl(AllLaptopsRepo laptopDao) {
		this.laptopDao = laptopDao;
	}


	@Override
	public List<AllLaptopBean> getAllLaptops() {
		logger.info("ENTER :List<AllLaptopBean> getAllLaptops");
		 Iterable<AllLaptopBean> laptopList = laptopDao.getAllLaptops();
		 logger.info("EXIT :List<AllLaptopBean> getAllLaptops");
		 return (List<AllLaptopBean>) laptopList;
	}


	@Override
	public List<Object> getAllLaptopsBasedOnBrand(String brand) {
		List<Object> AllLaptopsBasedOnBrandList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans.AllLaptopBean");
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrand(brand,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndScreensize(String brand, String Screensize) {
		List<Object> AllLaptopsBasedOnBrandAndScreensizeList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans."+brand);
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndScreensizeList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndType(brand,Screensize,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndScreensizeList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndRam(String ramSize, String brand) {
		List<Object> AllLaptopsBasedOnBrandAndRamList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans.LaptopsRamBean");
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndRamList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndRam(ramSize,brand,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndRamList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndMemory(String brand, String memory) {
		List<Object> AllLaptopsBasedOnBrandAndMemoryList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans."+brand);
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndMemoryList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndMemory(brand,memory,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndMemoryList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndProcessor(String brand, String processor) {
		List<Object> AllLaptopsBasedOnBrandAndProcessorList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans."+brand);
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndProcessorList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndProcessor(brand,processor,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndProcessorList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndColour(String brand, String colour) {
		List<Object>AllLaptopsBasedOnBrandAndColourList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans."+brand);
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndColourList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndColour(brand,colour,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndColourList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndRecentLaunches(String brand) {
		List<Object> AllLaptopsBasedOnBrandAndRecentLaunchesList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans.AllLaptopBean");
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndRecentLaunchesList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndRecentLaunches(brand,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndRecentLaunchesList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndType(String brand, String type) {
		List<Object> AllLaptopsBasedOnBrandAndTypeList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans."+brand);
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndTypeList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndType(brand,type,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndTypeList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndPriceRange(String brand, String priceRange) {
		List<Object> AllLaptopsBasedOnBrandAndPriceRangeList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans."+brand);
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndPriceRangeList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndPriceRange(brand,priceRange,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndPriceRangeList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndOS(String os, String brand) {
		List<Object> AllLaptopsBasedOnBrandAndOSList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans.LaptopsOSTypeBean");
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndOSList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndOS(os,brand,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndOSList;
	}



	@Override
	public List<Object> getAllLaptopsBasedOnBrandAndGraphics(String brand, String graphics) {
		List<Object> AllLaptopsBasedOnBrandAndGraphicsList = null;
		Class clazz = null;
		
		if(brand==null || brand.equalsIgnoreCase("")) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans."+brand);
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandAndGraphicsList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrandAndGraphics(brand,graphics,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandAndGraphicsList;
	}


	@Override
	public List<Object> getAllLaptopsBasedOnBrands(List<Object> brands) {
		List<Object> AllLaptopsBasedOnBrandsList = null;
		Class clazz = null;
		
		if(brands==null || brands.isEmpty()) {
			// need to handle this scenario
		}
		
		try {
			 clazz = Class.forName("com.escoger.laptops.beans.AllLaptopBean");
			 System.out.println("clazz is :"+clazz);
			 AllLaptopsBasedOnBrandsList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnBrands(brands,clazz));
		}
		
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		return AllLaptopsBasedOnBrandsList;
	}


	@Override
	public List<Object> getAllLaptopsBasedOnRecentLaunches() {
	 Iterable<Object> recentLaunchLaptopList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnRecentLaunches());
	 return (List<Object>) recentLaunchLaptopList;
	 }


	@Override
	public List<Object> getAllLaptopsBasedOnOS(String os) {
		List<Object> OSTypeLaptopList = null;
		OSTypeLaptopList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnOS(os));
		 return OSTypeLaptopList;
	}


	@Override
	public List<Object> getAllLaptopsBasedOnRamSize(String ram) {
		List<Object> AllLaptopsBasedOnRamList = null;
	Class clazz = null;
	
	if(ram==null || ram.isEmpty()) {
		// need to handle this scenario
	}
	
	try {
		 clazz = Class.forName("com.escoger.laptops.beans.LaptopsRamBean");
		 System.out.println("clazz is :"+clazz);
		 AllLaptopsBasedOnRamList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnRamSize(ram,clazz));
	}
	
	catch(Exception e1) {
		e1.printStackTrace();
	}

	return AllLaptopsBasedOnRamList;
}


	@Override
	public List<Object> getAllLaptopsBasedOnOffers() {
		List<Object> AllLaptopsBasedOnRamList = null;
	Class clazz = null;
	
	try {
		 clazz = Class.forName("com.escoger.laptops.beans.LaptopsOffersBean");
		 System.out.println("clazz is :"+clazz);
		 AllLaptopsBasedOnRamList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnOffers());
	}
	
	catch(Exception e1) {
		e1.printStackTrace();
	}

	return AllLaptopsBasedOnRamList;
}


	@Override
	public List<Object> getAllLaptopsBasedOnOffersAndBrand(String brand) {
		List<Object> AllLaptopsBasedOnOffersAndBrandList = null;
	Class clazz = null;
	
	if(brand==null || brand.isEmpty()) {
		// need to handle this scenario
	}
	
	try {
		 clazz = Class.forName("com.escoger.laptops.beans.LaptopsOffersBean");
		 System.out.println("clazz is :"+clazz);
		 AllLaptopsBasedOnOffersAndBrandList = new ArrayList<Object>(laptopDao.getAllLaptopsBasedOnOffersAndBrand(brand,clazz));
	}
	
	catch(Exception e1) {
		e1.printStackTrace();
	}

	return AllLaptopsBasedOnOffersAndBrandList;
}


	@Override
	public List<Object> getLaptopDetails(String model_number) {
		List<Object> laptopDetailsList = null;
	Class clazz = null;
	
	if(model_number==null || model_number.isEmpty()) {
		// need to handle this scenario
	}
	
	try {
		 clazz = Class.forName("com.escoger.laptops.beans.LaptopDetailsBean");
		 System.out.println("clazz is :"+clazz);
		 laptopDetailsList = new ArrayList<Object>(laptopDao.getLaptopDetails(model_number,clazz));
	}
	
	catch(Exception e1) {
		e1.printStackTrace();
	}

	return laptopDetailsList;
}

}
