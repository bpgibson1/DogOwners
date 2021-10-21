package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Owner;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class DogOwnersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogOwnersApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Owner o = appContext.getBean("owner", Owner.class);
		
		System.out.println(o.toString());
	}

}
