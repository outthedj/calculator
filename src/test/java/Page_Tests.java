import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Page_Tests {

    WebDriver driver;

    @BeforeMethod
    public void setUpTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void isHelloExistTest() {
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        String hello = driver.findElement(By.name("header")).getText();
        Assert.assertEquals(hello, "Welcome, Stranger!", "Message was not found");
    }

    @Test
    public void isSpisokExistTest() {
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        boolean isSpisokexist = driver.findElement(By.name("spisok")).isDisplayed();
        Assert.assertTrue(isSpisokexist, "Spisok not found");
    }

    @Test
    public void isNameExistTest() {
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        boolean isNameexist = driver.findElement(By.name("igor")).getAttribute("name").contains("igor");
        Assert.assertTrue(isNameexist, "Name not found");
    }

    @Test
    public void isUrlExistTest() {
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        driver.findElement(By.name("url")).click();
        boolean isUrlexist = driver.getCurrentUrl().contains("google");
        Assert.assertTrue(isUrlexist, "Url not found");
    }

    @Test
    public void isPictureTextExistTest() {
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        String isPictureTextExist = driver.findElement(By.name("picture")).getAttribute("alt");
        Assert.assertEquals(isPictureTextExist, "oops, you found it", "Wrong message or element was not found");
    }

    @AfterMethod
    public void setUpTest2(){
        driver.quit();
    }
}
