//package demoqa;
//import java.util.concurrent.TimeUnit;
//
//public class Bookstore_demo {
//
//	public static void main(String[] args) {
//WebDriver driver;
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN10\\Downloads\\chromedriver99\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/");
//		WebElement bookstore_card= driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", bookstore_card);
//		bookstore_card.click();
//		driver.findElement(By.id("login")).click();
//		driver.findElement(By.xpath("//button[@id='newUser']")).click();
//		
//		String first_name = "Shafaque"; 
//		String last_name= "Mallick";
//		String userName= "Shafaque_ReGrow";
//		String password= "1234A";
//		driver.findElement(By.id("firstname")).sendKeys(first_name);
//		driver.findElement(By.id("lastname")).sendKeys(last_name);
//		driver.findElement(By.id("userName")).sendKeys(userName);
//		driver.findElement(By.id("password")).sendKeys(password);
//
//	}
//
//}
