package com.colourPrinter.normalProject.ColourPrintersImpl;

import com.colourPrinter.normalProject.ColourPrinters.BluePrinter;
import com.colourPrinter.normalProject.ColourPrinters.ColourPrinter;
import com.colourPrinter.normalProject.ColourPrinters.GreenPrinter;
import com.colourPrinter.normalProject.ColourPrinters.RedPrinter;
import com.colourPrinter.normalProject.TeluguPrinters.TeluguBluePrinter;
import com.colourPrinter.normalProject.TeluguPrinters.TeluguGreenPrinter;
import com.colourPrinter.normalProject.TeluguPrinters.TeluguRedPrinter;

public class ColourPrinterImpl implements ColourPrinter{
	
	private RedPrinter redPrinter;
	private GreenPrinter greenPrinter;
	private BluePrinter bluePrinter;
	
	public ColourPrinterImpl(){
		
		this.redPrinter = new TeluguRedPrinter();
		this.greenPrinter = new TeluguGreenPrinter();
		this.bluePrinter = new TeluguBluePrinter();
		
	}
	
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return String.join(",",redPrinter.print(), greenPrinter.print(), bluePrinter.print());
	}

}
