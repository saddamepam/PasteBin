package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasteBinDemo {
    @Test
    public  void pasteBin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\103\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
        driver.findElement(By.id( "postform-text")).sendKeys("Hello from WebDriver");
        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]")).click();
        driver.findElement(By.id("postform-name")).sendKeys("helloweb");
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.tagName("button")).submit();
    }
}