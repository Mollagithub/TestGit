package com.xcl.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadfromWebApp {

	public static void main(String[] args) throws IOException {
	      
	    //===============Write to file=================    
	        
	        File writeFile=new File("/Users/muhammadamolla/Desktop/sara.txt") ;
	        writeFile.createNewFile();
	        FileWriter fw=new FileWriter(writeFile);
	        BufferedWriter bw=new BufferedWriter(fw);
	        
	        bw.write("/tGoogle Report/n");
	        bw.write("/t================/n");
	        
	        
	        
	        
	        
	        
	    //    =========================== Read from file
	        File filenm=new File("/Users/muhammadamolla/Desktop/sara.txt");
	        
	        FileReader fr=new FileReader(filenm);
	        BufferedReader br=new BufferedReader(fr);    
	        System.out.println(br);
	        String line="";
	        
	        if(!filenm.exists()){
	            System.out.println("File doesnt exists");
	        }else{
	        
	        while((line=br.readLine())!= null){
	            
	            String [] split=line.split(",");
	            String URL=split[0];
	            String expectedTitle=split[1];
	            
	            
	        webdriver(URL,expectedTitle, bw);    
	        }
	        }
	        
	    }

	    public static void webdriver(String URL, String expectedTitle, BufferedWriter bw) throws IOException {
	        
	        
	        
	        WebDriver driver=new FirefoxDriver();
	        driver.get(URL);
	        
	        driver.manage().window(). maximize();
	        
	        String ExpectedTitle=expectedTitle;
	        String actualTilte=driver.getTitle();
	        
	        if(actualTilte.equals( ExpectedTitle)){
	            System.out.println("Title match");
	            bw.write(actualTilte+ ""+expectedTitle+" "+"Title Match");
	        }else{
	            System.out.println("Title mismatch");
	            bw.write(actualTilte+ ""+expectedTitle+" "+"Titlle Mismatch");
	            driver.close();
	        }
	        
	        
	        
	    bw.close();    
	    

	}

}
