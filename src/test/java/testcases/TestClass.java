package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver;
    @Test
    public void testingMethod(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver= new ChromeDriver(options);
        driver.get("https://google.com");
        System.out.println("Browser launched with "+driver.getTitle());
        driver.quit();

    }
}
