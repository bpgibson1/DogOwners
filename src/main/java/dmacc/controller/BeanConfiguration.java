/**
 * @author Bryner Gibson - bpgibson1
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Owner;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Owner owner() {
		Owner bean = new Owner();
		bean.setFirstName("Bryner");
		bean.setLastName("Gibson");
		bean.setContactNumber("515-468-9111");
		return bean;
	}
}
