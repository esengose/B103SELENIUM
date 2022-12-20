package day03_xpathCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Css {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // 3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Spend less";
        if(actualTitle.contains(arananKelime)){
            System.out.println("test passed");
        }else{
            System.out.println("tet failed");}

        //6-Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
        //7-Birthday butonuna basin
        driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();
        //8-Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestseller1=driver.findElements(By.cssSelector("img[alt ='Amazon.com eGift Card']"));
        bestseller1.get(0).click();
        // 9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunucreti=driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if(urunucreti.getText().equals("$25.00")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        //10-Sayfayi kapatin
        driver.close();




    }
}
