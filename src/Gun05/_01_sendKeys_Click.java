package Gun05;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
import org.junit.Assert.*;

public class _01_sendKeys_Click extends BaseStaticDriver {
    /*
    Test Senaryo
1- http://www.practiceselenium.com git
            2- Check Out a tıklat
3- email e bilgi gir
4- name bilgi gir
5- addres e bilgi gir
6- Place Order butonuna tıklat.
7- Açılan sayfaya geldiği assert
    kontrol et.(yeni sayfada Menu yazısı
    var mı?) */

    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.practiceselenium.com"); // siteyi açtım

        Thread.sleep(3000);
        WebElement link=driver.findElement(By.linkText("Check Out"));
        link.click(); // tıklatma

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("info@techno.study"); // text gönderme

        WebElement name=driver.findElement(By.id("name"));
        name.sendKeys("ismet"); // text gönderme

        WebElement address=driver.findElement(By.id("address"));
        address.sendKeys("evet artık biz geldik: yeni testerlar"); // text gönderme

        WebElement button=driver.findElement(By.className("btn-primary"));
        button.click();

        WebElement menu=driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menuTxt=menu.getText();
        Assert.assertEquals("Menu", menuTxt);

        String url=driver.getCurrentUrl();
        Assert.assertEquals("http://www.practiceselenium.com", url);


        Thread.sleep(4000);
        driver.quit();
    }
}