import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

public class Calculator2Test {

    WebDriver driver;

    @BeforeMethod
    public void setUpTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void categoryAbeseTest() {
        //Open page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("100");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("100");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        //Validate the result
        String content = driver.findElement(By.className("content")).getAttribute("value");
        Assert.assertEquals(content, "Your category is Obese", "Wrong message or element was not found");
    }

    @Test
    public void categoryStarvationTest() {
        //Open page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("60");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("400");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        //Validate the result
        String content = driver.findElement(By.className("content")).getAttribute("value");
        Assert.assertEquals(content, "Your category is Starvation", "Wrong message or element was not found");
    }

    @Test
    public void categoryUnderweightTest() {
        //Open page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("11");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("100");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        //Validate the result
        String content = driver.findElement(By.className("content")).getAttribute("value");
        Assert.assertEquals(content, "Your category is Underweight", "Wrong message or element was not found");
    }

    @Test
    public void categoryNormalTest() {
        //Open page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("50");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("150");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        //Validate the result
        String content = driver.findElement(By.className("content")).getAttribute("value");
        Assert.assertEquals(content, "Your category is Normal", "Wrong message or element was not found");
    }

    @Test
    public void categoryOverweightTest() {
        //Open page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("80");
        //Input height
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click "Calculate"
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        //Validate the result
        String content = driver.findElement(By.className("content")).getAttribute("value");
        Assert.assertEquals(content, "Your category is Overweight", "Wrong message or element was not found");
    }

    @AfterMethod
    public void setUpTest2(){
        driver.quit();
    }
}
