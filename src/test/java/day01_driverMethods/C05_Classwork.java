package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Classwork {

    public static void main(String[] args) {

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://facebook.com/");

        String title = driver.getTitle();
        if (title.contains("Facebook")) {
            System.out.println("Title test passed");
        } else System.out.println("Title testi failed " + title);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String url=driver.getCurrentUrl();
        if (url.contains("facebook")) {
            System.out.println("url test passed");
        } else System.out.println("url testi failed " + url);

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actitle = driver.getTitle();
        if(actitle.contains("Walmart.com")){
            System.out.println("walmart test passes");
        } else System.out.println("walmart test failed");

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Browser’i kapatin
        driver.close();


    }

    }

