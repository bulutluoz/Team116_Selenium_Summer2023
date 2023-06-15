package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xpath_cssSelector {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2-  https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3-  Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-  Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5-  Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedIcerik = "Spend less";

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Amazon title testi PASSED");
        }else {
            System.out.println("Amazon title testi FAILED");
        }

        //6-  Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        //7-  Birthday butonuna basin
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        //8-  Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        //9-  Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1' and @value='25'])")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretElementi = driver.findElement(By.cssSelector("#gc-live-preview-amount"));

        String expectedUcret = "25$";
        String actualUcret= ucretElementi.getText();

        if (expectedUcret.equals(actualUcret)){
            System.out.println("Urun ucret testi PASSED");
        } else {
            System.out.println("Urun ucret testi FAILED\nActual ucret : " + actualUcret);
        }
        //11-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
