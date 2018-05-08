/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avia;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import org.openqa.selenium.WebDriver;


/**
 *
 * @author user
 */
public class CommonPage {
    private SingletonPages sin;
    public CommonPage(){
        sin=SingletonPages.getSingle();
    }
    public void openBrowser(String url){
    open(url);
    sin.web=getWebDriver();}
    String flights=".//div[@class='Nav']/div[contains(@data-reactid,'$0')]";
    
}
