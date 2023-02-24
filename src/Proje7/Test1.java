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
    static String str = RandomString.make(8);
    String password1 = "asdasdasd";
    @Test
    public void Test1() {
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement signup = driver.findElement(By.xpath("//*[text()='Sign Up']"));
        signup.click();

        MyFunc.Bekle(1);

        WebElement firstname = driver.findElement(By.cssSelector("[id='FirstName']"));
        firstname.sendKeys("Alperen");
        MyFunc.Bekle(1);

        WebElement surname = driver.findElement(By.cssSelector("[id='Surname']"));
        surname.sendKeys("Demirci");

        MyFunc.Bekle(1);

        WebElement epost = driver.findElement(By.xpath("//*[@id='E_post']"));
        epost.sendKeys("alperndmrcii@asdasd.com");
        MyFunc.Bekle(1);

        WebElement mobile = driver.findElement(By.xpath("//*[@id='Mobile']"));
        mobile.sendKeys("0555 555 55 55");
        MyFunc.Bekle(1);

        WebElement username = driver.findElement(By.xpath("//*[@id='Username']"));

        username.sendKeys(str);
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));

        password.sendKeys(password1);
        MyFunc.Bekle(1);

        WebElement confirmpass = driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        confirmpass.sendKeys(password1);
        MyFunc.Bekle(1);

        WebElement submitbutton = driver.findElement(By.cssSelector("[id='submit']"));
        submitbutton.click();
        MyFunc.Bekle(1);

        WebElement successful = driver.findElement(By.xpath("//*[text() ='Registration Successful']"));
        Assert.assertTrue("bulunamadı", successful.getText().equals("Registration Successful"));

    }
    @Test public void Test2(){
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login=driver.findElement(By.xpath("//*[text()='Login']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement username=driver.findElement(By.xpath("//*[@id='Username']"));
        username.sendKeys(str);
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.xpath("//*[@id='Password']"));
        password.sendKeys(password1);
        MyFunc.Bekle(1);

        WebElement loginn=driver.findElement(By.xpath("//*[@value='Login']"));
        loginn.click();
        MyFunc.Bekle(1);

        WebElement dash = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
        Assert.assertTrue("Login Olunamadi", dash.getText().equals("Dashboard"));



    }
    @Test public void Test3(){

        WebElement createnew=driver.findElement(By.xpath("//*[text()='Create New']"));
        createnew.click();
        MyFunc.Bekle(1);

        WebElement name=driver.findElement(By.xpath("//*[@id='Name']"));
        name.sendKeys("sibel");
        MyFunc.Bekle(1);

        WebElement company=driver.findElement(By.xpath("//*[@id='Company']"));
        company.sendKeys("example");
        MyFunc.Bekle(1);

        WebElement address = driver.findElement(By.xpath("//*[@id='Address']"));
        address.sendKeys("Australia");
        MyFunc.Bekle(1);

        WebElement city=driver.findElement(By.xpath("//*[@id='City']"));
        city.sendKeys("Sydney");
        MyFunc.Bekle(1);

        WebElement phone=driver.findElement(By.xpath("//*[@id='Phone']"));
        phone.sendKeys("0545 555 55 55");
        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.xpath("//*[@id='Email']"));
        email.sendKeys("sibell@mailmail.com");
        MyFunc.Bekle(1);

        WebElement createbutton=driver.findElement(By.xpath("//*[@value='Create']"));
        createbutton.click();
    }
}



