package Kiran;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	public static WebDriver dr;
	public static void main(String[] args) {
		dr= new ChromeDriver();
		dr.get("https://betashop.alter.game/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.findElement(By.xpath("//*[text()='Connect']")).click();
		
		// identify the window id's
		
		Set<String> wind=dr.getWindowHandles();
		System.out.println(wind);
		
		// convert into list
		List<String> windows1= new ArrayList(wind);
		// get the windows by index
		String pwindow= windows1.get(0);
		String cwindow = windows1.get(1);
		//String c1wind=windows1.get(2);
		System.out.println(pwindow);
		System.out.println(cwindow);
		
		dr.switchTo().window(cwindow);
		// login with google
		dr.findElement(By.xpath("//*[text()='Google']")).click();
		
		Set <String> w1= dr.getWindowHandles();
		List<String> win= new ArrayList(w1);
		String win1= win.get(0);
		String win2= win.get(1);
		String win3= win.get(2);		
		// switch to window3
		dr.switchTo().window(win3);
		dr.manage().window().maximize();
		dr.findElement(By.id("identifierId")).sendKeys("maheshogirala828@gmail.com");
		dr.findElement(By.xpath("//span[text()='Next']")).click();
		
}
}
