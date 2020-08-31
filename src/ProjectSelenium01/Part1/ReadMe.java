package ProjectSelenium01.Part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver{

    /*

        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

     */
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demoqa.com/text-box%22");
        driver.manage().window().fullscreen();

        WebElement name = driver.findElement(By.id("userName"));
        name.sendKeys("Automation");

        Thread.sleep(1000);
        WebElement email = driver.findElement(By.cssSelector("input[id=userEmail]"));
        email.sendKeys("Testing@gmail.com");

        Thread.sleep(1000);

        WebElement adres = driver.findElement(By.id("currentAddress"));
        adres.sendKeys("Testing Current Address");

        Thread.sleep(1000);

        WebElement permanent = driver.findElement(By.id("permanentAddress"));
        permanent.sendKeys("Testing Permanent Address");

        WebElement submit = driver.findElement(By.className("btn-primary"));
        submit.click();

        WebElement isim = driver.findElement(By.id("name"));
        String nameText = isim.getText();

        Assert.assertEquals("Name:Automation", nameText);


        WebElement mail = driver.findElement(By.id("email"));
        String mailText = mail.getText();
        Assert.assertEquals("Email:Testing@gmail.com", mailText);

        //driver.quit();

        Thread.sleep(2000);
        driver.quit();
    }
}
