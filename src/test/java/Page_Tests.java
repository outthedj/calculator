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
    public void isHelloexist() throws InterruptedException {

        //Open Zip code page
        driver.get("file:///C:/Users/igorv/IdeaProjects/calculator2/src/main/resources/index.html");
        Thread.sleep(2000);
        String hello = driver.findElement(By.name("header")).getAttribute("value");
        Assert.assertEquals(hello, "Welcome, Stranger!", "Message was not found");

    }
}
