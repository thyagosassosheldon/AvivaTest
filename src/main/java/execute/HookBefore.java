package execute;

import static core.DriverFactory.getDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;

public class HookBefore {
	

	@Before(order = 0)
	public void setarConfiguracoes() {
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		new WebDriverWait(getDriver(), Duration.ofSeconds(15));
	}

}