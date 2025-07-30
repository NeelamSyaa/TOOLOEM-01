package JavaWithSelenuim;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class mantipletabs {

	public static void main(String[] args) {
		 WebDriver  driver  =  new ChromeDriver();
		 driver.get("");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	String firsttab = driver.getWindowHandle();
      WebDriver tab = driver.switchTo().newWindow(WindowType.TAB);
	                  tab.get("");
    System.out.println(tab.getTitle());
	         WebDriver window = driver.switchTo().newWindow(WindowType.WINDOW);
	         window.get("");
	         System.out.println("");
    Set<String>  alltab	= driver.getWindowHandles();
	 for(String handle:alltab ) {
		 if(!handle.equals(firsttab)) {
			 driver.switchTo().window(handle);
			 System.out.println(driver.getTitle());
			 driver.close();
		 }
	 }

	 driver.switchTo().window(firsttab);
	 System.out.println(driver.getTitle());
	 driver.quit();
	}

}
