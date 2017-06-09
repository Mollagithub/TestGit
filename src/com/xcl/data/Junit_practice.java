package com.xcl.data;

import org.junit.Test;

public class Junit_practice {


public class Name {
	
	private String name;
	
	public Name(String name) {
		this.name = name;
	}
	@Test
	public void verifyName() {
		if(name.equals("God")) {
			System.out.println("This is a good name");
		} else {
			System.out.println("This is a bad name");
		}
	}

}

	
}
