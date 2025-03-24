package execute;

import enums.Browsers;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import utils.Utils;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/features",
		glue = "execute",
		tags = "@Mobile",
		plugin = {
				"json:target/evidencias/json/report.json",
		},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false 
		)

public class TestRunner {
		
	public static boolean CLOSE = true;
	public static boolean HEADLESS = false;
	public static Browsers BROWSER = Browsers.ANDROID;

	@BeforeClass
	public static void screenshotFileCheck() throws IOException {
		Utils.createFiles();
		//Utils.deleteFiles();
	}
	
}