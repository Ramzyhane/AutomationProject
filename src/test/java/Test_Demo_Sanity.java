import org.example.ContactUs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import web.BaseWeb;

import static org.example.Login.*;

public class Test_Demo_Sanity extends BaseWeb{

    WebDriver driver = init();

    @Test
    public void test_home_page_h2_text(){
        ContactUs ca = new ContactUs();
        Assert.assertEquals(ca.getText(driver),ca.HOME_PAGE_H2_TEXT);

    }

    @Test
    public void  test_home_page_h3_text(){
        ContactUs cb = new ContactUs();
        Assert.assertEquals(cb.getText1(driver),cb.HOME_PAGE_H3_TEXT);
    }

    @Test
    public void  test_home_page_Login_text(){
        WebElement storeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        storeLink.click();
        ContactUs cl = new ContactUs();
        Assert.assertEquals(cl.onCliclLOgin(driver),LOGIN_TEXT);
    }
    @Test
    public void  printEmail(){
        WebElement storeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        storeLink.click();

        ContactUs cl = new ContactUs();
        Assert.assertEquals(cl.onCliclLOgin(driver),LOGIN_TEXT);

        WebElement emailField = driver.findElement(By.id("email-id"));
        WebElement PasswordField = driver.findElement(By.id("password"));

        emailField.sendKeys("test@test.com)");
        PasswordField.sendKeys("123456");

        WebElement st = driver.findElement(By.id("submit-id"));
        st.submit();
    }

    @Test
    public void  Tabel(){
        WebElement storeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        storeLink.click();

        ContactUs cl = new ContactUs();
        Assert.assertEquals(cl.onCliclLOgin(driver),LOGIN_TEXT);

        WebElement emailField = driver.findElement(By.id("email-id"));
        WebElement PasswordField = driver.findElement(By.id("password"));

        emailField.sendKeys("test@test.com)");
        PasswordField.sendKeys("123456");

        WebElement st = driver.findElement(By.id("submit-id"));
        st.submit();
        ContactUs cll = new ContactUs();
        Assert.assertEquals(cll.getTextTabel(driver),cll.texttabel);
    }

    @Test
    public void  NewCustomer(){
        WebElement storeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        storeLink.click();

        ContactUs cl = new ContactUs();
        Assert.assertEquals(cl.onCliclLOgin(driver),LOGIN_TEXT);

        WebElement emailField = driver.findElement(By.id("email-id"));
        WebElement PasswordField = driver.findElement(By.id("password"));

        emailField.sendKeys("test@test.com)");
        PasswordField.sendKeys("123456");

        WebElement st = driver.findElement(By.id("submit-id"));
        st.submit();

        WebElement st1 = driver.findElement(By.xpath("//*[@id=\"new-customer\"]"));
        st1.click();

        WebElement EemailField = driver.findElement(By.id("EmailAddress"));
        EemailField.sendKeys("ramzy2000@Gmail.com");

        WebElement FirstNameField = driver.findElement(By.id("FirstName"));
        FirstNameField.sendKeys("ramzy");

        WebElement LastNameField = driver.findElement(By.id("LastName"));
        LastNameField.sendKeys("hane");

        WebElement CityField = driver.findElement(By.id("City"));
        CityField.sendKeys("rahat");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,2000)");

        WebElement StateField = driver.findElement(By.id("StateOrRegion"));
        StateField.sendKeys("Utah");


        WebElement GenderField = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div/div/div/div/form/div[6]/input[1]"));
        //GenderField.sendKeys("Male");
        GenderField.click();



        WebElement st2 = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div/div/div/div/form/button"));
        st2.click();


        System.out.printf("Success! New customer added.");


    }
    @Test
    public void  NewCustomerPr(){
        ContactUs ca = new ContactUs();
        NewCustomer();
        WebElement st4 = driver.findElement(By.className("icon-pencil"));
        st4.click();
        Assert.assertEquals(ca.getPath(driver),ca.NewCustomerPr);


    }

    @Test
    public void  backuser(){
        ContactUs ca = new ContactUs();
        NewCustomerPr();
        WebElement onClickback = driver.findElement(By.xpath("//*[@id=\"customers\"]"));
        onClickback.click();
        Assert.assertEquals(ca.getuserback(driver),ca.stringh2);
    }

    @AfterClass
        public  void  driverclose(){
        driver.close();
    }

}
