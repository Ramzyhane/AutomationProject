package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.Login.STORE_NAV_LINK;

public class ContactUs {

    final public  String HOME_PAGE_H2_TEXT = "Customers Are Priority One!";
    final public  String HOME_PAG_H2= "//*[@id=\"feature\"]/div/div/div[1]/h2";

    final public  String HOME_PAGE_H3_TEXT = "Customer Service";
    final public  String HOME_PAG_H3= "/html/body/nav/a";

    final  public  String texttabel = "customers";
    final  public  String texttabelta = "customers";

    final public  String NewCustomerPr = "User Profile";
    final public  String NewCustPath= "/html/body/div/h2";

    final public  String stringh2 = "New Customer";
    final public  String pathH2= "//*[@id=\"new-customer\"]";
    //final public  String  STORE_NAV_LINK = "//*[@id=\"submit-id\"]";


    public String getuserback(WebDriver driver){
        String textpath = driver.findElement(By.xpath(pathH2)).getText();
        return textpath;
    }

    public String getPath(WebDriver driver){
        String textpath = driver.findElement(By.xpath(NewCustPath)).getText();
        return textpath;
    }

    public String getText(WebDriver driver){
        String text = driver.findElement(By.xpath(HOME_PAG_H2)).getText();
        return text;
    }

    public String getText1(WebDriver driver){
        String text2 = driver.findElement(By.xpath(HOME_PAG_H3)).getText();
        return text2;
    }

    public String onCliclLOgin(WebDriver driver){
        String text3 = driver.findElement(By.xpath(STORE_NAV_LINK)).getText();
        return text3;
    }

    public  String getTextTabel(WebDriver driver){
        String texttabel = driver.findElement(By.xpath(texttabelta)).getText();
        return texttabel;
    }





}
