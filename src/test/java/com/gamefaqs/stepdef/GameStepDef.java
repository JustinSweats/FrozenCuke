package com.gamefaqs.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameStepDef {

    public static WebDriver driver;
    public final String url = "https://gamefaqs.gamespot.com/";

    @Given("^I am at the gamefaqs page$")
    public void i_am_at_the_gamefaqs_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        //throw new PendingException();
    }

    @When("^I check the title$")
    public void i_check_the_title() throws Throwable {
        driver.findElement(By.xpath("//*[@id='searchtextbox']")).sendKeys("Zelda");
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[2]/form/fieldset/button/i")).click();
        //throw new PendingException();
    }

    @Then("^I see that it is the same as GameFAQs - Video Game Cheats, Reviews, FAQs, Message Boards, and More$")
    public void i_see_that_it_is_the_same_as_GameFAQs_Video_Game_Cheats_Reviews_FAQs_Message_Boards_and_More() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}




    /*
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


    public class MercuryTour {
        public static WebDriver driver;
        public final String url = "https://gamefaqs.gamespot.com/";

        @BeforeTest
        public void setup(){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
        }

        @AfterTest
        public void teardown() throws InterruptedException{
            Thread.sleep(2500);
            driver.quit();
        }

        @Test
        public void gameFaqsBaby() {
            //Welcome Page
            Assert.assertEquals(driver.getTitle(), "GameFAQs - Video Game Cheats, Reviews, FAQs, Message Boards, and More");
            driver.findElement(By.xpath("//*[@id='searchtextbox']")).sendKeys("Zelda");
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[2]/form/fieldset/button/i")).click();
            Assert.assertEquals(driver.getTitle(), "Game Search - GameFAQs");
            driver.findElement(By.xpath("//*[@id='content']/div[3]/div/div[1]/div[16]/div[2]/div[1]/div/div[1]/a")).click();
            driver.findElement(By.xpath("//*[@id='gamespace_search_input']")).sendKeys("Nah chill bro just click on images.");
            driver.findElement(By.xpath("//*[@id='js_content_nav']/ol/li[6]/a")).click();
            driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[1]/div[4]/table/tbody/tr[4]/td[2]/a/img")).click();
        }
    }*/
