package Proje7;

import Utility.BaseDriver;
import Utility.MyFunc;
import javafx.scene.input.InputMethodTextRun;
import net.bytebuddy.utility.RandomString;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Test1 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement signup = driver.findElement(By.xpath("//*[text()='Sign Up']"));
        signup.click();

        MyFunc.Bekle(2);

        WebElement firstname=driver.findElement(By.cssSelector("[id='FirstName']"));
        firstname.sendKeys("Alperen");
        MyFunc.Bekle(2);

        WebElement surname=driver.findElement(By.cssSelector("[id='Surname']"));
        surname.sendKeys("Demirci");

        MyFunc.Bekle(2);

        WebElement epost=driver.findElement(By.xpath("//*[@id='E_post']"));
        epost.sendKeys("alperndmrcii@asdasd.com");
        MyFunc.Bekle(2);

        WebElement mobile=driver.findElement(By.xpath("//*[@id='Mobile']"));
        mobile.sendKeys("0555 555 55 55");
        MyFunc.Bekle(2);

        WebElement username=driver.findElement(By.xpath("//*[@id='Username']"));
        String str= RandomString.make(8);
        username.sendKeys(str);
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.xpath("//*[@id='Password']"));
        String password1="asdasdasd";
        password.sendKeys(password1);
        MyFunc.Bekle(2);

        WebElement confirmpass=driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        confirmpass.sendKeys(password1);
        MyFunc.Bekle(2);

        WebElement submitbutton=driver.findElement(By.cssSelector("[id='submit']"));
        submitbutton.click();
        MyFunc.Bekle(2);

        WebElement successful = driver.findElement(By.xpath("//*[text() ='Registration Successful']"));
        Assert.assertTrue("bulunamadı",successful.getText().equals("Registration Successful"));


        BekleKapat();
    }
}
