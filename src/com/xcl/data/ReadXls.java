package com.xcl.data;
import java.io.File;

import jxl.Workbook;
public class ReadXls {
	
	//using By Jxl
	
	public void data1() throws Exception{
		File fl= new File("/Users/muhammadamolla/Documents/Xldata.xls");
		Workbook wb=Workbook.getWorkbook(fl);
		String Data=wb.getSheet(0).getCell(0, 1).getContents();
		System.out.println(Data);
		
	}
	
	public static void main(String []args) throws  Exception{
		ReadXls datared=new ReadXls();
		datared.data1();
		
		File xlred=new File("/Users/muhammadamolla/Documents/Xldata.xls");
		//File xlred=new File("/Users/muhammadamolla/Documents/DATA.xls");

		System.out.println("Xl sheet read");
		Workbook wb=Workbook.getWorkbook(xlred);
		System.out.println("Load Shhet");
		String Daata00=wb.getSheet(0).getCell(0, 0).getContents();
		System.out.println(Daata00);
		String Daata01=wb.getSheet(0).getCell(1, 0).getContents();
		System.out.println(Daata01);
		int rows=wb.getSheet(0).getRows();
		System.out.println(rows);
		

	}

}
