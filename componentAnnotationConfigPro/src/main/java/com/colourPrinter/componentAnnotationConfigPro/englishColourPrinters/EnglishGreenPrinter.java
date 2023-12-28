package com.colourPrinter.componentAnnotationConfigPro.englishColourPrinters;

import org.springframework.stereotype.Component;

import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.GreenPrinter;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Green";
	}

}
