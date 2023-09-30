import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {
//        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

//        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver(options);
        // Maximize window
        driver.manage().window().maximize();

//         Navigate to the Login page
        driver.get("http://mystore-testlab.coderslab.pl/index.php");
//            Wait for the paige to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


//      Enter the Login credentials and click the Login button
        WebElement element = driver.findElement(By.className("user-info"));
        element.click();
        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("gyfpwdgpnguilkawkc@cazlp.com");
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("123456");
        password.submit();




//        Click the "Create new address" button
        WebElement createNewAddressButton = driver.findElement(By.xpath("//*[@id=\"address-link\"]"));
        createNewAddressButton.click();

//        Fill in the "New address"

        WebElement alias = driver.findElement(By.xpath("//*[@id=\"field-alias\"]"));
        alias.clear();
        alias.sendKeys("Główny Adres");
        WebElement address = driver.findElement(By.xpath("//*[@id=\"field-address1\"]"));
        address.clear();
        address.sendKeys("Bonifacego 10");
        WebElement city = driver.findElement(By.xpath("//*[@id=\"field-city\"]"));
        city.clear();
        city.sendKeys("Siedlce");
//        WebElement stateChose = driver.findElement(By.xpath("//*[@id=\"field-id_state\"]/option[2]"));
//        stateChose.click();
        WebElement postcode = driver.findElement(By.xpath("//*[@id=\"field-postcode\"]"));
        postcode.clear();
        postcode.sendKeys("08110");
        WebElement setCountry = driver.findElement(By.cssSelector("#field-id_country > option:nth-child(2)"));
        setCountry.click();
        WebElement phoneMobile = driver.findElement(By.xpath("//*[@id=\"field-phone\"]"));
        phoneMobile.clear();
        phoneMobile.sendKeys("444555666");
        WebElement saveAddress = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        saveAddress.click();

//        Close the browser window
        driver.quit();
    }
}