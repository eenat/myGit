import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class FirstClass {
  WebDriver wd;
  @BeforeClass
  public void setUp() {
    wd = new ChromeDriver();
  }


}
