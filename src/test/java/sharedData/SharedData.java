package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); //setam ca testele noastre sa se ruleze headles(adica fara sa deschida browser) in github actions
        driver = new ChromeDriver(options);

        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void clearEnvironemnt() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
