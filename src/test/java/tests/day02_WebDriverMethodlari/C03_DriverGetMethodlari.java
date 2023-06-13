package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wisequarter.com");

        Thread.sleep(13000);
        System.out.println(driver.getTitle());

        // Sayfa title'inin Wise icerdigini test edin

        String expectedIcerik = "Wise";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title Wise icermiyor, Test FAILED");
        }
        // Url'in https://www.wisequarter.com oldugunu test edin

        String expectedUrl = "https://www.wisequarter.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url testi FAILED");
            System.out.println("Actual Url : " + actualUrl);
        }


        System.out.println(driver.getPageSource());
        // sayfa kaynagi testlerde cok kullanilmaz


        System.out.println(driver.getWindowHandle()); // AB3A72CDF62B4529746B1D4175E3FE2F
        // Sistemde her olusturulan browser icin unique bir window handle degeri atanir
        // bu handle degeri sayfalar arasinda gecis yapmak icin kullanilir
        // bu window acik iken biz baska bir windowda calisiyorsak
        // ve bu window'a gecmek istiyorsak
        // driver'a "window handle degeri AB3A72CDF62B4529746B1D4175E3FE2F olan window'a git" dersek
        // driver bu window'a gecis yapar
        //

        System.out.println(driver.getWindowHandles());
        // bulundugumuz class'daki driver tarafindan olusturulan
        // ve acik olan tum window'larin window handle degerlerini
        // bir Set olarak bize dondurur
        driver.close();
    }
}
