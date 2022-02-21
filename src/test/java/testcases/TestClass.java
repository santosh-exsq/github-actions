package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver;
    @Test
    public void testingMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Browser launched with "+driver.getTitle());
        driver.quit();

    }
}
