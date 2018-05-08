/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avia;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import org.openqa.selenium.WebDriver;

public class SingletonPages {
private static SingletonPages sin;
WebDriver web;
private SingletonPages(){}
public static SingletonPages getSingle(){
if(sin==null){sin=new SingletonPages();}
return sin;}
}
