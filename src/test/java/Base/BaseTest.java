package Base;

import Pages.PracticePage;
import Pages.SidebarPage;
import Pages.SidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public SidebarPage sideBarPage;
    public PracticePage practicePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        SidebarPage SideBarPage = new SidebarPage(driver);
        practicePage = new PracticePage(driver);
    }


}