package core;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserOptions {

	public static ChromeOptions chromeOptions(boolean headless) {
		ChromeOptions options = new ChromeOptions();

		if (headless) {
			options.setAcceptInsecureCerts(true);
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			options.addArguments("test-type");
			options.addArguments("enable-automation");
			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-extensions");
			options.addArguments("--enable-precise-memory-info");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-default-apps");
			options.addArguments("--disable-infobars");
			options.addArguments("window-size=1920,1080");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-gpu");
			return options;
		}
		return options;
	}

	public static DesiredCapabilities appiumOptions() {
		
		DesiredCapabilities options = new DesiredCapabilities();
		
		options.setCapability("autoGrantPermissions", true);
		options.setCapability("deviceName","sdk_gphone64_x86_64");
		options.setCapability("udid","emulator-5554");
		options.setCapability("platformName","Android");
		options.setCapability("platformVersion","16");
		options.setCapability("automationName","UiAutomator2");
		options.setCapability("appPackage","br.com.petz");
		options.setCapability("appActivity","br.com.hanzo.petz.auth.AuthLoginActivity");
		
		return options;
	}

}