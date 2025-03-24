package utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import core.Interactions;

public class Utils {
	
	private static final Logger log = LoggerFactory.getLogger(Utils.class.getSimpleName());

	private static final File fileSuccess = new File(pathScreenshot() + "sucesso");
	private static final File fileError = new File(pathScreenshot() + "erro");
	
	public static void fullPageScreenshot(String path, String nome, WebDriver driver) {
		File screenshotLocation = null;
		try {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//new File(String.format("%s_%s.png", path, nome))
		screenshotLocation = new File(path+nome+".png");
		}catch(Exception e) {
			
		}
	}
	
	public static String pathScreenshot() {
		return "target" + File.separator + "evidencias"	+ File.separator + "screenshots" + File.separator;
	}

	public static void deleteFiles() {
		if (Objects.requireNonNull(fileSuccess.listFiles()).length > 0)
			Arrays.stream(Objects.requireNonNull(fileSuccess.listFiles()))
				.forEach(f -> {
					if(!f.delete())
						log.error("Erro ao tentar esvaziar a pasta de Evidencias/Sucesso");
				});

		if (Objects.requireNonNull(fileError.listFiles()).length > 0)
			Arrays.stream(Objects.requireNonNull(fileError.listFiles()))
				.forEach(f -> {
					if(!f.delete())
						log.error("Erro ao tentar esvaziar a pasta de Evidencias/Erro");
				});
	}

	public static void createFiles() {
		if(new File(pathScreenshot()).mkdirs())
			log.error("Criando diretório de Screenshots");

		if(fileSuccess.mkdirs())
			log.error("Criando subdiretório de erro em Screenshots");

		if(fileError.mkdirs())
			log.error("Criando subdiretório de sucesso em Screenshots");
	}
	
}
