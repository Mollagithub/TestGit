package com.xcl.data;

import java.io.IOException;
import java.io.PrintWriter;

public class Student {
	
	
	public void stadd(String name,int Id) throws IOException{
		
		    PrintWriter writer = new PrintWriter("/Users/muhammadamolla/Desktop/001 IBM Jan.docx");
		    writer.println(name);
		    writer.println(Id);
		    writer.close();
		    System.out.println(writer);		
	}


	public static void main(String[] args) throws IOException {
		Student st =new Student();
		st.stadd("Molla", 001);
		st.stadd("Arif", 002);
		System.out.println("see the file"+st);
		
		

	}

}
