package com.colourPrinter.componentAnnotationConfigPro.colourPrinterImpl;

import org.springframework.stereotype.Component;

import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.BluePrinter;
import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.ColourPrinter;
import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.GreenPrinter;
import com.colourPrinter.componentAnnotationConfigPro.colourPrinters.RedPrinter;

@Component
public class ColourPrinterImpl implements ColourPrinter{
	
	private RedPrinter redPrinter;
	
	private BluePrinter bluePrinter;
	
	private GreenPrinter greenPrinter;
	
	public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
		this.redPrinter = redPrinter;
		this.bluePrinter = bluePrinter;
		this.greenPrinter = greenPrinter;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return String.join(",", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
	}

}
