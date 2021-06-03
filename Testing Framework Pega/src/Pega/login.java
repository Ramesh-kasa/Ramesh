package Pega;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	
		// TODO Auto-generated method stub
		public void login(WebDriver driver, Properties prop) throws IOException {
			
			
			
			driver.findElement(By.id("txtUserID")).sendKeys(prop.getProperty("db.username"));
			driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("db.password"));
			driver.findElement(By.id("sub")).click();
			
			driver.findElement(By.name("NewInteraction_pyDisplayHarness_3")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[text()='Phone call']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("97edb6ea")).sendKeys("Ramesh");;
			
	    }	
	 
		

}




