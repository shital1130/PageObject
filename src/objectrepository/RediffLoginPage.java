package objectrepository;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By go = By.name("proceed");
	By home=By.linkText("Home");

	public WebElement EmailId() {
		return driver.findElement(username);

	}

	public WebElement Password() {
		return driver.findElement(password);
	}
	public WebElement Submit() {
	return driver.findElement(go);
	}
	

	public WebElement Home() {
		// TODO Auto-generated method stub
		return driver.findElement(home);
	}
}
