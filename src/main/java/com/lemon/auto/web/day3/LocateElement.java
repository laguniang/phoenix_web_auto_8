package com.lemon.auto.web.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.List;

/**
 * @author: suchunlei
 * @create: 2018-12-21 20:19
 * @description:
 */
public class LocateElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "D:\\qcd\\phoenix_web_auto_8\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        //通过id，唯一标识符（类似于通过身份证找）
//        WebElement input = driver.findElement(By.id("ccw"));
        //通过name去找
        //WebElement input = driver.findElement(By.name("wd1"));
        //通过tagName去找（由于标签重名很多，所以用的很少）
//        WebElement input = driver.findElement(By.tagName("input"));
//        String maxlenth = input.getAttribute("maxlength");
//        System.out.println(maxlenth);
//        List<WebElement> input = driver.findElements(By.tagName("input"));
//        System.out.println(input.size());
//        WebElement element1 = driver.findElement(By.linkText("hao123"));
//        element1.click();
//        WebElement element2 = driver.findElement(By.partialLinkText("123"));
//        element2.click();

        //定位元素，查找元素
        //查找单个元素
        //driver.findElement(by)
        //查找多个元素
//        driver.findElements(by)
        //4.linkText-->超链接文本
//        WebElement element1 = driver.findElement(By.linkText("hao123"));
//        element1.click();//单击元素-->点击了鼠标左键
//        //5.partialLinkText-->超链接部分文本
//        //    WebElement element2 = driver.findElement(By.partialLinkText("hao123"));
//        //完整文本可能存在的坑：
//        driver.get("http://120.78.128.25:8765/Index/login.html");
//        //  driver.findElement(By.linkText("免费注册")).click();
//        //  driver.findElement(By.partialLinkText("免费注册")).click();
//        WebElement element2 = driver.findElement(By.partialLinkText("o123"));
//        element2.click();
//        //6.className -->元素class属性中间其中一个样式
//        WebElement input = driver.findElement(By.className("s_ipt"));
//        input.sendKeys("柠檬班");
//        driver.findElement(By.className("s_btn")).click();
//        //Compound class names not permitted:不能使用符合的类名
//    //    driver.findElement(By by);
        //7.cssSelector--->标签名[属性名=属性值][属性2名=属性2值]
        //driver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("优酷");
        driver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off1']")).sendKeys("优酷");

        Thread.sleep(2000);
        driver.quit();

    }

}
