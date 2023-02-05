package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paramMethod {
	// ChromeDriver dr;
	demo d = new demo();

	void typeUserId(WebElement e) {
		// WebElement e//= dr.findElement(By.xpath("//input[@id=\"email\"]"));

		e.sendKeys("tummarijan@yahoo.com");
	}

	void cliCkButton(By b) {

		 d.dr.findElement(By.xpath("//button[@id='u_0_5_B8']")).click();
		d.dr.findElement(b);
	}

	void VeriFyProfile(WebElement e) {

		String value = d.dr.findElement(By.xpath("//button[@id='u_0_5_B8']")).getText();
		boolean r = value.equals("hello facebook");
		System.out.println(r);
	}
}
