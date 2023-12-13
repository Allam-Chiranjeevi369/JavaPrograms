package com.colourPrinter.configClassPro.configFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.colourPrinter.configClassPro.colourPrinters.BluePrinter;
import com.colourPrinter.configClassPro.colourPrinters.ColourPrinter;
import com.colourPrinter.configClassPro.colourPrinters.GreenPrinter;
import com.colourPrinter.configClassPro.colourPrinters.RedPrinter;
import com.colourPrinter.configClassPro.colourPrintersImpl.ColourPrinterImpl;
import com.colourPrinter.configClassPro.englishPrinters.EnglishBluePrinter;
import com.colourPrinter.configClassPro.englishPrinters.EnglishGreenPrinter;
import com.colourPrinter.configClassPro.englishPrinters.EnglishRedPrinter;

@Configuration
public class ColourPrintersConfig {
	
	@Bean
	public RedPrinter redPrinter() {
		
		return new EnglishRedPrinter();
		
	}
	
	@Bean
	public BluePrinter bluePrinter() {
		
		return new EnglishBluePrinter();
		
	}
	
	@Bean
	public GreenPrinter greenPrinter() {
	
		return new EnglishGreenPrinter();
	
	}
	
	@Bean
	public ColourPrinter colourPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
		
		return new ColourPrinterImpl(redPrinter, greenPrinter, bluePrinter);
		
	}

}
