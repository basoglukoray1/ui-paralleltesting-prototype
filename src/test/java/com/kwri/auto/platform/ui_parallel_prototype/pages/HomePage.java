package com.kwri.auto.platform.ui_parallel_prototype.pages;

import com.kwri.auto.platform.ui_parallel_prototype.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[text()='Marketplace']")
    public WebElement marketplace;



}
