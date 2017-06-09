package com.xcl.data;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_byPoi_forloop {
//Using Poi
	public static void main(String[] args) throws Exception {
		File xlred=new File("/Users/muhammadamolla/Documents/Xldata.xls");
		//File xlred=new File("\\Users\\muhammadamolla\\Documents\\DATA_poi.xlsx");

		System.out.println("Xl sheet read"+xlred);
		
		FileInputStream poifile=new FileInputStream(xlred);
		System.out.println(poifile);
		
		XSSFWorkbook wb=new XSSFWorkbook(poifile);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Read  the xcell "+data1);
		int rownum=sheet1.getLastRowNum()+1;
	
		for(int i=0;i<rownum;i++){
		String Datavalue=	sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(Datavalue);
		//int colnum=sheet1.getRow(0).getLastCellNum();
		//for(int j=0;j<colnum;j++){
			
			
			
			
		}
			
			
		
		wb.close();
	

	}

}
