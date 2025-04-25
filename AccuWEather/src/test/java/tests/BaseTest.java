package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.Collections;

public abstract class BaseTest {
    protected static final String BASE_URL = "https://www.accuweather.com/";
    protected static final int WAIT_TIMEOUT_SECONDS = 10;
    protected WebDriver driver;
    protected final String URL = "https://the-internet.herokuapp.com/";
    protected final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    protected final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";

    protected final String RELATIVE_RESOURCE_PATH = "src/test/resources/";
    private final String currentDirectory= System.getProperty("user.dir");
    private final String downloadPath= currentDirectory + "/" + RELATIVE_RESOURCE_PATH;  //Will ask User where to download
    private final String DOWNLOADED_FILE= new File(RELATIVE_RESOURCE_PATH).getAbsolutePath();

    protected final int WAIT_TIME = 10;
    private final String FILE_NAME = "Test.txt";

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-component-extensions-with-background-pages");
        options.setExperimentalOption("prefs", Collections.singletonMap("download.default_directory", DOWNLOADED_FILE));
//        options.addArguments("download.default_directory=" + new File(DOWNLOAD_DIR).getAbsolutePath());
        System.out.println("ChromeOptions: " + options.toJson());
        driver = new ChromeDriver(options);

        driver.get(BASE_URL);
//        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
