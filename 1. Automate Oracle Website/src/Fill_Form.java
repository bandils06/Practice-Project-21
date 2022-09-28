import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_Form {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\\\phase5-lib\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement email_id = driver.findElement(By.id("sView1:r1:0:email::content"));
		email_id.sendKeys("akdjfosh@gmail.com");
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		WebElement pass = driver.findElement(By.name("sView1:r1:0:password"));
		pass.sendKeys("1A23@45678");
		
		WebElement rePass = driver.findElement(By.name("sView1:r1:0:retypePassword"));
		rePass.sendKeys("1A23@45678");
		
		WebElement con = driver.findElement(By.name("sView1:r1:0:country"));
		rePass.sendKeys("India");
		
		WebElement fname= driver.findElement(By.name("sView1:r1:0:firstName"));
		fname.sendKeys("ABCD");
		
		WebElement lname= driver.findElement(By.name("sView1:r1:0:lastName"));
		lname.sendKeys("EFGH");
		
		WebElement jtitle= driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jtitle.sendKeys("FSD");
		
		WebElement ph= driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		ph.sendKeys("9876543210");
		
		WebElement cName= driver.findElement(By.id("sView1:r1:0:companyName::content"));
		cName.sendKeys("ABC Ltd.");
		
		WebElement add= driver.findElement(By.name("sView1:r1:0:address1"));
		add.sendKeys("2A EFD Ltd.");
		
		WebElement city= driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Delhi");
		
		WebElement state= driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Uttar Pradesh");
		
		WebElement postal= driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		postal.sendKeys("987654");

	}

}
