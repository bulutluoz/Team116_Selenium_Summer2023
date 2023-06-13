package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://wisequarter.com");
        // driver'a url verirken www yazmasaniz da calisir
        // ANCAK https yazmazsaniz calismaz

        System.out.println("Ilk sayfanin size degeri : "+driver.manage().window().getSize());
        System.out.println("Ilk sayfanin konumu : "+driver.manage().window().getPosition());

        driver.manage().window().maximize();

        System.out.println("Maximize size degeri : "+driver.manage().window().getSize());
        System.out.println("Maximize konumu : "+driver.manage().window().getPosition());
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        System.out.println("Fullscreen size degeri : "+driver.manage().window().getSize());
        System.out.println("Fullscreen konumu : "+driver.manage().window().getPosition());



        Thread.sleep(3000);
        driver.close();

    }
}
