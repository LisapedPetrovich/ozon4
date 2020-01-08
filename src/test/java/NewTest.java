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

    @Test(priority = 1)
    //1. Открываем в браузере сайт https://www.ozon.ru/.
    public void test1() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\1\\IdeaProjects\\ozon4\\src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        String url1 = "https://www.ozon.ru";
        driver.get(url1);
    }

    @Test(priority = 2)
    //2. В каталоге товаров выбираем категорию "Музыка".
    public void test2() throws InterruptedException {
        WebElement btn0 = driver.findElement(By.cssSelector("button.b0q6"));
        btn0.click();
        WebElement btn1 = driver.findElement(By.cssSelector("a.ad6:nth-child(21)"));
        btn1.click();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    //3. Выбираем подкатегорию "Виниловые пластинки".
    public void test3() throws InterruptedException {
        WebElement btn2 = driver.findElement(By.cssSelector("div.a2v3:nth-child(1) > .a2v4"));
        btn2.click();
        Thread.sleep(5000);
    }

    @Test(priority = 4)
    //4. Проверяем открывшийся список товаров.
    public void test4() {
        WebElement chck1 = driver.findElement(By.cssSelector("div.a3d0:first-child"));
        Assert.assertTrue(chck1.isDisplayed());
    }

    @Test(priority = 5)
    //5. Определяем количество товаров на странице.
    public void test5() {
        WebElement btn3 = driver.findElement(By.cssSelector("div.a3d0:last-child"));
        goodsSum = driver.findElements(By.cssSelector("div.a3d0")).size();
        System.out.println(goodsSum);
    }

    @Test(priority = 6)
    //6. Генерируем случайное число в диапазоне от 1 до значения количества товаров на странице.
    public void test6() {
        rnd = 0 + (int) (Math.random()*goodsSum);
        System.out.println(rnd);
    }

    @Test(priority = 7)
    //7. Выбираем товар со случайным порядковым номером, полученным в test6.
    public void test7() throws InterruptedException {
        List<WebElement> goodsList = driver.findElements(By.cssSelector("div.a3d0"));
        goodsList.get(rnd).click();
        Thread.sleep(5000);
    }

    @Test(priority = 8)
    //8. Запоминаем стоимость и название выбранного товара.
    public void test8() {
        WebElement cost1 = driver.findElement(By.cssSelector("span.b6w7"));
        String cost2 = cost1.getText();
        WebElement name1 = driver.findElement(By.cssSelector(".b6i0 > span:nth-child(1)"));
        String name2 = name1.getText();
    }

    @Test(priority = 9)
    //9. Добавляем выбранный товар в корзину.
    public void test9() throws InterruptedException {
        WebElement btn4 = driver.findElement(By.cssSelector("button.close"));
        btn4.click();
        WebElement btn5 = driver.findElement(By.cssSelector(".b6d5 > button:nth-child(1) > div:nth-child(1)"));
        btn5.click();
        Thread.sleep(5000);
    }

    @Test(priority = 10)
    //10. Переходим в корзину и проверяем наличие товара в корзине.
    public void test10() throws InterruptedException {
        WebElement btn6 = driver.findElement(By.cssSelector("svg.bu9"));
        btn6.click();
        Thread.sleep(5000);
        WebElement chck2 = driver.findElement(By.cssSelector(".a8p0 > span:nth-child(1)"));
        Assert.assertTrue(chck2.isDisplayed());
    }

    @Test(priority = 11)
    //11. Возвращаемся на страницу "Виниловые пластинки".
    public void test11() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(priority = 12)
    //12. Генерируем случаное число в диапазоне от 1 до згачения, полученного в test5.
    public void test12() {
        rnd2 = 0 + (int) (Math.random()*goodsSum);
        System.out.println(rnd2);
    }

    @Test(priority = 13)
    //13. Выбираем товар со случайным порядковым номером, полученным в test12.
    public void test13() throws InterruptedException {
        List<WebElement> goodsList = driver.findElements(By.cssSelector("div.a3d0"));
        goodsList.get(rnd2).click();
        Thread.sleep(5000);
    }

    @Test(priority = 14)
    //14. Запоминаем стоимость и название выбранного товара.
    public void test14() {
        WebElement cost3 = driver.findElement(By.cssSelector("span.b6w7"));
        String cost4 = cost3.getText();
        WebElement name3 = driver.findElement(By.cssSelector(".b6i0 > span:nth-child(1)"));
        String name4 = name3.getText();
    }

    @Test(priority = 15)
    //15. Добавляем выбранный в test13 товар в корзину.
    public void test15() throws InterruptedException {
        WebElement btn7 = driver.findElement(By.cssSelector(".b6d5 > button:nth-child(1) > div:nth-child(1)"));
        btn7.click();
        Thread.sleep(5000);
    }

    @Test(priority = 16)
    //16. Проверяем наличие товаров в корзине без перехода в корзину.
    public void test16() {
        WebElement chck3 = driver.findElement(By.cssSelector("span.f-caption--bold"));
        String chck4 = chck3.getAttribute("innerText");
        if (chck4.equals("2"))
            System.out.println("Test passed.");
        else
            System.out.println("Test failed");
    }

    @Test(priority = 17)
    //17. Открываем корзину.
    public void test17() throws InterruptedException {
        WebElement btn6 = driver.findElement(By.cssSelector("svg.bu9"));
        btn6.click();
        Thread.sleep(5000);
    }

    @Test(priority = 18)
    //18. Проверяем наличие добавленных ранее товаров в корзине и их общую стоимость.
    public void test18() {
        WebElement chck5 = driver.findElement(By.cssSelector("div.a8o1:nth-child(4) > div:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
        String chck6 = chck5.getText();
        WebElement chck7 = driver.findElement(By.cssSelector("div.a8o1:nth-child(3) > div:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
        String chck8 = chck7.getText();
        if (chck6.equals(name2) && chck8.equals(name4))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }

    @Test(priority = 19)
    //19. Удаляем из корзины все товары.
    public void test19() throws InterruptedException {
        WebElement btn8 = driver.findElement(By.cssSelector("span.a6p4"));
        btn8.click();
        Thread.sleep(5000);
        WebElement btn9 = driver.findElement(By.cssSelector(".a0s7 > div:nth-child(1)"));
        btn9.click();
        Thread.sleep(5000);
    }

    @Test(priority = 20)
    //20. Проверяем, что корзина пуста.
    public void test20() {
        WebElement chck9 = driver.findElement(By.cssSelector("div.ui-a3:nth-child(1)"));
        Assert.assertTrue(chck9.isDisplayed());
    }

    @Test(priority = 21)
    //21. Закрываем браузер.
    public void test21() {
        driver.quit();
    }
}


