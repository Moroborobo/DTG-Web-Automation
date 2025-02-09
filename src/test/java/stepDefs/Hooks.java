package stepDefs;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setup(Scenario scenario){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicesoftwaretesting.com/");
        System.out.println("Test Case: "+scenario.getName());
    }
    @AfterStep
    public void captureScreen(Scenario scenario) {
        byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "capture");
    }
    @After
    public void teardown(){
        driver.quit();
    }
}
