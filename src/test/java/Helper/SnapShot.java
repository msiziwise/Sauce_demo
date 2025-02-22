package Helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.helpers.Util;
import org.testng.internal.Utils;

import java.io.File;
import java.io.IOException;

public class SnapShot
{
    String directory_dir = System.getProperty("user.dir")+"/Screenshot";



    public  void TakeSnapShot(WebDriver driver,String screenshotname)
    {
        TakesScreenshot ts =(TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(directory_dir,screenshotname+".png");

        try {
            FileUtils.copyFile(src,destination);
         }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
