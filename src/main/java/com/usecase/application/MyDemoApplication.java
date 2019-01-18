package com.usecase.application;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.usecase.demo.dao.UserRepository;
import com.usecase.entity.model.User;

@SpringBootApplication
@EnableJpaRepositories("com.usecase.demo.dao")
public class MyDemoApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User useCase = new User();
		useCase.setFirst_name("java22");
		useCase.setLast_name("angular22");
		useCase.setRegion(2222);
		useCase.setTheatre(1291);
		useCase.setId(101);
		useCase.setCreated_dt(new Date());
		useCase.setUser_id("abcd_ponnandy");
		userRepository.save(useCase);
		User useCaseangular = new User();
		useCaseangular.setFirst_name("springboot");
		useCaseangular.setLast_name("mysql");
		useCaseangular.setUser_id("abcd_rih");
		useCaseangular.setRegion(21);
		useCaseangular.setTheatre(129);
		useCaseangular.setId(102);
		useCaseangular.setCreated_dt(new Date());
	 	userRepository.save(useCaseangular);
		Iterable<User> userList = userRepository.findAll();
		System.out.println("Three users for test purpose: " + userList.toString());
		for (User userExample : userList) {
			System.out.println("just for print Sake : " + userExample.toString());
		}

	}

}
