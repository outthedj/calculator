import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Page_Tests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void isHelloexist() {

        //Open Zip code page
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        String hello = driver.findElement(By.name("header")).getText();
        Assert.assertEquals(hello, "Welcome, Stranger!", "Message was not found");
    }

    @Test
    public void isSpisokexist() {

        //Open Zip code page
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        boolean isSpisokexist = driver.findElement(By.name("spisok")).isDisplayed();
        Assert.assertTrue(isSpisokexist, "Spisok not found");
    }

    @Test
    public void isButtonexist() {

        //Open Zip code page
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        boolean isButtonexist = driver.findElement(By.name("elem")).isDisplayed();
        Assert.assertTrue(isButtonexist, "Button not found");
    }


}
