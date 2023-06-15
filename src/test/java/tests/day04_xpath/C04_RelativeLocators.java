package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //2 ) Berlin’i  3 farkli relative locator ile locate edin
        /*
            Berlin Webelementi'nin HTML kodlari
            <img id="pid7_thumb" src="bots/sl-berlin-bot.png" class="ui-li-thumb">

            Normalde locate edip kullanabildigimiz bir webelement icin buna ihtiyac yoktur

            Relative locators, HTML ozelliklerini gordugumuz halde locate EDEMEDIGIMIZ
            bir webelement varsa kullanilir.

            Bu soruda ornek olmasi amaciyla BERLIN elemanini LOCATE EDEMEDIGIMIZI varsayiyoruz

            Bu durumda Berlin webelementininetrafindaki web elementleri locate edip
            Berlin'i onlar uzerinden tarif edecegiz
         */

        //3 ) Relative locator’larin dogru calistigini test edin


        WebElement bostonElementi = driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement sailorElementi = driver.findElement(By.xpath("//img[@id='pid11_thumb']"));
        WebElement byAreaElementi = driver.findElement(By.xpath("//img[@id='pid8_thumb']"));
        WebElement nYCElementi = driver.findElement(By.xpath("//img[@id='pid3_thumb']"));


        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElementi));

        WebElement berlin2 = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(nYCElementi).toRightOf(bostonElementi));

        WebElement berlin3 = driver.findElement(RelativeLocator.with(By.className("ui-li-thumb")).toLeftOf(byAreaElementi));


        // 1.locator test icin
        String expectedIdValue= "pid7_thumb";
        String actualIdValue1 = berlin1.getAttribute("id");

        if (expectedIdValue.equals(actualIdValue1)){
            System.out.println("1. Relative Locator Testi PASSED");
        }else {
            System.out.println("1. Relative Locator Testi FAILED");
        }

        // 2.locator testi icin

        String actualIdValue2= berlin2.getAttribute("id");

        if (expectedIdValue.equals(actualIdValue1)){
            System.out.println("2. Relative Locator Testi PASSED");
        }else {
            System.out.println("2. Relative Locator Testi FAILED");
        }

        // 3.locator testi icin

        String actualIdValue3= berlin3.getAttribute("id");

        if (expectedIdValue.equals(actualIdValue1)){
            System.out.println("3. Relative Locator Testi PASSED");
        }else {
            System.out.println("3. Relative Locator Testi FAILED");
        }


        driver.close();

    }
}
