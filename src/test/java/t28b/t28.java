package t28b;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t28 {

public static WebDriver dr;
	
	public static void main(String[] args) throws Throwable {
		dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://testautomationpractice.blogspot.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("// input[@ class= 'wikipedia-search-input']")).sendKeys("Testing");
		dr.findElement(By.xpath("// input[@ class= 'wikipedia-search-button']")).click();
		
	   List<WebElement> w1=dr.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
		
		//List<WebElement> w2=dr.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		// int size=w2.size();
	 //w2.get(size=0).click();
		int size=w1.size();
		System.out.println(size);
		
		
		System.out.println(w1.get(size-2).getText());
		
		for(int i=0; i<size-1; i++) {
			String out=w1.get(i).getText();
			System.out.println(out);
			if(out.equals("Testing effect")) {
				w1.get(i).click();
			}
		}
		
		
		
	
	
	
	
}}
