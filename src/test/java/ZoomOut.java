import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomOut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/sport");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String zoomChrome = "document.body.style.zoom = '33%';";
        js.executeScript(zoomChrome);
        Thread.sleep(3000);

        String zoomSafari = "document.body.style.zoom = '100%';";
        js.executeScript(zoomSafari);
        Thread.sleep(3000);

    }
}
