package com.escoger.laptops.repo.impl;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.escoger.laptops.beans.AllLaptopBean;
import com.escoger.laptops.repo.config.AllLaptopsRepo;
import com.escoger.laptops.services.LaptopService;
import com.escoger.laptops.services.LaptopServiceImpl;


@Repository
	public class CassandraUtil implements AllLaptopsRepo{
	private static final Logger logger = LoggerFactory.getLogger(CassandraUtil.class);

	@Autowired
	Cluster cluster;
	   /* *//**
	     * Constant String for Keyspace
	     *//*
	    private static final String KEYSPACE = "cassandra.keyspace";
	    *//**
	     * Constant String for ContactPoints
	     *//*
	    private static final String CONTACTPOINTS = "cassandra.contactpoints";
	    *//**
	     * Constant String for Port 
	     */
	    private static final String PORT = "cassandra.port";
	    
/*
	    public CassandraUtil() {
	        System.out.println("CassandraUtil()");
	    }
	    
	    private String getKeyspaceName() {
	        return environment.getProperty(KEYSPACE);       
	    }
	    
	    private String getContactPoints() {
	        return environment
	                .getProperty(CONTACTPOINTS);        
	    }
	    
	    private int getPortNumber() {
	        return Integer.parseInt(environment
	                .getProperty(PORT));        
	    }

	    @Bean
	    public CassandraClusterFactoryBean cluster() {
	        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
	        cluster.setContactPoints(getContactPoints());
	        cluster.setPort(getPortNumber());
	        return cluster;
	    }

	    @Bean
	    public CassandraMappingContext mappingContext() {
	        return new BasicCassandraMappingContext();
	    }

	    @Bean
	    public CassandraConverter converter() {
	        return new MappingCassandraConverter(mappingContext());
	    }

	    @Bean
	    public CassandraSessionFactoryBean session() throws Exception {
	        CassandraSessionFactoryBean cassandraSessionFactoryBean = new CassandraSessionFactoryBean();
	        cassandraSessionFactoryBean.setCluster(cluster().getObject());
	        cassandraSessionFactoryBean.setKeyspaceName(getKeyspaceName());
	        cassandraSessionFactoryBean.setConverter(converter());
	        cassandraSessionFactoryBean.setSchemaAction(SchemaAction.NONE);
	        return cassandraSessionFactoryBean;
	    }*/

	private final CassandraOperations cassandraTemplate;

	public CassandraUtil(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
	}

	
	@Bean
	public LaptopService laptopService(AllLaptopsRepo mobileRepository) {
		return new LaptopServiceImpl(mobileRepository);
	}


	@Override
	public List<AllLaptopBean> getAllLaptops() {
		List<AllLaptopBean> allLaptopList = this.cassandraTemplate.select(QueryBuilder.select().from("laptops"), AllLaptopBean.class);
		return allLaptopList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndGraphics(String brand, String graphics,
			Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndGraphicsList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("brand", "graphics")), clazz);
		return getAllLaptopsBasedOnBrandAndGraphicsList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndOS(String brand, String os, Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndOSList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "os")), clazz);
		return getAllLaptopsBasedOnBrandAndOSList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndPriceRange(String brand, String priceRange,
			Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndPriceRangeList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "priceRange")), clazz);
		return getAllLaptopsBasedOnBrandAndPriceRangeList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndType(String brand, String type, Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndTypeList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "type")), clazz);
		return getAllLaptopsBasedOnBrandAndTypeList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndRecentLaunches(String brand, String recentLaunches,
			Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndRecentLaunchesList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "recentLaunches")), clazz);
		return getAllLaptopsBasedOnBrandAndRecentLaunchesList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndColour(String brand, String colour, Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndColourList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "colour")), clazz);
		return getAllLaptopsBasedOnBrandAndColourList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndProcessor(String brand, String processor,
			Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndProcessorList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "processor")), clazz);
		return getAllLaptopsBasedOnBrandAndProcessorList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndMemory(String brand, String memory, Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndMemoryList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "memory")), clazz);
		return getAllLaptopsBasedOnBrandAndMemoryList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrandAndRam(String brand, String ram, Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandAndRamList = this.cassandraTemplate.select(QueryBuilder.select().from(brand+"laptops").where(QueryBuilder.eq("laptopType", "ram")), clazz);
		return getAllLaptopsBasedOnBrandAndRamList;
	}


	@Override
	public Collection<? extends Object> getAllLaptopsBasedOnBrand(String brand, Class clazz) {
		List<AllLaptopBean> getAllLaptopsBasedOnBrandList = this.cassandraTemplate.select(QueryBuilder.select().from("laptops").where(QueryBuilder.eq("brand", brand)), clazz);
		return getAllLaptopsBasedOnBrandList;
	}
	
	

	
	
}
