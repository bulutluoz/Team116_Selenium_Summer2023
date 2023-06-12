package tests.day01_SeleniumIlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_SeleniumIlkOtomasyon {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
    }
}
/*
    Selenium ile testleri calistirirken
    iyi bir orkestra yoneticisi OLMALISINIZ

    Hangi enstrumani ne icin kullanacaginiz
    ve hangi asamada hangi enstrumani projenize dahil edeceginizi
    bilmeniz gerekir

    Selenium ile test otomasyonu icin
    minumum olarak kullanmamiz gereken enstrumanlar
    1- Programlama Dili (Java)
        Projeyi olustururken dahil ettik
    2- IDE (IntelliJ)
       Zaten intelliJ'de calisiyoruz
    3- Selenium Kutuphanesi
       Bunun icin selnium.dev adresinden
       kullandigimiz bilgisayara uygun
       Jar dosyalarini indirim
       projemizin icerisine kopyaladik
       Bu jar dosyalirini projemize eklemek icin
       File/Project Structure / Modules menusunden
       Dependencies tabini secip
       + tusuna basarak Selenium klasorundeki
       tum jar dosyalirini projeye ekledik
    4- WebDriver
      Herkesin bilgisayarinin isletim sistemi ve
      Bilgisayarinda bulunan Google Chrome browser'inin versiyonu
      farkli oldugundan

      Kendi bilgisayarimiz ve Cgrome browser surumune uygun olan
      Selenium.dev adresindeki browser dosyasini indirip projemizin
      altina kopyalamaliyiz

 */