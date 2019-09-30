package MySeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
//      System.out.println(projectPath);
        
        System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqeel\\eclipse-workspace\\MySeleniumFramework\\Drivers\\chromedriver.exe");
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://cnn.com");
		
		String chromeTitle = chromedriver.getTitle();
		
		System.out.println(chromeTitle + " From ChromeDriver");
		
		chromedriver.close();
		
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
		
		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.get("https://bbc.com");
		
		String firefoxTitle = firefoxdriver.getTitle();
		
		System.out.println(firefoxTitle + "From FirefoxDriver");
		
		firefoxdriver.close();
	}

}
