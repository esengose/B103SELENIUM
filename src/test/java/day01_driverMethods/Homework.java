package day01_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {
    //Youtube ana sayfasina gidelim . https://www.youtube.com/
    //Amazon sayfasina gidelim. https://www.amazon.com/
    //Tekrar YouTube’sayfasina donelim
    //Yeniden Amazon sayfasina gidelim
    //Sayfayi Refresh(yenile) yapalim
    //Sayfayi kapatalim / Tum sayfalari kapatalim


   /* Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfanin konumunu ve boyutlarini yazdirin
    Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
    Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
    Sayfayi kapatin*/

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // driver.get("https://youtube.com/");
        //driver.get("https://amazon.com/");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
        //driver.close();

        driver.get("https://amazon.com/");
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        //driver.manage().window().setSize(Dimension,1600);







    }





}
