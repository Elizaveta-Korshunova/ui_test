package io.github.testsheepnz;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void firstTest () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa\\Downloads\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");



    }

}
