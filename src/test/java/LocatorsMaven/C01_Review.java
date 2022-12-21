package LocatorsMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Review {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        driver.get("https://amazon.com/");
        WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        String tagname=searchbox.getText();
        String expected="input";
        if(tagname.equals(expected)){
            System.out.println("tag test passed");
        } else System.out.println("tag test failed");

        String actualattrbtename= searchbox.getAttribute("name");
        String expectedattrbte= "field-keywords";
        if(actualattrbtename.equals(expectedattrbte)){
            System.out.println("attrbte test passed");
        } else System.out.println("attrbte test failed");


    }
}
