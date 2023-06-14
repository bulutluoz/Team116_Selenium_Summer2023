package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryElementleriList = driver.findElements(By.className("panel-heading"));

        //4- Category bolumunde 3 element oldugunu test edin
        int expectedKategoriSayisi = 3;
        int actualKategoriSayisi = categoryElementleriList.size();

        if (expectedKategoriSayisi == actualKategoriSayisi){
            System.out.println("Kategori sayisi testi PASSED");
        }else {
            System.out.println("Kategori sayisi testi FAILED");
        }

        //5- Category isimlerini yazdirin
        /*
        System.out.println(categoryElementleriList);

            Biz bir listeyi direk olarak yazdirabiliriz
            ANCAK
            Bu liste WebElement'ler icerdigi icin
            direk yazdirmak istersek
            bize 3 tane referans degeri yazdirir

            WebElementleri direk yazdiramayacagimiz icin
            bir for-each loop kullanarak
            herbir webElement'i alip
            onun uzerindeki text'i yazdirmaliyiz
         */

        for (WebElement eachElement:categoryElementleriList
             ) {

            System.out.println(eachElement.getText());
        }


        //6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();
    }
}
