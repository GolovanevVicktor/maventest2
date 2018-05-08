/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avia;

import static com.codeborne.selenide.Selectors.byText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import com.codeborne.selenide.SelenideElement;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author user
 */
public class SearchPage extends CommonPage{
    private static SearchPage page;
    public SearchPage(){}
    public static SearchPage createSearchPage(){
    if(page==null) {page=new SearchPage();} 
        return page;}
    String departure=".//form[@class='AviaSearchForm']//input[contains(@data-reactid,'1$segment-4.0.')]";
    String arrival=".//form[@class='AviaSearchForm']//input[contains(@data-reactid,'1$segment-4.1.')]";
    String date=".//form[@class='AviaSearchForm']//input[contains(@data-reactid,'1$segment-4.2.')]";
    public void search(String dep,String arr,String dat) {
     
    $x(departure).setValue(dep);
    $(byText(dep)).click();
    $x(arrival).setValue(arr);
    $(byText(arr)).click();
    $x(date).setValue(dat).pressEnter();
    }
}
