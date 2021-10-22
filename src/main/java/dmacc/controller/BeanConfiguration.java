/**
 * @author Bryner Gibson - bpgibson1
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Dog;
import dmacc.beans.Owner;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Owner owner() {
		Owner bean = new Owner("Bryner", "Gibson", "515-468-9111");
		//bean.setFirstName("Bryner");
		//bean.setLastName("Gibson");
		//bean.setContactNumber("515-468-9111");
		return bean;
	}
	
	@Bean
	public Dog dog() {
		Dog bean = new Dog("Titus", 20, "Corgi");
		//bean.setName("Titus");
		//bean.setSize(20);
		//bean.setDescription("Corgi");
		return bean;
	}
}
