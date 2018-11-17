package com.escoger.laptops.factory;


public  class LaptopFactory implements LaptopTypeObject{

	@Override
	public Object getLaptopObjectBasedOnBrand(String brand) {
		if(brand == null || brand.equalsIgnoreCase("")) {
			return new Exception();
		}
		if(brand.equalsIgnoreCase("HP")) {

		}
		if(brand.equalsIgnoreCase("SAMSUNG")) {

		}
		if(brand.equalsIgnoreCase("DELL")) {

		}
		if(brand.equalsIgnoreCase("APPLE")) {
			//return new AllMiMobileBean();
		}
		if(brand.equalsIgnoreCase("TOSHIBA")) {

		}
		if(brand.equalsIgnoreCase("ASUS")) {

		}
		
		if(brand.equalsIgnoreCase("Micromax")) {

		}
		
		if(brand.equalsIgnoreCase("Sony")) {

		}
	

		

		return null;
	}

}
