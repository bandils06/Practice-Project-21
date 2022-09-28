import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_Form {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//email id
		WebElement email_id = driver.findElement(By.id("sView1:r1:0:email::content"));
		email_id.sendKeys("akdjfosh@gmail.com");
		
		//password
		WebElement pass = driver.findElement(By.name("sView1:r1:0:password"));
		pass.sendKeys("AtoZ@1to9");
		
		//retype password
		WebElement rePass = driver.findElement(By.name("sView1:r1:0:retypePassword"));
		rePass.sendKeys("AtoZ@1to9");
		
		//country
		WebElement con = driver.findElement(By.name("sView1:r1:0:country"));
		con.sendKeys("India");
		
		//first name
		WebElement fname= driver.findElement(By.name("sView1:r1:0:firstName"));
		fname.sendKeys("ABCD");
		
		//last name
		WebElement lname= driver.findElement(By.name("sView1:r1:0:lastName"));
		lname.sendKeys("EFGH");
		
		//job title
		WebElement jtitle= driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jtitle.sendKeys("FSD");
		
		//phone number
		WebElement ph= driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		ph.sendKeys("9876543210");
		
		//company name
		WebElement cName= driver.findElement(By.id("sView1:r1:0:companyName::content"));
		cName.sendKeys("ABC Ltd.");
		
		//address
		WebElement add= driver.findElement(By.name("sView1:r1:0:address1"));
		add.sendKeys("2A EFD Ltd.");
		
		//city
		WebElement city= driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Delhi");
		
		//state
		WebElement state= driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Uttar Pradesh");
		
		//postal code
		WebElement postal= driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		postal.sendKeys("987654");
		
		System.out.println("Automation Complete...");

	}

}
