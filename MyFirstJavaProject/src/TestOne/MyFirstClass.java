package TestOne;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MyFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\bazbo\\Desktop\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		 String baseUrl = "http://demo.guru99.com/selenium/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        //close Fire fox
	        driver.close();
	       
	}

}
