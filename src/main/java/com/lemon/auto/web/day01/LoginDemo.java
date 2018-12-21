package com.lemon.auto.web.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * @author: suchunlei
 * @create: 2018-12-18 10:42
 * @description:
 */
public class LoginDemo {
    // 成员变量
    WebDriver driver;

    @BeforeTest
    public void before() {
        // 入口
        driver = new ChromeDriver();
        // 打开百度
        driver.get("http://www.baidu.com");
    }

    @Test
    public void test1() throws Exception {

        // 窗口最大化
        driver.manage().window().maximize();
        // Thread.sleep(秒数) 等待
        Thread.sleep(2000);

    }

    @Test
    public void testLoginBaidu() {
        driver.findElement(By.id("kw")).sendKeys("堆堆还是小可爱！");
        driver.findElement(By.id("kw")).sendKeys(Keys.ENTER);
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(2000);
        // 关闭浏览器
        driver.close();
    }
}
