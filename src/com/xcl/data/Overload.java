package com.xcl.data;


public class Overload {
	  public void sum(String Name,int No){
		  System.out.println(Name+"   "+No);
		  }
	  
	  
	   public void sum(String Name,int No,String Joindate){
		   System.out.println(Name+"        "+No+"           "+Joindate);
		   }

	   public static void main(String args[]){
	      Overload Result = new Overload();
	      Result.sum("Molla",30);
	      Result.sum("Molla",20,"jan 0227");
	   }
	}

