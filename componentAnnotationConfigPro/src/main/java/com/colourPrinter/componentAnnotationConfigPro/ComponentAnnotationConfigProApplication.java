package com.colourPrinter.componentAnnotationConfigPro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.ColourPrinter;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
@Component
public class ComponentAnnotationConfigProApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComponentAnnotationConfigProApplication.class, args);
	}
	
	private ColourPrinter colourPrinter;

	public ComponentAnnotationConfigProApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info(colourPrinter.print());
		
	}

}
