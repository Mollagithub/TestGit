package com.xcl.data;

import java.io.File;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_byPoi {
//Using Poi
	public static void main(String[] args) throws Exception {
		File xlred=new File("/Users/muhammadamolla/Documents/Xldata.xls");

		System.out.println("Xl sheet read"+xlred);
		
		FileInputStream poifile=new FileInputStream(xlred);
		System.out.println(poifile);
		//Workbook wb=Workbook.getWorkbook(xlred);
		//Sheet sheet = wb.getSheet(0);
		XSSFWorkbook wb=new XSSFWorkbook(poifile);
		XSSFSheet sheet1=wb.getSheetAt(0);
		//String data=sheet1.getRow(0).getCell(, 1);
		String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Read  the xcell "+data1);
		int rownum=sheet1.getLastRowNum()+1;
		int colnum=sheet1.getRow(0).getLastCellNum();
		String [][] arrydata=new String[rownum][colnum];
		//System.out.println(data);
		for(int i=0;i<rownum;i++){
		for(int j=0;j<colnum;j++){
			
			
			
		}
			
			
		}
		wb.close();
	

	}

}
