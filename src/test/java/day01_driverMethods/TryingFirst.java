package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryingFirst {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        /*
        En temel haliyle otomasyon yapmak için Classımıza otomasyon için gerekli olan webdriver ın yerini göstermemiz gerekir.Bunun için
        Java kütüphanesinden System.setProperty() methodunun içine ilk olarak driver ı yazarız. İkinci olarak driver ın fiziki yolunu kopyalarız.
         */

    }


}
