package ProjectFunTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[1]/div[2]/button/div[1]/span[2]\r\n")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\'MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-vwfva9\']")).click();
		Thread.sleep(2000);
		WebElement file =driver.findElement(By.xpath("//*[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputSizeSmall css-1imb3v5']"));
		//file.click();
		file.sendKeys("S:\\demo-data.xlsx");
	
		driver.findElement(By.xpath("//button[@class=\'MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy\']")).click();
	    
		driver.findElement(By.xpath("//button[@class=\'MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy\']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File  trgfile = new File("s:\\screens\\output.png");
		FileUtils.copyFile(srcfile, trgfile);
	driver.quit();
	}
	
	


	


}
