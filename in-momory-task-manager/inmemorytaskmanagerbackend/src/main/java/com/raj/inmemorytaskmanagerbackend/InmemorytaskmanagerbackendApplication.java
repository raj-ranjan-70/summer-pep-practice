package com.raj.inmemorytaskmanagerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class InmemorytaskmanagerbackendApplication {

	public static HashMap<Integer, Tasks> tasks = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(InmemorytaskmanagerbackendApplication.class, args);
	}

}
