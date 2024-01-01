package com.example.ProdecutSpring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProdecutSpringApplication {

	public static void main(String[] args) {
		
		var Context=  SpringApplication.run(ProdecutSpringApplication.class, args);
		ServecProduct sevrec= Context.getBean(ServecProduct.class);
		sevrec.getAll();
		
	
	}

}
