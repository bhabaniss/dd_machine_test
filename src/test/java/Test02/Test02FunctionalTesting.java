package Test02;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Test02FunctionalTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'chevron_right')]")).click();
		driver.findElement(By.xpath("//span[(text()='Orders')]")).click();
		driver.findElement(By.xpath("//button[(text()='Add Bulk Orders')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'mui')]")).sendKeys("D:\\automation testing\\demo-data.xlsx");
		driver.findElement(By.xpath("//button[contains(text(),'Import')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Validate Data')]")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		driver.findElement(By.xpath("//button/span[text()='menu']")).click();
		Shutterbug.shootPage(driver, Capture.FULL,true).save("./SS");
		
		driver.close();
		

	}

}
