package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C02_SeleniumDriveriOtomatikKullanma {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        // driver objesini her olusturdugumuzda
        // Selenium istedigimiz browser'in bir kopyasini olusturur
        // kapat demezsek olusturulan browser acik kalir

        // Kodlar cok hizli calistigi icin bazi asamalari gozle gorebilmek
        // veya internetdeki yavasliktan dolayi
        // testin failed olmamasi icin
        // Thread.sleep() ile kodlari istedigimiz sure kadar durdurabiliriz

        Thread.sleep(2000);

        driver.get("https://www.amazon.com");
        // get(url) olusturdugumuz kopya browser'i verilen url'e goturur

        Thread.sleep(3000);
        driver.close();
    }
}
