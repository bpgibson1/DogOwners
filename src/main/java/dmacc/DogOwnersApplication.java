package dmacc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Dog;
import dmacc.beans.Owner;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.OwnerRepository;

@SpringBootApplication
public class DogOwnersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogOwnersApplication.class, args);
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Owner o = appContext.getBean("owner", Owner.class);
		
		//System.out.println(o.toString());
	}
	
	@Autowired
	OwnerRepository repo;
	
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Owner o = appContext.getBean("owner", Owner.class);
		o.setFirstName("TomJerry");
		repo.save(o);
		
		Owner p = new Owner("First", "Last", "515-515-5151");
		Dog d = new Dog("Dog", 100, "Mut- Dark Brown");
		p.setDog(d);
		repo.save(p);
		
		List<Owner> allOwners = repo.findAll();
		for(Owner parent: allOwners) {
			System.out.println(parent.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
