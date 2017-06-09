package com.xcl.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.OperationsException;

import org.testng.collections.Lists;
//need modify

public class ReadFilebyArry {

	public static void main(String[] args) throws IOException{
		ReadFilebyArry readfile=new ReadFilebyArry();
		Scanner sc = new Scanner(new File("/Users/muhammadamolla/Desktop/mamunpackage com.docx"));
		List<String> lines = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  lines.add(sc.nextLine());
		  System.out.println(lines);
		  
		}
		String[] arr = lines.toArray(new String[0]);
	}
}
	



