package ChromeDesktop;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Desktop2
//site 2 resolution = 1366x768 chrome 
{
	Calendar cal = Calendar.getInstance();
	Date Time = cal.getTime();
	String timestamp = Time.toString().replace(":", "").replace(" ", "");

	@Test
	public void site1() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/");
		driver.manage().window().setSize(new Dimension(1366, 768));
		PageSnapshot ss = Shutterbug.shootPage(driver, Capture.FULL, true);
		ImageIO.write(ss.getImage(), "PNG", new File("./AllScreenshot/chrome_1366x768_site1" + timestamp + ".png"));
		driver.close();
	}

	@Test
	public void site2() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		driver.manage().window().setSize(new Dimension(1366, 768));
		PageSnapshot ss = Shutterbug.shootPage(driver, Capture.FULL, true);
		ImageIO.write(ss.getImage(), "PNG", new File("./AllScreenshot/chrome_1366x768_site2" + timestamp + ".png"));
		driver.close();
	}

	@Test
	public void site3() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-pro-features/");
		PageSnapshot ss = Shutterbug.shootPage(driver, Capture.FULL, true);
		ImageIO.write(ss.getImage(), "PNG", new File("./AllScreenshot/chrome_1366x768_site3" + timestamp + ".png"));
		driver.close();
	}

	@Test
	public void site4() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/best-auto-dialer-app/");
		driver.manage().window().setSize(new Dimension(1366, 768));
		PageSnapshot ss = Shutterbug.shootPage(driver, Capture.FULL, true);
		ImageIO.write(ss.getImage(), "PNG", new File("./AllScreenshot/chrome_1366x768_site4" + timestamp + ".png"));
		driver.close();
	}

	@Test
	public void site5() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
		driver.manage().window().setSize(new Dimension(1366, 768));
		PageSnapshot ss = Shutterbug.shootPage(driver, Capture.FULL, true);
		ImageIO.write(ss.getImage(), "PNG", new File("./AllScreenshot/chrome_1366x768_site5" + timestamp + ".png"));
		driver.close();

	}

}
