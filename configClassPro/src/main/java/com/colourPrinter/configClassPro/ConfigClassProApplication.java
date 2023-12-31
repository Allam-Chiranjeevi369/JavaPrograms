package com.colourPrinter.configClassPro;

import lombok.extern.java.Log;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.colourPrinter.configClassPro.colourPrinters.ColourPrinter;

@SpringBootApplication
@Log
public class ConfigClassProApplication implements CommandLineRunner {
	
	ColourPrinter colourPrinter;
	
	public ConfigClassProApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}



	public static void main(String[] args) {
		SpringApplication.run(ConfigClassProApplication.class, args);
		
	}



	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}

}
