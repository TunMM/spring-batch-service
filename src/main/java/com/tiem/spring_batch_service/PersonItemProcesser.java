package com.tiem.spring_batch_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcesser implements ItemProcessor<Person, Person> {

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcesser.class);
	
	@Override
 	public Person process(Person person) throws Exception {
		
		Person transformedPerson = new Person(person.firstName().toUpperCase(), person.LastName().toUpperCase());
		
		log.info("Converting ("+person+") to ("+transformedPerson+")");
		
		return transformedPerson;
	}

}
