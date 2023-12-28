package com.colourPrinter.componentAnnotationConfigPro.englishColourPrinters;

import org.springframework.stereotype.Component;

import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.BluePrinter;

@Component
public class EnglishBluePrinter implements BluePrinter {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Blue";
	}

}
