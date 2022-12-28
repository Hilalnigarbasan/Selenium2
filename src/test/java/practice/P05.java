package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {

    //https://id.heroku.com/login sayfasina gidin
    //Bir mail adresi giriniz
    //Bir password giriniz
    //Login butonuna tiklayiniz
    //"There was a problem with your login." texti gorunur ise
    //"kayit yapilamadi" yazdiriniz
    //eger yazi gorunur degilse "kayit yapildi" yazdiriniz
    //sayfayı kapatiniz

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://id.heroku.com/login");
        driver.findElement(By.xpath("id(\"email\")")).sendKeys("hilal@gmail.com");




    }
}