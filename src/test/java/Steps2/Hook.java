
	package Steps2;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.Before;
	import utils.BaseCommon;
	public class Hook extends BaseCommon {
		private BaseCommon base;
		public Hook() {
		super();
		// TODO Auto-generated constructor stub
		}
		public Hook(BaseCommon base) {
		super();
		this.base = base;
		} @Before
		public void initializeDriver()
		{
		System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		base.div =new ChromeDriver();
		}}

		


