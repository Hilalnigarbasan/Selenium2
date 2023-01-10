package homework;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class H03_FakerClass extends TestBase {

    @Test
    public void FakerClassTest() {

        //1."https://facebook.com" Adresine gidin
        driver.get("https://facebook.com");
        Faker faker = new Faker();

        //2."create new account" butonuna basin
        driver.findElement(By.xpath("//*[text( )='Create New Account']")).click();

        //3."firstName" giris kutusuna bir isim yazin
        driver.findElement(By.xpath("//*[@name='firstname']")).click();
        String fName = faker.name().firstName();
        System.out.println(fName);

        //4."surname" giris kutusuna bir soyisim yazin
        driver.findElement(By.xpath("//*[@name='lastname']"));
        String lName = faker.name().lastName();
        System.out.println(lName);

        //5. "email" giris kutusuna bir email yazin
        driver.findElement(By.xpath("//*[@name='reg_email__']"));
        System.out.println(faker.internet().emailAddress());

        //6. "email" onay kutusuna emaili tekrar yazin


        //7. Bir sifre girin
        //8. Tarih icin gun secin
        //9. Tarih icin ay secin
        //10. Tarih icin yil secin
        //11. Cinsiyeti secin
        //12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        //13. Sayfayi kapatin




    }

}
