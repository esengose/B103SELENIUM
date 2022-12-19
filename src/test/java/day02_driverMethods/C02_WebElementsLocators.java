package day02_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class C02_WebElementsLocators {
    public static void main(String[] args) {

        //Amazon sayfasına gidelim
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com/");

        //Search bölümünü locate edelim
        driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Saerch bölümünde iphone arayalım
        //aramakutusu.sendKeys("iphone",ENTER);

        /*
        Eğer bir webelementi (web sayfasındaki her bir butonu yada texti) locate (konmu belirleme)
        etmek istersek önce manuel olarak web sayfasını açıp sayfa üzerinde sağ click yapıp incele ye tıklarız(inspect)
        Karşımıza çıkan HTML kodlarından locatorlardan eşsiz olanı seçeriz. Genellikle ID attribute u kullanılır. Seçtiğimiz
        attribute degerini findElement() methodu içine findElement(By.id("attribute degeri")) şeklinde yazarız.

        Yanlış id locate edlirise NoSuchElementException atar.
         */
        WebElement aramakutu=driver.findElement(By.name("field-keywords"));
        aramakutu.sendKeys("iphone",ENTER);

        //Amazon sayfasındaki <input> ve <a>  taglarının sayısını yazdırınız
        List<WebElement> inputTaglist=driver.findElements(By.tagName("input"));
        System.out.println("input tag sayisi = "+inputTaglist.size());

        //a tagı--> linkler in ismini nasıl yazdırırız?
        List<WebElement>aTagList=driver.findElements(By.tagName("a"));
        System.out.println("a tag sayisi = "+aTagList.size());
        for(WebElement w: aTagList){
            System.out.println(w.getText());
        }


    }
}