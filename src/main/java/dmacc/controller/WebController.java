/**
 * @author Bryner Gibson - bpgibson1
 * CIS175 - Fall 2021
 * Nov 3, 2021
 */

package dmacc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Owner;
import dmacc.repository.OwnerRepository;

@Controller
public class WebController {
	@Autowired
	OwnerRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllOwners(Model model) {
		
		if(repo.findAll().isEmpty()) {
			return addNewOwner(model);
		}
		
		model.addAttribute("owners", repo.findAll());
		return "results";
	}

	@GetMapping("/inputOwner")
	public String addNewOwner(Model model) {
		
		Owner o = new Owner();
		model.addAttribute("newOwner", o);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateOwner(@PathVariable("id") long id, Model model) {
		
		Owner o = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + o.toString());
		model.addAttribute("newOwner", o);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseContact(Owner o, Model model) {
		
		repo.save(o);
		return viewAllOwners(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		
		Owner o = repo.findById(id).orElse(null);
	    repo.delete(o);
	    return viewAllOwners(model);
	}
}
