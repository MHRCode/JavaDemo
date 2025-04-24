package com.homejava.practice11;

interface WebDriver {
	/*
	 * Create a WebDriver Interface that will have the following unimplemented
	 * behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
	 * 
	 * Create another interface named Camera that will have the method:
	 * takePicture(); Create 2 classes that implements WebDriver and Camera
	 * interfaces: ChromeDriver and FirefoxDriver.
	 */
	
	public void openBrowser();
	public void closeBrowser();
	public void maximizeWindow();
	public void findElement();
}
	
interface Camera{
		public void takePicture();
	}



class chromeDriver implements WebDriver, Camera {
	public void openBrowser() {
		System.out.println("open Chrome browser.");
		
	}

	@Override
	public void closeBrowser() {
System.out.println("close the browser.");		
	}

	@Override
	public void maximizeWindow() {
System.out.println("maximize the Chrome window.");		
	}

	@Override
	public void findElement() {
System.out.println("find the element in Chrome.");		
	}

	@Override
	public void takePicture() {
System.out.println("takes the pictures.");		
	}
}