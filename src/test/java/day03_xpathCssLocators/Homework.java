package day03_xpathCssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {
    public static void main(String[] args) throws InterruptedException {


/*
1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  "username" yazdirin
4. Password alanine "password" yazdirin
5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
6. Online Banking menusunden Pay Bills sayfasina gidin
7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
8. tarih kismina "2020-09-10" yazdirin
9. Pay buttonuna tiklayin
10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
*/
        //1. http://zero.webappsecurity.com sayfasina gidin
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.cssSelector("button[id='signin_button']")).click();
        Thread.sleep(2000);

        //3. Login alanine  "username" yazdirin
        driver.findElement(By.cssSelector("input[id='user_login']")).sendKeys("username");
        Thread.sleep(2000);

        //4. Password alanine "password" yazdirin
        driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("password");
        Thread.sleep(2000);

        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        driver.findElement(By.cssSelector("input[name='submit']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        //6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.get("http://zero.webappsecurity.com/online-banking.html");
        driver.findElement(By.cssSelector("span[id='pay_bills_link']")).click();
        Thread.sleep(2000);

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.cssSelector("input[id='sp_amount']")).sendKeys("1500000");
        Thread.sleep(2000);

        //8. tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.cssSelector("input[class='span4 hasDatepicker']")).sendKeys("2020-09-10");
        Thread.sleep(2000);

        //9. Pay buttonuna tiklayin
        driver.findElement(By.cssSelector("input[value='Pay']")).click();

        //10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin

        Thread.sleep(2000);
        WebElement missionCompleted=driver.findElement(By.cssSelector("div[id='alert_content']"));

        if(missionCompleted.isDisplayed()){
            System.out.println("Test Passed");
        } else System.out.println("Test Failed");

driver.close();


    }
}
