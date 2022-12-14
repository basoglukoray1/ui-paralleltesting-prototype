package com.kwri.auto.platform.ui_parallel_prototype.pages;

import com.kwri.auto.platform.ui_parallel_prototype.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(name = "btnK")
    public WebElement searchBtn;
}
