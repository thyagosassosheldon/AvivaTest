package execute;

import static core.DriverFactory.*;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	

	@Before(order = 0)
	public void setarConfiguracoes() {
		getDriver().manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		new WebDriverWait(getDriver(), Duration.ofSeconds(300));
	}

	@After(order = 0)
	public void finalizar() {
		if (TestRunner.CLOSE)
			killDriver();
	}
}