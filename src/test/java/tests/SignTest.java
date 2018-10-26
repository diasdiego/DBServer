package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testLogar(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diego\\Downloads\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("http://www.automationpractice.com.");
        navegador.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        navegador.findElement(By.name("Submit")).click();
        navegador.findElement(By.linkText("Proceed to checkout")).click();
        navegador.findElement(By.linkText("Proceed to checkout")).click();
        navegador.findElement(By.id("authentication")).findElement(By.name("email_create")).sendKeys("teste@outlook.com");
        navegador.findElement(By.name("SubmitCreate")).click();
        navegador.findElement(By.name("id_gender")).click();
        navegador.findElement(By.id("authentication")).findElement(By.name("customer_firstname")).sendKeys("Diego");
        navegador.findElement(By.id("authentication")).findElement(By.name("customer_lastname")).sendKeys("Dias da Silva");
        navegador.findElement(By.id("authentication")).findElement(By.name("passwd")).sendKeys("12345");
        navegador.findElement(By.id("authentication")).findElement(By.name("days")).sendKeys("1");
        navegador.findElement(By.id("authentication")).findElement(By.name("months")).sendKeys("Julho");
        navegador.findElement(By.id("authentication")).findElement(By.name("years")).sendKeys("1989");
        navegador.findElement(By.id("authentication")).findElement(By.name("address1")).sendKeys("Rua 123");
        navegador.findElement(By.id("authentication")).findElement(By.name("city")).sendKeys("Blumenau");
        navegador.findElement(By.id("authentication")).findElement(By.name("id_state")).sendKeys("Alabama");
        navegador.findElement(By.id("authentication")).findElement(By.name("postcode")).sendKeys("00000");
        navegador.findElement(By.id("authentication")).findElement(By.name("id_country")).sendKeys("United States");
        navegador.findElement(By.id("authentication")).findElement(By.name("phone_mobile")).sendKeys("(47) 99680-4668");
        navegador.findElement(By.name("submitAccount")).click();
        navegador.findElement(By.name("processAddress")).click();
        navegador.findElement(By.name("cgv")).click();
        navegador.findElement(By.name("processCarrier")).click();
        navegador.findElement(By.className("bankwire")).click();
        navegador.findElement(By.id("cart_navigation")).findElement(By.cssSelector("button")).click();

    }
}
