package day11;
import org.junit.Assert;
import org.junit.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
public class C03_FileExist {
    @Test
    public void isExistTest(){
        String userDIR = System.getProperty("user.dir"); //icinde bulunulan klasörün yolunu (Path) verir
        System.out.println(userDIR); // /Users/macmac/IdeaProjects/com.Maven_Junit

        String userHOME =  System.getProperty("user.home"); //bilgisayarimizda bulunan user klasörünü verir
        System.out.println(userHOME);// /Users/macmac

        //logo.jpeg indirip MASAUSTUNE kaydedin
        //Logo masaustunde : /Users/macmac/Desktop
        String dosyaYolu = userHOME +"/Desktop/logo.jpeg";

        //String dosyaYolu = userHOME +"\\Desktop\\logo.jpeg";
        System.out.println(dosyaYolu);
        boolean isExist = Files.exists(Paths.get(dosyaYolu)); //dosyada var ise true, yok ise false
        Assert.assertTrue(isExist);

        /*
        fail verirse -> PATH YANLIS : dosya masa ustunde degil, dosya adi yanlis, ya da arada onedrive gibi ex dosyalar olarak
         */

    }
}