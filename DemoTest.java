package automationProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoTest {

	public static void main(String[] args) throws Exception
	{
		readAllData("test data","D:\\SKILLRARY TRAINING\\sample.xlsx");
			
		}
		public static void readAllData(String sheetname,String filepath) throws Exception 
		{
			FileInputStream file = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet(sheetname);
			int row = sh.getLastRowNum();
			short cell = sh.getRow(0).getLastCellNum();
			for (int i = 0; i <= row; i++) {
				for (int j = 0; j < cell; j++) {
					String wb1 = sh.getRow(i).getCell(j).toString();
					System.out.println(wb1);
					
				}

		}
		/*
		 * public void moveToElement(WebDriver driver,WebElement wb) { Actions act = new
		 * Actions(driver); act.moveToElement(wb); } public void
		 * getOptionsInDropDown(WebElement sel) { Select select = new Select(sel);
		 * select.getOptions(); }
		 */
		

	}

}
