package kiteTestBaseUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class Utility {
public static  String getDatafromExcel(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile1 = new FileInputStream("C:\\Users\\nikhi\\eclipse-workspace\\SeleniumUse\\excelsheet1.xlsx");
		Sheet mysheet1 = WorkbookFactory.create(myfile1).getSheet("S5");
		String value = mysheet1.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
public static void captureScreenshot(WebDriver driver, int TCID) throws IOException
{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\nikhi\\eclipse-workspace\\SeleniumUse\\SS Saved\\UtilityMyscreenshot.jpeg");
		FileHandler.copy(source, destination);
}
//@SuppressWarnings("deprecation")
//public void Waitfor(WebDriver driver, int A)
//{
//		driver.manage().timeouts().implicitlyWait(A, TimeUnit.SECONDS);
//}
}
