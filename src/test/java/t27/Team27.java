package t27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Team27 {
  public static WebDriver dr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		dr= new ChromeDriver();
		dr.get("");
		dr.manage().window().maximize();
	}

}
