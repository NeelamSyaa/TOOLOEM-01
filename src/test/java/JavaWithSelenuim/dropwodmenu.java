package JavaWithSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropwodmenu {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
WebElement dropdwombtn = driver.findElement(By.id(""));
dropdwombtn.click();
		Select s = new Select(dropdwombtn);
		s.selectByValue("");
		s.selectByIndex(0);
		s.selectByVisibleText("");
		
	}
}
