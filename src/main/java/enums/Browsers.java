package enums;

import static core.BrowserOptions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public enum Browsers {
	
	CHROME {
		@Override
		public WebDriver newDriver(boolean headless) {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver(chromeOptions(headless));
		}
	},
	
	ANDROID {
		@Override
		public WebDriver newDriver(boolean headless) {			
			return new AppiumDriver(appiumOptions());
		}
	}
	;

    public abstract WebDriver newDriver(boolean headless);
}