package com.wipro.mvn_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("app.properties")
@ComponentScan("com.wipro.mvn_project")
public class AppConfig {

//	@Bean(name = "airtel-super")
//	public SimAirtel getSimAirtel() {
//		SimAirtel sim = new SimAirtel();
//		return sim;
//	}
//	
//	@Bean(name = "phone-super")
//	public Phone getPhone() {
//		Phone phone = new Phone();
//		phone.setBrand("mi");
//		phone.setRam(16);
//		phone.setStoreage(65);
//		return phone;
//	}
}
