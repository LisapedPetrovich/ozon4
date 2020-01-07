import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class NewTest {
    WebDriver driver;
    int goodsSum = 0;
    int rnd;
    int rnd2;
    String cost2;
    String name2;
    String cost4;
    String name4;

    @Test(priority=1)
    public void test1() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\1\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        String url1 = "https://www.ozon.ru";
        driver.get(url1);
    }

    @Test(priority=2)
    public void test2() throws InterruptedException {
        WebElement btn0 = driver.findElement(By.cssSelector("button.b0q6"));
        btn0.click();
        WebElement btn1 = driver.findElement(By.cssSelector("a.ad6:nth-child(21)"));
        btn1.click();
        Thread.sleep(3000);
    }

    @Test(priority=3)
    public void test3() throws InterruptedException {
        WebElement btn2 = driver.findElement(By.cssSelector("div.a2v3:nth-child(1) > a:nth-child(1)"));
        btn2.click();
        Thread.sleep(3000);
    }

    @Test(priority=4)
    public void test4() {
        WebElement chck1 = driver.findElement(By.cssSelector("div.a3d0:first-child"));
        Assert.assertTrue(chck1.isDisplayed());
    }

    @Test(priority=5)
    public void test5() {
        WebElement btn3 = driver.findElement(By.cssSelector("div.a3d0:last-child"));
        goodsSum = driver.findElements(By.cssSelector("div.a3d0")).size();
        System.out.println(goodsSum);
    }

    @Test(priority=6)
    public void test6() {
        rnd = 1 + (int) (Math.random()*goodsSum);
        System.out.println(rnd);
    }

    @Test(priority=7)
    public void test7() throws InterruptedException {
        List<WebElement> goodsList = driver.findElements(By.cssSelector("div.a3d0"));
        goodsList.get(rnd).click();
        Thread.sleep(5000);
    }

    @Test(priority=8)
    public void test8() {
        WebElement cost1 = driver.findElement(By.cssSelector("span.b6w7"));
        String cost2 = cost1.getText();
        WebElement name1 = driver.findElement(By.cssSelector(".b6i0 > span:nth-child(1)"));
        String name2 = name1.getText();
    }

    @Test(priority=9)
    public void test9() throws InterruptedException {
        WebElement btn4 = driver.findElement(By.cssSelector("button.close"));
        btn4.click();
        WebElement btn5 = driver.findElement(By.cssSelector(".b6d5 > button:nth-child(1) > div:nth-child(1)"));
        btn5.click();
        Thread.sleep(5000);
    }

    @Test(priority=10)
    public void test10() throws InterruptedException {
        WebElement btn6 = driver.findElement(By.cssSelector("svg.bu9"));
        btn6.click();
        Thread.sleep(5000);
        WebElement chck2 = driver.findElement(By.cssSelector(".a8p0 > span:nth-child(1)"));
        Assert.assertTrue(chck2.isDisplayed());
    }

    @Test(priority = 11)
    public void test11() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(priority = 12)
    public void test12() {
        rnd2 = 1 + (int) (Math.random()*goodsSum);
        System.out.println(rnd2);
    }

    @Test(priority = 13)
    public void test13() throws InterruptedException {
        List<WebElement> goodsList = driver.findElements(By.cssSelector("div.a3d0"));
        goodsList.get(rnd2).click();
        Thread.sleep(5000);
    }

    @Test(priority = 14)
    public void test14() {
        WebElement cost3 = driver.findElement(By.cssSelector("span.b6w7"));
        String cost4 = cost3.getText();
        WebElement name3 = driver.findElement(By.cssSelector(".b6i0 > span:nth-child(1)"));
        String name4 = name3.getText();
    }

    @Test(priority = 15)
    public void test15() throws InterruptedException {
        WebElement btn7 = driver.findElement(By.cssSelector(".b6d5 > button:nth-child(1) > div:nth-child(1)"));
        btn7.click();
        Thread.sleep(5000);
    }

    @Test(priority = 16)
    public void test16() {
        WebElement chck3 = driver.findElement(By.cssSelector("span.f-caption--bold"));
        String chck4 = chck3.getText();
        if (chck4 == "\n" +
                "      2\n" +
                "    ")
            System.out.println("Test passed.");
        else
            System.out.println("Test failed");
    }

    @Test(priority = 17)
    public void test17() throws InterruptedException {
        WebElement btn6 = driver.findElement(By.cssSelector("svg.bu9"));
        btn6.click();
        Thread.sleep(5000);
    }

    @Test(priority = 18)
    public void test18() {
        WebElement chck5 = driver.findElement(By.cssSelector("div.a8o1:nth-child(4) > div:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
        String chck6 = chck5.getText();
        WebElement chck7 = driver.findElement(By.cssSelector("div.a8o1:nth-child(3) > div:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
        String chck8 = chck7.getText();
        if (chck6 == name2 && chck8 == name4)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }

    @Test(priority = 19)
    public void test19() throws InterruptedException {
        WebElement btn8 = driver.findElement(By.cssSelector("span.a6p4"));
        btn8.click();
        Thread.sleep(5000);
        WebElement btn9 = driver.findElement(By.cssSelector(".a0s7 > div:nth-child(1)"));
        btn9.click();
        Thread.sleep(5000);
    }

    @Test(priority = 20)
    public void test20() {
        WebElement chck9 = driver.findElement(By.cssSelector("div.ui-a3:nth-child(1)"));
        Assert.assertTrue(chck9.isDisplayed());
    }

    @Test(priority = 21)
    public void test21() {
        driver.quit();
    }
}


