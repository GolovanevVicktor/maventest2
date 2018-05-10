/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avia;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author user
 */
public class CommonPage {
    public SingletonPages sin;
    public CommonPage(){
        sin=SingletonPages.getSingle();
    }
    public void openBrowser(String url){
    System.setProperty("webdriver.chrome.driver", "/home/user/chromedriver");
    sin.web=new ChromeDriver();
    sin.web.get(url);
    setWebDriver(sin.web);
    }
    public void closeBrowser(){
    sin.web.close();}
    String flights=".//div[@class='Nav']/div[contains(@data-reactid,'$0')]";
    
}
