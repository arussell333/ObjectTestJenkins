package com.example.adamrussell.objecttestjenkins;




import org.junit.Before;
        import org.junit.Rule;
        import org.junit.Test;
        import org.junit.rules.TestName;
        import org.junit.runner.RunWith;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.testobject.appium.common.TestObject;
        import org.testobject.appium.junit.TestObjectAppiumSuite;
        import org.testobject.appium.junit.TestObjectTestResultWatcher;

        import java.net.URL;
        import java.util.concurrent.TimeUnit;

        import io.appium.java_client.android.AndroidDriver;

/**
 * Created by adamrussell on 03/05/16.
 */


@TestObject(testObjectApiKey = "CF8C35E2E43C4A129DE76E95275299BD", testObjectSuiteId = 7)
@RunWith(TestObjectAppiumSuite.class)



public class ObjectTestJenkins {


    private AndroidDriver driver;


    @Rule
    public TestName testName = new TestName();

    @Rule
    public TestObjectTestResultWatcher resultWatcher = new TestObjectTestResultWatcher();

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("testobject_api_key", resultWatcher.getApiKey());
        capabilities.setCapability("testobject_test_report_id", resultWatcher.getTestReportId());
        capabilities.setCapability("testobject_device", "LG_Nexus_4_E960_real");
        capabilities.setCapability("automationName", "appium");
        capabilities.setCapability("app", ("/Users/adamrussell/Downloads/ChargeNow_v1.1.1.apk"));
        capabilities.setCapability("appPackage", "com.chargenow.client");
        capabilities.setCapability("fullReset", "true");
        driver = new AndroidDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub	"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        resultWatcher.setAppiumDriver(driver);


    }


    @Test

    public void toggleMenu() throws Exception

    {

        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/dismiss_button\").text(\"Got it!\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"Satellite View\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"List View\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"Filter Options\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();


    }

    @Test

    public void mapFunctions() throws Exception

    {
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/dismiss_button\").text(\"Got it!\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/list_poi\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/right_toggle\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/login_button\").text(\"Login\")").click();


    }

}

