package avia;


import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement.*;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  @Test
  public void aviakassaPage(){
      SearchPage s=new SearchPage();
      RecommendPage r=new RecommendPage();
      s.openBrowser("https://aviakassa.com");
      s.search("Moscow", "LED", "240518");
      r.checkDepartureCity("Moscow");
      s.closeBrowser();
  }
  @Test
  public void humans(){
  Generator g=new Generator();
  for(int i=0;i<5;i++){
  System.out.println(g.getMaleName()+" "+g.getMaleMidname()+" "+g.getMaleLastname());}
  for(int i=0;i<5;i++){
  System.out.println(g.getFemaleName()+" "+g.getFemaleMidname()+" "+g.getFemaleLastname());}
  }
  }
