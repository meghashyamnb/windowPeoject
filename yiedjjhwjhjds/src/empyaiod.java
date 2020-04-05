import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class empyaiod {

    //public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        public static void main(String[] args) throws MalformedURLException {

        //AndroidDriver<AndroidElement>  driver;
        // TODO Auto-generated method stub

        File appDir = new File("src");
        File app = new File(appDir, "src/ApiDemos-debug.apk");

        DesiredCapabilities capabilities= new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "shyam:5554");

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver<>(new URL("http://127.0.0.0:4723/wd/hub"), capabilities);

        //return driver;



    }
}
