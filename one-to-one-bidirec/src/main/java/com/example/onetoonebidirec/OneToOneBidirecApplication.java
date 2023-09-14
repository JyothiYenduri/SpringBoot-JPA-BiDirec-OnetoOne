package com.example.onetoonebidirec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetoonebidirec.entity.Passport;
import com.example.onetoonebidirec.entity.Person;
import com.example.onetoonebidirec.repository.PassportRepository;
import com.example.onetoonebidirec.repository.PersonRepository;

@SpringBootApplication
public class OneToOneBidirecApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneBidirecApplication.class, args);
	}

	@Autowired
	private PersonRepository p;
	@Autowired
	private PassportRepository pr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Person per=new Person();
		per.setName("Jeeva");
		
		Passport pass=new Passport();
		pass.setPassportNumber("Ind12345");
		
		per.setPassport(pass);
		pass.setPerson(per);
		
		p.save(per);
		
	}

}
