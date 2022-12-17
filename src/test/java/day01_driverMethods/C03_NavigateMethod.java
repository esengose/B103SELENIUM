package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");

        //techpro sayfasına gidelim
        Thread.sleep(2000);                      //Thread.sleep() exception atar.
        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasına dönelim
        Thread.sleep(2000);
        driver.navigate().back();

        //Tekrar techpro sayfasına gidelim
        Thread.sleep(2000);
        driver.navigate().forward();

        //Son sayfada sayfayı yenileyelim
        Thread.sleep(2000);
        driver.navigate().refresh();

        //Sayfayı kapatalım
        driver.close();

       // get(), belirli bir URL’de (web sitesinde) gezinmek ve sayfa yüklenene kadar beklemek için kullanılır. sürücü.
        // Navigation(), belirli bir URL’ye gitmek için kullanılır ve sayfanın yüklenmesini beklemez

    }
}
