package com.kwri.auto.platform.ui_parallel_prototype.steps;

import com.kwri.auto.platform.ui_parallel_prototype.pages.LoginPage;
import com.kwri.auto.platform.ui_parallel_prototype.utilities.ConfigurationReader;
import com.kwri.auto.platform.ui_parallel_prototype.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class login_step_defs {
    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void loginPage(){
        WebDriver driver= Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url4"));

    }
    @When("user enters email and password")
    public void enterCredentials(){

       loginPage.login(ConfigurationReader.getProperty("username1"), ConfigurationReader.getProperty("password1"));

    }
    @And("user clicks login")
    public void clickLogin(){
        loginPage.loginButton.click();
    }
    @Then("user should navigate to the home page and title must be {string}")
    public void user_should_navigate_to_the_home_page_and_title_must_be(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertEquals(expectedTitle,actualTitle);

    }




}
