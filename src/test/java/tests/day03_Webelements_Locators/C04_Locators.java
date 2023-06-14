package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusunun yanindaki today's deals linkini tiklayin

        // WebElement todaysDealsElementi = driver.findElement(By.linkText("Today's Deals"));
        // WebElement todaysDealsElementi = driver.findElement(By.partialLinkText("Deals"));
        /* WebElement todaysDealsElementi = driver.findElement(By.partialLinkText("Today"));

            todaysDealsElementi.click();

            Bir web element sadece click yapmak icin kullanilacaksa
            locate edip, bir webelemente kaydedip, sonra click yapmak yerine

            atama yapmadan, locate ve click islemleri birlikte yapilabilir

            ANCAK bu durumda kodun ne yaptigi sonradan bakanlar icin anlasilir olmayabilir
            metin olarak aciklama olan durumlarda bu sekilde kullanim daha guzel olur
         */


        driver.findElement(By.partialLinkText("Today")).click();



        // acilan sayfada ilk urunu tiklayin
        Thread.sleep(3000);
        List<WebElement> urunElementleriListesi = driver.findElements(By.className("DealGridItem-module__dealItemContent_1vFddcq1F8pUxM8dd9FW32"));

        /*
            bir locator sonuc olarak birden fazla webelement donduruyorsa
            findElements() kullanirsak locator'a uygun olan tum WebElementleri getirirken,
            findElement() kullanirsak locator'a uygun olan WebElement'lerin ILKINI bize getirir

            driver.findElement(By.className(locateBilgisi)).click()
         */
        urunElementleriListesi.get(0).click();

        Thread.sleep(3000);
        driver.close();
    }
}
