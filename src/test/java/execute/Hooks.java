package execute;

import static core.DriverFactory.*;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.Formatter.*;
import static utils.Utils.*;

public class Hooks {
	

	@Before(order = 0)
	public void setarConfiguracoes() {
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		new WebDriverWait(getDriver(), Duration.ofSeconds(60));
	}
	
	@Before(order = 0)
	public void extentReport() {
		
	}
	
	@After(order = 1)
	public void screenshot(Scenario scenario) {
		String nome = String.format("%s_%s", scenario.getName().replace(" ", "_"), formatter()); 
		String evidencia = (!scenario.isFailed()) ? evidencia = "sucesso" : "erro";
		String caminho = pathScreenshot() + evidencia + File.separator;

		fullPageScreenshot(caminho, nome, getDriver());
	}

	@After(order = 0)
	public void finalizar() {
		if (TestRunner.CLOSE)
			killDriver();
	}
}