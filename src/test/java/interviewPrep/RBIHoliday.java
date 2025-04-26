package interviewPrep;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RBIHoliday {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rbi.org.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement popup = driver.findElement(By.xpath("//*[@id='dialogLan']"));

		// check if popup present or not
		if (popup.isDisplayed()) {
			driver.findElement(By.xpath("//button[@id='Button2' and text()='English']")).click();
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement holidayLink = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[text()='Bank Holidays']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView()", holidayLink);

		holidayLink.click();

		WebElement regionofc = driver.findElement(By.id("drRegionalOffice"));

		Select select = new Select(regionofc);
		select.selectByVisibleText("Mumbai");

		Select month = new Select(driver.findElement(By.id("drMonth")));
		month.selectByVisibleText("All Months");

		driver.findElement(By.id("btnGo")).click();

		WebElement table = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='divHolDesc']/following-sibling::table")));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\msurywan\\Desktop\\Holidaylist.txt");
			for (WebElement row : rows) {
				List<WebElement> cells = row.findElements(By.tagName("td"));

				if (cells.size() >= 3) {
					String formattedData = cells.get(0).getText() + "," + cells.get(1).getText() + "\n";
					fos.write(formattedData.getBytes());
				}

			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
		System.out.println("Test Execution Completed");
	}

}
