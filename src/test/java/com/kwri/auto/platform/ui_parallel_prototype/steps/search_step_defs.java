package com.kwri.auto.platform.ui_parallel_prototype.steps;

import com.kwri.auto.platform.ui_parallel_prototype.pages.GooglePage;
import com.kwri.auto.platform.ui_parallel_prototype.utilities.ConfigurationReader;
import com.kwri.auto.platform.ui_parallel_prototype.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class search_step_defs {

    GooglePage googlePage = new GooglePage();

    @Given("User is on the google home page")
    public void googleHome() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url1"));
    }

    @When ("user searches for {string}")
    public void searchForKW(String search) {
        googlePage.searchBox.sendKeys(search);

    }

    @And ("user clicks on search button")
    public void clickOnSearchBtn(){
        googlePage.searchBtn.click();

    }

    @Then ("user must see {string} as the tab title")
    public void expectedTabTitle(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle, "Actual title doesn't match expected title!");



    }


}
