package Steps2;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseCommon;



public class login2 extends BaseCommon {

private BaseCommon base;


public login2() {
super();
// TODO Auto-generated constructor stub
}



public login2(BaseCommon base, WebDriver driver) {
super();
this.base = base;
this.driver = driver;
}





WebDriver driver=null;

@Given("browser is open")
public void browser_is_open() {
System.out.println("inside steps-browser is open");
System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
//base.div.navigate().to("https://www.amazon.in/");

driver.get("https://www.amazon.in/ ");
//base.div.manage().window().maximize();


}



@When("user is on login page")
    public void user_is_on_login_page() {
    System.out.println("inside steps-user is on login page");
//driver.navigate().to("https://www.booking.com/index.html?aid=375653&label=msn-LOcHQGfA16aswDjFb7_rcw-80539252256335:tikwd-80539278535451:aud-808219487:loc-90:neo:mte:lp158527:dec:qsBooking.com&utm_campaign=Booking%20Name&utm_medium=cpc&utm_source=bing&utm_term=LOcHQGfA16aswDjFb7_rcw&msclkid=ff9ced48fe5610c759978f607873f402");
//driver.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']")).click();
//base.div.navigate().to("https://www.booking.com/index.html?aid=375653&label=msn-LOcHQGfA16aswDjFb7_rcw-80539252256335:tikwd-80539278535451:aud-808219487:loc-90:neo:mte:lp158527:dec:qsBooking.com&utm_campaign=Booking%20Name&utm_medium=cpc&utm_source=bing&utm_term=LOcHQGfA16aswDjFb7_rcw&msclkid=ff9ced48fe5610c759978f607873f402");
//base.div.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']")).click();

    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();

}



@When("user enters username and password")
public void user_enters_username_and_password() {
System.out.println("inside steps -user enters username and pssword");
//WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
//login.click();
//login.sendKeys("kakaderiddhi18@gmail.com");
//driver.findElement(By.xpath("//button[@type='submit']")).click();
////Thread.sleep(1000);
//WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//password.click();
//password.sendKeys("Riddhi@123");
//driver.findElement(By.xpath("//button[@type='submit']")).click();
//WebElement login1 = base.div.findElement(By.xpath("//input[@name='username']"));
//login1.click();
//login1.sendKeys("kakaderiddhi18@gmail.com");
//base.div.findElement(By.xpath("//button[@type='submit']")).click();
////Thread.sleep(1000);
//WebElement password1 = base.div.findElement(By.xpath("//input[@id='password']"));
//password1.click();
//password1.sendKeys("Riddhi@123");
driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("ishwarikhismatrao31@gmail.com");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sonali@123");



//base.div.findElement(By.xpath("//button[@type='submit']")).click();




}



@When("Click on the login button")
public void click_on_the_login_button() {
System.out.println("inside steps-click on the login button");
//driver.findElement(By.xpath("//button[@type='submit']")).click();
//base.div.findElement(By.xpath("//button[@type='submit']")).click();

driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
}



@Then("user is navigate to the homepage")
public void user_is_navigate_to_the_homepage() {
System.out.println("inside steps-user is navigate to the homepage");


}





}

