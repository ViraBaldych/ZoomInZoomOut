import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomIN {
//public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.bbc.com/sport");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        String zoomChrome = "document.body.style.zoom = '33%';";
        js.executeScript(zoomChrome);

        //ZoomIn
        //js.executeScript("document.body.style.zoom = '300%';");
        //Thread.sleep(3000);
        //ZoomOut
        //js.executeScript("document.body.style.zoom = '33%';");
        //Thread.sleep(3000);
        //Default size =  100%
        //js.executeScript("document.body.style.zoom = '100%';");


    }
}
