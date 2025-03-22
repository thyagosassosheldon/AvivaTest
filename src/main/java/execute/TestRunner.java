package execute;

import enums.Browsers;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/resources/features",
		glue = "execute",
		tags = "@WebLogin",
		plugin = {
				"json:target/evidencias/json/report.json",
		},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false 
		)

public class TestRunner {

	public static boolean CLOSE = false;
	public static boolean HEADLESS = false;
	public static Browsers BROWSER = Browsers.CHROME;

	@BeforeClass
	public static void screenshotFileCheck() {
		//Utils.createFiles();
		//Utils.deleteFiles();
	}
	
}