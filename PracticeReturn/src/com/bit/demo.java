package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	ChromeDriver dr;
	void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shanu\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		//"C:\\Users\\shanu\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
 dr = new ChromeDriver();
		
	}
void gotoUrl() {
	dr.get("http://www.facebook.com");
	
}
void typeUserId() {
	WebElement element = dr.findElement(By.xpath("//input[@id=\"email\"]"));

	element.sendKeys("tummarijan@yahoo.com");
}
void typePass(){
	WebElement passbox = dr.findElement(By.xpath("//input[@id=\"pass\"]"));
	passbox.sendKeys("saahir16");
	
}
void cliCkButton() {

	dr.findElement(By.xpath("//button[contains(@id,'u_')]")).click();
	
}
void VeriFyProfile() {
	String value=dr.findElement(By.xpath("//button[contains(@id,'u_')]")).getText();
	boolean r =value.equals("hello facebook");
	System.out.println(r);
}
}
