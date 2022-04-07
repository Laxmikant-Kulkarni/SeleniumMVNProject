package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperaBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.operadriver().setup();
		
		WebDriver driver = new OperaDriver();
		
		
		driver.get("https://www.google.com/");

	}

}
