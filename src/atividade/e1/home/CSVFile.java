package atividade.e1.home;

import java.io.FileWriter;
import java.io.IOException;


public class CSVFile {
	
	public void criar(String Color, String Model, String Type, String LicensePlate) throws IOException{
		
		FileWriter fw = new FileWriter("output.csv");
		
		fw.write("Color,");
		fw.write("Model,");
		fw.write("Type,");
		fw.write("License Plate");
		fw.write("\r\n");
		fw.write(Color + ",");
		fw.write(Model+ ",");
		fw.write(Type+ ",");
		fw.write(LicensePlate);
		
		fw.close();
	}
	
	public static void main(String[] args)  {	
			
	}
	
}
