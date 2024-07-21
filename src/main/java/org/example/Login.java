package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {


    final public static String LOGIN_TEXT= "Login";
    final public static String LOGIN_NAV_LINK = "//*[@id=\"loginform\"]/div/div/div/div/h2";



    final public static String STORE_NAV_LINK1 = "Login";
    final public static String STORE_NAV_LINK = "//*[@id=\"loginform\"]/div/div/div/div/h2";



//    public String getText(WebDriver driver){
//        String text = driver.findElement(By.xpath(HOME_PAG_H2)).getText();
//        return text;
//    }
//
//    public String getText1(WebDriver driver){
//        String text2 = driver.findElement(By.xpath(HOME_PAG_H3)).getText();
//        return text2;
//    }

    public String onCliclLOgin(WebDriver driver){
        String text3 = driver.findElement(By.xpath(LOGIN_NAV_LINK)).getText();
        return text3;
    }







}
