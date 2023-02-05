import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class appiumKurulum {
    @Test
    public void test() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

       /* desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\maruf\\IdeaProjects\\Appuim01\\src\\Apps\\Calculator_8.3 (477856174)_Apkpure.apk"); */


        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion","11.0");
        desiredCapabilities.setCapability("deviceName", "PIXEL");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\maruf\\IdeaProjects\\Appuim\\src\\Apps\\Calculator_8.3 (477856174)_Apkpure.apk");

        AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);

        driver.findElementById("com.google.android.calculator:id/digit_9").click();








    }


}
