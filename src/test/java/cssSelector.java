import java.util.List;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssSelector {

    @Test
    public void findElement() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        chromeOptions.merge(capabilities);

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.sahibinden.com/");
        driver.manage().window().maximize();
        //WebDriverWait wait = new WebDriverWait(driver, 25);

        Thread.sleep(5000);
        driver.findElement(By.cssSelector("body > div.header-container > div > ul > li.register-text > a")).click();
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("name")));
        //driver.findElement(By.cssSelector("name")).click();
        driver.findElement(By.id("name")).sendKeys("Fatmanur");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
        driver.findElement(By.id("surname")).sendKeys("Aycıl");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("email")).sendKeys("teasdasdadadstq@gmail.com");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("password")).sendKeys("123456aB!");
        driver.executeScript("document.getElementById('endUserLicenceAgreement').click()");
        driver.findElement(By.id("signUpButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("confirmSubmit")).click();
        System.out.println("Mail adresi : teasdasdadadstq@gmail.com");
        driver.quit();
    }
    public static void main(String[] args) {

    }
}
