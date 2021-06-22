package io.github.testsheepnz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page {
    @FindBy(xpath = "//*[contains(@id, 'selectBuild')]")
    private WebElement build;
    @FindBy(xpath = "//*[contains(@id, 'number1Field')]")
    private WebElement number1;
    @FindBy(xpath = "//*[contains(@id, 'number2Field')]")
    private WebElement number2;
    @FindBy(xpath = "//*[contains(@id, 'selectOperationDropdown')]")
    private WebElement operation;
    @FindBy(xpath = "//*[contains(@id, 'calculateButton')]")
    private WebElement calculate;
    @FindBy(xpath = "//*[contains(@id, 'numberAnswerField')]")
    private WebElement result;
  public void input1(String first) {
      number1.sendKeys(first);}
  public void input2(String second) {
      number2.sendKeys(second);}
    public void clickCalculate () {
        calculate.click();}
    public void results(String result) {
        number2.sendKeys(result);}
    public void clickBuild () {
        build.click(); }
    public void clickOperation () {
      operation.(); }


    }


