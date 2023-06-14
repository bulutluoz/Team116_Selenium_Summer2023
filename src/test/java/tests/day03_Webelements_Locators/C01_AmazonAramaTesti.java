package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonAramaTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazan anasayfaya gidin

            driver.get("https://www.amazon.com");

        // Arama cubuguna Nutella yazdirip aratin
        /*
            Bir webelement'i kullanabilmek icin
            Oncelikle o webelementi driver'in bulabilmesi icin Locate etmeliyiz.
            yani yerini tarif edecek bilgiye ulasmaliyiz

            amazon arama cubugu icin bu bilginin id = twotabsearchtextbox oldugunu
            amazon sayfasinda arastirma yaparak bulduk

            Sonra bu locate bilgisini kullanarak,
            web sayfasinda o elementi bulup, bu class'da o webleementi kullanabilmek icin kaydedecek
            bir hazir method'a ihtiyacimiz var

         */

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        /*
            Bu satirda 3 islem yapiliyor
            1- locate islemi : id = twotabsearchtextbox
            2- bu locate'i kullanarak istedigimiz arama kutusunu bize getirecek method
                driver.findElement(locate stratejisi)
            3- locate edip, findElement() ile buldugumuz web elementi
               icinde bulundugumuz class'da kullanabilmek icin
               bir WebElement objesine ATAMAK
         */

        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();
        // Arama sonuclarinin Nutella icerdigini test edin

        WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));
        /*
        System.out.println(aramaSonucElementi);
        aramaSonucElementi objesini bir WebElement olarak olusturduk
        WebElement bir primitive data turu olmadigindan
        direk yazdirmak istersek referansini yazdirir

         */
        System.out.println(aramaSonucElementi.getText());

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = aramaSonucElementi.getText();

        if(actualSonucYazisi.contains(expectedIcerik)){
            System.out.println("Nutella arama testi PASSED");
        }else {
            System.out.println("Nutella arama testi FAILED");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
