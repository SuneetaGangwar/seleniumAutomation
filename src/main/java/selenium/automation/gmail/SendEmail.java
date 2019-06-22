package selenium.automation.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendEmail {

	public static void main(String[] args) {
		sendGmail();

	}

	public static void sendGmail() {
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}
}