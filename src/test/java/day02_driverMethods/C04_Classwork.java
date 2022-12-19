package day02_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class C04_Classwork {
    public static void main(String[] args) {
       /* a.web sayfasına gidin. https://www.amazon.com/
        Search(ara) “city bike”
        Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", ENTER);
       WebElement aramasonucsayi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramasonucsayi.getText());
        driver.close();

    }
}
