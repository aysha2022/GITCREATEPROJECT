package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserConfiq {

	public static void main(String[] args) {
		demo d=new demo();
		d.openBrowser();
		d.gotoUrl();
		d.typeUserId();
		d.typePass();
		d.cliCkButton();
		d.VeriFyProfile();

//		System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\shanu\\Downloads\\chromedriver_win32 (3)\"");
//			
//				//"C:\\Users\\shanu\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
//		ChromeDriver dr = new ChromeDriver();
//		dr.get("http://www.facebook.com");
//		WebElement element = dr.findElement(By.xpath("//input[@id=\"email\"]"));
//
//		element.sendKeys("tummarijan@yahoo.com");
//		
//		WebElement passbox = dr.findElement(By.id("password"));
//		passbox.sendKeys("saahir16");
//	
//		dr.findElement(By.id("")).click();
//		String value=dr.findElement(By.id("")).getText();
//		boolean r =value.equals("hello facebook");
//		System.out.println(r);
//	}

	}
}