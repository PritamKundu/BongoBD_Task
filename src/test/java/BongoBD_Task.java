import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BongoBD_Task {
    WebDriver driver;

    @BeforeTest
    void Invoke_Url(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://Bongobd.com");

    }

    @Test
    void Window_Maximize(){
        driver.manage().window().maximize();

    }

    @AfterTest
    void HomepageMain_Slider(){

        driver.findElement(By.xpath("//div[contains(@class,'slick-slide slick-active slick-current')]//div//img[contains(@alt,'img')]")).click();
    }
}
