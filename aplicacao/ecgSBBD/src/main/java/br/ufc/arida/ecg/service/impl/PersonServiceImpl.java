package br.ufc.arida.ecg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.ufc.arida.ecg.model.Person;
import br.ufc.arida.ecg.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	public List<Person> persons() {
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Tiago", "Vinuto"));
		
		print();
		
		return persons;
	}

    public void print() {
    	System.out.println("Thiago");
    }
}
