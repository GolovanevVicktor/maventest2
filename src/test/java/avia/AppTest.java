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
      SearchPage s=SearchPage.createSearchPage();
      RecommendPage r=RecommendPage.createRecommendPage();
      s.openBrowser("https://aviakassa.com");
      s.search("Moscow", "LED", "240518");
      r.checkDepartureCity("Moscow");
  }
  }
