package cn.edu.bjut.selenium;
/** 
 * @author: xiaorun E-mail: xiaorunmail@gmail.com 
 * @version: 2014年9月11日 下午11:06:03 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
	public static  void main(String []srgs){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.firefox.bin", "E:/Program Files/Mozilla Firefox/firefox.exe"); 
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://nic.bjut.edu.cn/");
		
		WebElement txtbox = driver.findElement(By.name("DDDDD"));
		WebElement passwordbox = driver.findElement(By.name("upass"));
		
		txtbox.sendKeys("g2013225133");
		passwordbox.sendKeys("814924");
		WebElement btn = driver.findElement(By.name("0MKKey"));
		btn.click();	
		
	}
}
