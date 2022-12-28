package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {
    // Navigate to website  https://testpages.herokuapp.com/styled/index.html
    // Under the  ORIGINAL CONTENTS click on Alerts
    // print the URL
    // navigate back
    // print the URL
    // Click on Basic Ajax
    // print the URL
    // enter value-> 20 and Enter
    // and then verify Submitted Values is displayed open page
    // close driver

    static WebDriver driver;

    @BeforeClass
    public static void beforeclass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Before
    public void setUp(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

    @Test
    public void Test1(){
        driver.findElement(By.xpath("//*[@href='/alert.html']")).click();

    }

    @Test
    public void Test2(){
        String expectedUrl = driver.getCurrentUrl();
        System.out.println("Sayfa Url'si" +expectedUrl);
    }


}
