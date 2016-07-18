package com.stockaccounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstprog {

	public static void main(String[] args) {
		
	WebDriver driver=new FirefoxDriver();
	
driver.get("http://webapp.qedgetech.com");
driver.manage().window().maximize();
driver.findElement(By.id("btnreset")).click();

driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("master");
driver.findElement(By.id("btnsubmit")).click();


	

}
}