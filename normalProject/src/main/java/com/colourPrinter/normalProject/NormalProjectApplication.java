package com.colourPrinter.normalProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.colourPrinter.normalProject.ColourPrinters.ColourPrinter;
import com.colourPrinter.normalProject.ColourPrintersImpl.ColourPrinterImpl;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class NormalProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NormalProjectApplication.class, args);
		ColourPrinter colourPrinter = new ColourPrinterImpl();
		System.out.println(colourPrinter.print());
	}

	@Override
	public void run(String... args) throws Exception {
//		final ColourPrinter colourPrinter = new ColourPrinterImpl();
//		log.info(colourPrinter.print());
	}

}
