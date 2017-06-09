package com.xcl.data;

public class Interface {
	  
    
    
    public static void main(String[] args) {
         
    	Deposit Totaldeposit=new circle();
           
             Totaldeposit.Draw();
    }
}
 
interface Deposit
 {
     public   String baseclass="Deposit";
      
     public void Draw();  
     
      
 }
 class circle implements Deposit
 
 
 {
 
  public void Draw() {
        System.out.println("Drawing Circle here");
    }
      
      
 }
