/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avia;

import static com.codeborne.selenide.Condition.text;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author user
 */
public class RecommendPage extends CommonPage{
    public RecommendPage(){}
    String from=".//div[@class='AviaResultSearch__Field__Inner']//span[contains(@data-reactid,'$0.0')]";
    public void checkDepartureCity(String value){
    $x(from).shouldHave(text(value));}
    
}
