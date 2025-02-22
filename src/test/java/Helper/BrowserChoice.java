package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class BrowserChoice
{
  public static WebDriver driver = null;

  public  static WebDriver browseChoice(String browsername,String Url)
  {
      if("chrome".equalsIgnoreCase(browsername))
      {
          WebDriverManager.chromedriver().setup();
          ChromeOptions chromeOptions = new ChromeOptions();
          chromeOptions.addArguments("--remote-allow-origins=*");
          //chromeOptions.addArguments("--headless");
          driver = new ChromeDriver(chromeOptions);
      }
      else if("firefox".equalsIgnoreCase(browsername))
      {
        WebDriverManager.firefoxdriver().setup();
          FirefoxOptions firefoxOptions = new FirefoxOptions();
          firefoxOptions.addArguments("--remote-allow-origins=*");
          driver= new FirefoxDriver(firefoxOptions);
      }
      else {
           WebDriverManager.edgedriver().setup();
          EdgeOptions edgeOptions = new EdgeOptions();
          edgeOptions.addArguments("--remote-allow-origins=*");
          driver= new EdgeDriver(edgeOptions);
      }
      driver.manage().window().maximize();
      driver.get(Url);
      return driver;
  }
  @Test
  public void start()
  {
      browseChoice("chrome","https://www.saucedemo.com/");
  }
}
