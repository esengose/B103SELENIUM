package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Classwork {
    public static void main(String[] args) {
        //Yeni bir package olusturalim : day01
        //Yeni bir class olusturalim : C03_GetMethods
        //Amazon sayfasina gidelim. "https://www.amazon.com/"
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa başlığı : "+driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi passed");
        }else{
            System.out.println("Title testi failed");}

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa url: "+driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualurl=driver.getCurrentUrl();
        if(actualurl.contains("Amazon")){
            System.out.println( "url testi passed");} else
        {System.out.println("url testi failed");
        }
        //Sayfa handle degerini yazdirin
        System.out.println("Sayfa handle degeri: "+ driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfakodlari= driver.getPageSource();
        if(sayfakodlari.contains("Gateway")) {
            System.out.println("Source code testi passed");
        } else{
            System.out.println("Source code testi failed");
        }
        //Sayfayi kapatin.
        driver.close();   //sayfayı kapatmak için close() methodunu kullanıyoruz

        //driver.navigate().to(String Url) String girilen url e gider.   driver.get() gibi





    }
}
