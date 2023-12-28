package com.colourPrinter.componentAnnotationConfigPro.englishColourPrinters;

import org.springframework.stereotype.Component;

import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.RedPrinter;

@Component
public class EnglishRedPrinter implements RedPrinter{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Red";
	}

}
