package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        /*
    1)Browser'ı maximize yapalım
    2)tüm sayfa için max. bekleme süresi olarak 15 sn. belirleyelim
    3)Sırasıyla Amazon facebook ve youtube sayfalarına gidelim
    4)Amazon Sayfasına tekrar dönelim
    5)Amazon sayfasının Url'nin https://www.amazon.com adresine eşit olduğunu test edelim
    6)Sayfanın konumunu ve pozisyonunu yazdıralım
    7)Sayfanın konumunu ve size ını istediğimiz şekilde ayarlayalım ve istediğimiz şekilde olduğunu test edelim.
    8)  Sayfayı kapatalım
 */
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com/");

        driver.get("https://facebook.com/");

        driver.get("https://youtube.com/");

        driver.navigate().back();
        driver.navigate().back();

        String actualurl= driver.getCurrentUrl();
        if(actualurl.equals("https://www.amazon.com")){
            System.out.println("url test passed");
        } else {
            System.out.println("url test failed");}

        System.out.println(driver.manage().window().getSize());

        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setPosition( new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));

        Dimension actualnewsize=driver.manage().window().getSize();
        if(actualnewsize.getWidth()==600&&actualnewsize.getHeight()==600){
            System.out.println("size test passed");} else{
            System.out.println("size test failed");
        }
        Point actualnewlocation=driver.manage().window().getPosition();
        if(actualnewlocation.getX()==50 && actualnewlocation.getY()==50){
            System.out.println("position test passed"); }else{
            System.out.println("position test failed");
        }

        driver.close();
    }
}
