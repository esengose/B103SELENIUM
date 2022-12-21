package day03_xpathCssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        //        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//        2- Add Element butonuna basin
//        3- Delete butonu'nun gorunur oldugunu test edin
//        4- Delete tusuna basin
//        5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();

        WebElement deletebutonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));

        if (deletebutonu.isDisplayed()) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
//Bir web elementin görünür olup omadığını isDisplayed methodu ile kontrol ederiz
            WebElement addremovelement = driver.findElement(By.xpath("//h3"));
        if(addremovelement.isDisplayed()){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }


}
