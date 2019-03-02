package com.escoger.laptops.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escoger.laptops.beans.AllLaptopBean;
import com.escoger.laptops.beans.BrandsBean;
import com.escoger.laptops.services.LaptopService;

@RestController
@RequestMapping(path = "/laptops")//, consumes = "application/json", produces = "application/json")
public class LaptopsController {
	private static final Logger logger = LoggerFactory.getLogger(LaptopsController.class);
	LaptopService laptopService;
	
	@Autowired
    public LaptopsController(LaptopService laptopService) {
		this.laptopService = laptopService;
	}
	
	@GetMapping	("/All")
	public ResponseEntity<List<AllLaptopBean>> getAllLaptops() {
		return new ResponseEntity<List<AllLaptopBean>>(laptopService.getAllLaptops(), HttpStatus.OK);
	}
	
	@GetMapping	("/laptopBrand/{brand}")
	public ResponseEntity<List<Object>> getLaptopsBasedOnBrand(@PathVariable String brand) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrand(brand), HttpStatus.OK);
	}
	
	@PostMapping ("/laptopBrand/brands")
	public ResponseEntity<List<Object>> getLaptopsBasedOnBrands(@RequestBody BrandsBean brands) {
		System.out.println("brands :"+brands);
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrands(brands.getBrands()), HttpStatus.OK);
	}
	
	@GetMapping("/recentLaunches")
	public ResponseEntity<List<Object>> getLaptopsBasedOnRecentLaunches() {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnRecentLaunches(), HttpStatus.OK);
	}
	
	@GetMapping("/recentLaunches/{brand}")
	public ResponseEntity<List<Object>> getLaptopsBasedOnRecentLaunchesAndBrand(@PathVariable String brand) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndRecentLaunches(brand), HttpStatus.OK);
	}
	
	@GetMapping("/operatingSystem/{os}")
	public ResponseEntity<List<Object>> getLaptopsBasedOnOSType(@PathVariable String os) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnOS(os), HttpStatus.OK);
	}
	
	@GetMapping("/operatingSystem/{os}/{brand}")
	public ResponseEntity<List<Object>> getLaptopsBasedOnOSTypeAndBrand	(@PathVariable String os, @PathVariable String brand) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndOS(os, brand), HttpStatus.OK);
	}
	
	@GetMapping("/ramsize/{ram}")
	public ResponseEntity<List<Object>> getLaptopsBasedOnRam(@PathVariable String ram) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnRamSize(ram), HttpStatus.OK);
	}
	
	@GetMapping("/ramsize/{ramSize}/{brand}")
	public ResponseEntity<List<Object>> getLaptopsBasedOnRamAndBrand(@PathVariable String ramSize, @PathVariable String brand) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndRam(ramSize, brand), HttpStatus.OK);
	}

	@GetMapping("/offers")
	public ResponseEntity<List<Object>> getLaptopsBasedOnOffers() {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnOffers(), HttpStatus.OK);
	}
	
	@GetMapping("/offers/{brand}")
	public ResponseEntity<List<Object>> getLaptopsBasedOnOffersAndBrand(@PathVariable String brand) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnOffersAndBrand(brand), HttpStatus.OK);
	}
	
	@GetMapping("/laptopsdetails/{model_number}")
	public ResponseEntity<List<Object>> getLaptopDetails(@PathVariable String model_number) {
		return new ResponseEntity<List<Object>>(laptopService.getLaptopDetails(model_number), HttpStatus.OK);
	}
	
	@GetMapping("/laptopBrand/{brand}/colour/{colour}")
	public ResponseEntity<List<Object>> getAllLaptopsBasedOnBrandAndColour(@PathVariable String brand, @PathVariable String colour) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndColour(brand, colour), HttpStatus.OK);
	}
	@GetMapping("/laptopBrand/{brand}/graphics/{graphics}")
	public ResponseEntity<List<Object>> getAllLaptopsBasedOnBrandAndGraphics(@PathVariable String brand, @PathVariable String graphics) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndGraphics(brand, graphics), HttpStatus.OK);
	}
	@GetMapping("/laptopBrand/{brand}/memory/{memory}")
	public ResponseEntity<List<Object>> getAllLaptopsBasedOnBrandAndMemory(@PathVariable String brand, @PathVariable String memory) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndMemory(brand, memory), HttpStatus.OK);
	}
	
	@GetMapping("/laptopBrand/{brand}/priceRange/{priceRange}")
	public ResponseEntity<List<Object>> getAllLaptopsBasedOnBrandAndPriceRange(@PathVariable String brand, @PathVariable String priceRange) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndPriceRange(brand, priceRange), HttpStatus.OK);
	}
	@GetMapping("/laptopBrand/{brand}/processor/{processor}")
	public ResponseEntity<List<Object>> getAllLaptopsBasedOnBrandAndProcessor(@PathVariable String brand, @PathVariable String processor) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndProcessor(brand, processor), HttpStatus.OK);
	}
	
	@GetMapping("/laptopBrand/{brand}/Screensize/{Screensize}")
	public ResponseEntity<List<Object>> getAllLaptopsBasedOnBrandAndScreensize(@PathVariable String brand, @PathVariable String Screensize) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndScreensize(brand, Screensize), HttpStatus.OK);
	}
	@GetMapping("/laptopBrand/{brand}/type/{type}")
	public ResponseEntity<List<Object>> getAllLaptopsBasedOnBrandAndType(@PathVariable String brand, @PathVariable String type) {
		return new ResponseEntity<List<Object>>(laptopService.getAllLaptopsBasedOnBrandAndType(brand, type), HttpStatus.OK);
	}
	

}
