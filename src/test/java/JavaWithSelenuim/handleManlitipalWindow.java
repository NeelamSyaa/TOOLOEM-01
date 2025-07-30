package JavaWithSelenuim;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public	class handleManlitipalWindow {

	    public static void main(String[] args) {
	        WebDriver  driver = new  ChromeDriver();
	         driver.get("https://openai.com/index/chatgpt/");
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     String  original =driver.getWindowHandle();
	     WebDriver tab = driver.switchTo().newWindow(WindowType.TAB);
                   tab.get("https://www.example.com");
                   System.out.println("New TAB title: " + tab.getTitle());
                   WebDriver wnd = driver.switchTo().newWindow(WindowType.WINDOW);
                   wnd.get("https://www.google.com");
                   System.out.println("New WINDOW title: " + wnd.getTitle());

                   // 4️⃣ Return to original window
                   driver.switchTo().window(original);
                   System.out.println("Back to original: " + driver.getTitle());
	         Set<String>  allmaltipalwindow =driver.getWindowHandles();
	        for(String handle :allmaltipalwindow){
	             if(!handle.equals(original )){
	                 driver.switchTo().window(handle);
	                 System.out.println("get the title of the new  window"  +driver.getTitle());
	                 driver.close();
	             }
	        }
	        driver.switchTo().window(original );
	        System.out.println("get the title of the present window"+driver.getTitle());
	        driver.quit();
	    
	    }
	}

