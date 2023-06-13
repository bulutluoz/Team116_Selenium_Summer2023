package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
            Implicitly wait Selenium'dan gelen DINAMIK bir beklemedir
            Sayfanin yuklenmesi veya islem yapilacak web elementlerin bulunmasi icin
            beklenecek MAXIMUM sureyi belirler

            Driver bu sure dolana kadar verilen gorevin yapilip yapilmadigini kontrol eder
            bu sure icerisinde gorev yapilamazsa
            Exception firlatip calismayi durdurur

         */

        driver.get("https://www.wisequarter.com");
        System.out.println("Baslangic konumu : "+driver.manage().window().getPosition());
        System.out.println("Baslangic size : " + driver.manage().window().getSize());


        driver.manage().window().setSize(new Dimension(1200,500));
        driver.manage().window().setPosition(new Point(100,200));

        System.out.println("Degisen yeni konum : "+driver.manage().window().getPosition());
        System.out.println("Degisen yeni size : " + driver.manage().window().getSize());





        Thread.sleep(3000);
        // Java'dan gelir ve yazdigimiz sure miktarinca kodlari bekletir
        driver.close();
    }
}
