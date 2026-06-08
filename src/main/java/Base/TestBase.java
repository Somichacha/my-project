package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;

    public static Properties CONFIG = null;


    public void initialize() throws IOException {

        if (driver == null) {

            // Load config.properties
            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream(
                    System.getProperty("user.dir") + "/src/main/java/Config/Config.properties"
            );
            CONFIG.load(fn);

            String browserName = CONFIG.getProperty("Browser").toLowerCase().trim();

            // Browser initialization

            if (browserName.equals("chrome")) {
                // ✅ Replace System.setProperty + hardcoded path with:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            } else if (browserName.equals("firefox")) {
                // ✅ Also update Firefox to use WebDriverManager
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            } else if (browserName.equals("safari")) {
                // SafariDriver works only in macOS
                driver = new SafariDriver();

            } else {
                throw new RuntimeException("Browser not supported: " + browserName);
            }

            // Browser Settings
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
    }

}
