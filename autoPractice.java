package CrossAssystPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class autoPractice {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\CD\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");

		    locator();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void locator() {

		try {
			
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email_create")).sendKeys("achorey77@gmai.com");
			driver.findElement(By.id("SubmitCreate")).click();
			
			driver.findElement(By.id("id_gender1")).click();
			driver.findElement(By.id("customer_firstname")).sendKeys("AkshayKc");
			driver.findElement(By.id("customer_lastname")).sendKeys("Kumarr");
			driver.findElement(By.id("passwd")).sendKeys("Akshay1234");
			
			WebElement days_dropdown= driver.findElement(By.id("days"));
			Select day_dd= new Select(days_dropdown);
			day_dd.selectByIndex(8);
			
			WebElement month_dropdown= driver.findElement(By.id("months"));
			Select month_dd= new Select(month_dropdown);
			month_dd.selectByIndex(7);
			
			WebElement yrs_dropdown= driver.findElement(By.id("years"));
			Select year_dd= new Select(yrs_dropdown);
			year_dd.selectByValue("1993");
			
			driver.findElement(By.id("company")).sendKeys("FSS");
			driver.findElement(By.id("address1")).sendKeys("Street 5 PB No 15");
			driver.findElement(By.id("city")).sendKeys("Thane West");

			WebElement state_dropdown= driver.findElement(By.id("id_state"));
			Select state_dd= new Select(state_dropdown);
			state_dd.selectByIndex(9);
			
			driver.findElement(By.id("postcode")).sendKeys("20120");
			driver.findElement(By.id("phone")).sendKeys("7895642");
			driver.findElement(By.id("phone_mobile")).sendKeys("8698275029");
			driver.findElement(By.id("alias")).sendKeys("Home");
			driver.findElement(By.id("submitAccount")).click();

			login();


			
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void login()
	
	{
		
		try {
			
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email")).sendKeys("achorey777@gmai.com");
			driver.findElement(By.id("passwd")).sendKeys("Akshay123");
			driver.findElement(By.id("SubmitLogin")).click();
			
			driver.findElement(By.className("sf-with-ul")).click();
			driver.findElement(By.className("product_img_link")).click();
			
			String parent=driver.getWindowHandle();
			
			System.out.println(parent);
			
			driver.findElement(By.linkText("http://automationpractice.com/img/p/1/1-home_default.jpg")).click();
			
			String child=driver.getWindowHandle();

			System.out.println(child);

			
			driver.findElement(By.className("exclusive")).click();

			Thread.sleep(5000);
			
			driver.findElement(By.className("btn btn-default button button-medium")).click();
			driver.findElement(By.className("button btn btn-default standard-checkout button-medium")).click();
			driver.findElement(By.className("button btn btn-default button-medium")).click();
			driver.findElement(By.id("cgv")).click();
			driver.findElement(By.className("button btn btn-default standard-checkout button-medium")).click();
			driver.findElement(By.className("bankwire")).click();
			driver.findElement(By.className("button-exclusive btn btn-default")).click();
			
			driver.findElement(By.className("account")).click();
			driver.findElement(By.className("icon-list-ol")).click();
			
		System.out.println(driver.findElement(By.className("price")).getCssValue("Total price").toString());	
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		
		
	}
	public static void main(String[] args) {

		autoPractice xp = new autoPractice();
		xp.invokeBrowser();

	}

}
