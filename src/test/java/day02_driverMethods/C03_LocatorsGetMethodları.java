package day02_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class C03_LocatorsGetMethodları {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        //search bölümünü locate edip iphone aratalım
        //Arama sonuç yazısınNDA iphone locate edip konsola yazdıralım
        //Sayfayı yazdıralım

        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",ENTER);
        WebElement aramasonuc=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramasonuc.getText());
        driver.close();
    }
}
