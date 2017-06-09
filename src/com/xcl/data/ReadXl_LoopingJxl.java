package com.xcl.data;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadXl_LoopingJxl {
	private String inputFile;

    public void setInputFile(String inputFile) 
    {
        this.inputFile = inputFile;
    }

    public void read() throws IOException, Exception  
    {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        
        {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);
            // Loop over first 10 column and lines

            for (int j = 0; j < sheet.getColumns(); j++) 
            {
                for (int i = 0; i < sheet.getRows(); i++) 
                {
                    Cell cell = sheet.getCell(j, i);
                    System.out.println(cell.getContents());
                }
            }
        
        }
    }

    public static void main(String[] args) throws Exception 
    {
    	ReadXl_LoopingJxl test = new ReadXl_LoopingJxl();
        test.setInputFile("/Users/muhammadamolla/Documents/Xldata.xls");
        test.read();
        
    }



}
