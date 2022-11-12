package com.timetracking.actitime.automation.basicTestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.timetracking.actitime.automation.PomRepo.LoginPage;
import com.timetracking.actitime.automation.genericUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProducts {
	@Test
	public void createProductsAndVerifyProductName() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileUtility fUtils=new FileUtility();
		String url=fUtils.fetchDataFromPropertyFile("url");
		String username=fUtils.fetchDataFromPropertyFile("username");
		String password=fUtils.fetchDataFromPropertyFile("password");
		
		driver.get(url);
		
		LoginPage login=new LoginPage();
		login.loginAction(username, password);
		

}
}
