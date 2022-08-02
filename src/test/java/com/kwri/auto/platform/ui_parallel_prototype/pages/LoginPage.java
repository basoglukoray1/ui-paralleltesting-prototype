package com.kwri.auto.platform.ui_parallel_prototype.pages;

import com.kwri.auto.platform.ui_parallel_prototype.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath = "//button[@data-testid='royal_login_button']")
    public WebElement loginButton;

    public void login(String username, String pass){
        email.sendKeys(username);
        password.sendKeys(pass);


    }





}
