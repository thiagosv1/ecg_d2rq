package br.ufc.arida.ecg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.arida.ecg.model.Person;
import br.ufc.arida.ecg.service.PersonService;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {
	
	@Autowired
	public PersonService personService;

	
	@RequestMapping(value= "", method=RequestMethod.GET)
	public List<Person>  persons(){
	
		return personService.persons();
		
	}
	

}
