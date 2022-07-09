package com.example.Odontologica2;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Odontologica2Application {


	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		SpringApplication.run(Odontologica2Application.class, args);
	}

}
