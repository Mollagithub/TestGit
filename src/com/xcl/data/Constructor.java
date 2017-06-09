package com.xcl.data;


public class Constructor {

	public Constructor(String Customername, int CustomerNo,String JoingDate){	
		String Name=Customername;	
		int Cno=CustomerNo;
		String JoinDate=JoingDate;
		System.out.println(Customername);
		System.out.println(CustomerNo);
		System.out.println(JoingDate);
	}
public static void main(String []args){
	
Constructor EXM=new Constructor("Arif", 001, "0127");
//Exam0409 Ex = new Exam0409();
	
	
}


}
