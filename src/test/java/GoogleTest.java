import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.<span id="IL_AD9" class="IL_AD">annotations</span>.Test;

/**
 * @author Gaurang_Shah
 */
public class GoogleTest {
 private WebDriver driver;

 public static void main(String[] args) {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://www.google.com/");
	 driver.quit();
 }
// @Test
 public void verifySearch() {
  driver = new FirefoxDriver();
  driver.get("http://www.google.com/");
 // driver.quit();
 }
}