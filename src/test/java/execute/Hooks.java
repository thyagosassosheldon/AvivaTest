package execute;

import static core.DriverFactory.*;

import java.io.File;
import java.io.IOException;
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
	public void setarConfiguracoes() throws IOException, InterruptedException {
		String mainPath = System.getProperty("user.dir");
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec("adb install-multiple \""+mainPath+"/src/test/resources/base.apk\" \""+mainPath+"/src/test/resources/split_config.xxhdpi.apk\" \""+mainPath+"/src/test/resources/split_config.en.apk\" \""+mainPath+"/src/test/resources/split_config.x86_64.apk\"");
		Thread.sleep(10000);
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		new WebDriverWait(getDriver(), Duration.ofSeconds(60));
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