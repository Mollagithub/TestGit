package com.xcl.data;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment001 {

	public void Report(String Report){
		String Filename="county.text";
		try {
			PrintWriter outputStrem=new PrintWriter(Filename);
			outputStrem.println(Report);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Assignment001 rep=new Assignment001();
		rep.Report("rs");
		
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("file:///Users/muhammadamolla/Desktop/Create%20a%20HTML%20select%20Box%20%20which%20should%20contain%20all%20the%20Countries%20Name.htm");
		driver.manage().window().maximize();
			WebElement select = driver.findElement(By.xpath("html/body/center/form/select[1]"));
			Select dropDown = new Select(select);           
			String selected = dropDown.getFirstSelectedOption().getText();
			if(selected.equals("Bangladesh")){
				System.out.println("No element is slected go to List");
			}
			List<WebElement> Options = dropDown.getOptions();
			for(WebElement option:Options){
			    if(option.getText().equals("Bangladesh")) {
			      option.click();
			      System.out.println(option.getText());
			    }
			}
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String Username="Arif";
			String Password="Arif";
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",Username,Password);//is not excuite because of oracle is not download in mace			
			Statement st=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("Select *from Country where countryname=Bangladesh");
			System.out.println(""+rs.getString(1));
			
		     driver.close();
	}



	
			    

}
