package com.passenger.demo;

import com.passenger.demo.passenger.Passenger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> hello(){
		return List.of(
				new Passenger("miss",
						"Emily",
						1234L,
						83L,
						21
				)
		);
	}
}
