package Pega;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args)throws IOException {
		Properties prop = new Properties();
		FileInputStream ips = new FileInputStream("E:\\New Selenium work space\\Testing Framework Pega\\src\\Pega\\config.properties");
		prop.load(ips);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh reddy\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("db.URL"));
		// TODO Auto-generated method stub
		login lpg = new login();
		
		
		try {
			lpg.login(driver, prop);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}


