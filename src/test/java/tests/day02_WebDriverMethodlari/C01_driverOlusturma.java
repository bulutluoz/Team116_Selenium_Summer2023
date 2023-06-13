package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverOlusturma {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        // bu class'a kullanilacak WebDriver'i ve
        // bu driver ile ilgili dosyalari nerede bulabilecegimizi tanimlar
        WebDriver driver = new ChromeDriver();
        // driver objesi olusturur,
        // bu obje bizim icin istedigimiz web sayfalarina gidebilecek
        // o sayfalarda istedigimiz islemi yapabilecek ozelliklerdedir.
        // Web sayfalarina gidebilmek ve islemler yapabilmek icin bir browser'a ihtiyac oldugundan
        // driver objesi setProperty ile tanimladigimiz browser'in bir kopyasini olusturur
        // ve bu kopya browser ile tum islemleri yapar

        // Selenium 4.7 versiyonu ile kendi webDriver'ini olusturdu
        // Yani biz chromedriver.exe dosyasini indirmemis olsak bile
        // 10.satiri yazmasak da Selenium devreye girip, kendi driver'ini olusturur

    }
}

/*
    Selenium'u projemize dahil edebilmek icin
    normalde maven altyapisini kullaniriz
    Ancak, maven sart degildir.
    Bir framework'e Selenium dosyalarini eklerseniz
    Selenium kutuphanelerini kullanabilirsiniz.

    Bir projeye Selenium eklemenin en ILKEL yolu
    File/ProjectStructure/Modules/Dependencies
    sekmelerini secip, Selenium jar dosyalarini manuel olarak projeye eklemektir

    Ancak bu yontem tek basina yeterli degildir
    Selenium yaninda kullanacagimiz WebDriver'i da projemize eklememiz gerekir.

    Her bilgisayarda kullanilan browser
    ve o browser'in versiyonu farkli olacagindan
    bu yontemi kullandigimizda her class'da
    kullanilacak driver'i sisteme tanitmamiz gerekir

 */