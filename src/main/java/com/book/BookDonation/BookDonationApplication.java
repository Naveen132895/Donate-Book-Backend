package com.book.BookDonation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.prograd.controller.RegistrationController;

@SpringBootApplication()
@EntityScan({"com.book.model"})
@EnableJpaRepositories({"com.book.dao"})
//@ComponentScan(basePackageClasses=RegistrationController.class)
@ComponentScan({"com.book.controller"})
@ComponentScan({"com.book.service"})
public class BookDonationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDonationApplication.class, args);
	}

}
