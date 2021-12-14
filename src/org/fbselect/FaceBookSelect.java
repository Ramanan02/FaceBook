package org.fbselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelect {
	
	int a = 3;
	int a1 = 1234;
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\FbSelect\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement textUser = driver.findElement(By.id("email"));
		textUser.sendKeys("987654yyyi321@gmil.com");

		WebElement textPass = driver.findElement(By.id("pass"));
		textPass.sendKeys("987654tutudtud321");

		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		login.click();

		Thread.sleep(5000);

		driver.navigate().refresh();

		Thread.sleep(5000);

		driver.navigate().back();

		Thread.sleep(5000);

		driver.navigate().to("https://www.facebook.com/");

		WebElement createNewAccout = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAccout.click();

		Thread.sleep(5000);

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("R");

		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("A");

		Thread.sleep(2000);

		WebElement mobilenoOrEmail = driver.findElement(By.name("reg_email__"));
		mobilenoOrEmail.sendKeys("9876543210");

		WebElement newPassword = driver.findElement(By.xpath("//input[contains(@data-type,'password')]"));
		newPassword.sendKeys("qwertyuioiuytrew");

		WebElement day = driver.findElement(By.id("day"));

		Select s = new Select(day);

		s.selectByIndex(11);

		WebElement month = driver.findElement(By.id("month"));

		Select s1 = new Select(month);

		s1.selectByValue("10");

		WebElement year = driver.findElement(By.id("year"));

		Select s2 = new Select(year);

		s2.selectByVisibleText("1996");

	}

}
