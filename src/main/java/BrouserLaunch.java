import org.openqa.selenium.chrome.ChromeDriver;

public class BrouserLaunch {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "D:\\New\\intelij_project\\EndToEnd\\driver\\chromedriver.exe");
        ChromeDriver n = new ChromeDriver();
        n.get("https:www.google.com");
        n.manage().window();
    }
}
