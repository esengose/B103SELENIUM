package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver(); //boş bir browser açtık

        driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz

        System.out.println("sayfanın başlığı :"+driver.getTitle());

        System.out.println("sayfanın url i: "+ driver.getCurrentUrl());

        //Sayfanın kaynak kodları için driver.getPageSource() methodunu kullanırız.

        System.out.println(driver.getWindowHandle());
        //windowhandle(), bizi o window a ait hash codu verir. Biz bu hash degerlerini
         // bir stringe atayıp pencereler arası geçiş yapabiliriz.




    }
}
