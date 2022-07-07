package week3.day2.assignments;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		//Initializing chromedriver using webdriver manager
		WebDriverManager.chromedriver().setup();
		
		//Creating object for chromedriver and maximizing the chrome
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implementing implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Loading the url
		driver.get("https://www.ajio.com/");
		
		//Locating search box and typing bags and pressing enter 
		WebElement elementSearch = driver.findElement(By.name("searchVal"));
		elementSearch.sendKeys("bags",Keys.ENTER);
		
		//Choosing gender as men 
		WebElement elementGenderMen = driver.findElement(By.xpath("//label[@for='Men']"));
		elementGenderMen.click();
		Thread.sleep(2000);
		
		//Choosing fashion bags in category
		WebElement elementMenFasion = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
		elementMenFasion.click();
		Thread.sleep(2000);

		//Printing the count of the items Found
		WebElement elementTotalItems = driver.findElement(By.className("length"));
		String totalItems = elementTotalItems.getText();
		Thread.sleep(2000);
		System.out.println("Total Items Found: " + totalItems);
		
		//Printing the list brand size
		System.out.println("List of Brands");
		List<WebElement> bagList = driver.findElements(By.className("brand"));
		System.out.println("size: " + bagList.size());
		
		//Printing the names of bags
		System.out.println(" Names of the Bags");
		for (WebElement bag : bagList) {
			String text = bag.getText();
			System.out.println(text);
		}
		
	}
}
