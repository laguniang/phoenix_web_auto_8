package com.lemon.auto.web.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author: suchunlei
 * @create: 2018-12-18 7:34
 * @description:
 */
public class IETester {
    public static void main(String[] args) throws InterruptedException{
        //打开百度，搜索优酷
        //1.启动浏览器
        System.setProperty("webdriver.ie.driver","src\\main\\resources\\driver\\IEDriverServer.exe");
        //System.setProperty("webdriver.ie.driver","src\\main\\resources\\driver\\chromedriver.exe");
        InternetExplorerDriver driver = new InternetExplorerDriver();
        //错误1：The path to the driver executable must be set by the webdriver.ie.driver system property;
        //错误2：Browser zoom level was set to 125%. It should be set to 100%
        //错误3：
        //2.输入url
        //Thread.sleep(2000);
        driver.get("http://www.baidu.com");
        //Thread.sleep(4000);
        //driver.wait(2000);
        //3.打开百度，输入要查找的内容
        driver.findElement(By.id("kw")).sendKeys("优酷");
        //4.找到“百度一下”按钮，点击
        WebElement btn = driver.findElement(By.id("su"));
        btn.click();
        //5.检查查询的内容是否符合要求
        //6.关闭浏览器
        Thread.sleep(2000);
        driver.quit();
    }
}
