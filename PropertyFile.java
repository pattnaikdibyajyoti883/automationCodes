package automationProject;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeTest;

public class PropertyFile {
	public static void main(String[] args) throws Throwable 
	{
		//Inserting a file 
		FileInputStream file = new FileInputStream("D:\\SKILLRARY TRAINING\\sample.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("test data");
		int row_len = sheet.getLastRowNum();
		short cell_len = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <=row_len; i++) 
		{
			for (int j = 0; j <cell_len; j++) 
			{
				String data = sheet.getRow(i).getCell(j).toString();
				System.out.println(data);
			}
			System.out.println();
		}
		/*
		 * Output- Username virat.k@mailinator.com
		 * 
		 * password Password@skype123
		 * 
		 * url https://d38ujozxngp8ds.cloudfront.net/
		 * 
		 * browser chrome
		 */
		/*
		 * //Property File Properties prop = new Properties(); //Loading the property
		 * file prop.load(file); String browser = prop.getProperty("browser"); String
		 * url = prop.getProperty("url"); String username =
		 * prop.getProperty("username"); String password = prop.getProperty("password");
		 * 
		 * System.out.println("The browser to be launched is " + browser);
		 * System.out.println("The url of the application is " + url);
		 * System.out.println("The username to be entered is " + username);
		 * System.out.println("The password to be entered is " + password);
		 */
		
		
		

	}

}
