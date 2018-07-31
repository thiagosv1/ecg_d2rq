package br.ufc.arida.ecg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.arida.ecg.model.Person;
import br.ufc.arida.ecg.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	public PersonService personService;

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/persons")
	@ResponseBody
	public List<Person>  persons(){
		
		return personService.persons();
		
	}


}
