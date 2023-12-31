package com.colourPrinter.configClassPro.colourPrintersImpl;

import com.colourPrinter.configClassPro.colourPrinters.BluePrinter;
import com.colourPrinter.configClassPro.colourPrinters.ColourPrinter;
import com.colourPrinter.configClassPro.colourPrinters.GreenPrinter;
import com.colourPrinter.configClassPro.colourPrinters.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter{

	RedPrinter redPrinter;
	GreenPrinter greenPrinter;
	BluePrinter bluePrinter;
	
	public ColourPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
		this.redPrinter = redPrinter;
		this.greenPrinter = greenPrinter;
		this.bluePrinter = bluePrinter;
	}


	@Override
	public String print() {
		// TODO Auto-generated method stub
		return String.join(",",redPrinter.print(), greenPrinter.print(), bluePrinter.print());
	}
	
	

}
