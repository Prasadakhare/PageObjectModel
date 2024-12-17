package testScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LoginTest {
	WebDriver driver;
	Properties prop;
	
	//Setup Method
	@Test(dataProvider="loginData")
	@BeforeTest
	public void setup() throws IOException  {
		prop = new Properties();
		String path = System.getProperty("user.dir")
				+ "//src//test//resources//configFile//config.properties";
	
		
		FileInputStream fin = new FileInputStream(path);
		prop.load(fin);
		String strBrowser= prop.getProperty("browser");
		
		if(strBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(strBrowser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}
	
	//To used excel as objextRepo
	public String readObjpath() {
		String objPath =  "";
		String path = "//src//test//resources//dataFiles//loginRepo.xlsx";
		FileInputStream fin;
		XSSFWorkbook workbook = null;
		
		try {
			fin = new FileInputStream(path);
			workbook = new 		XSSFWorkbook(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet loginsheet = workbook.getSheet("loginRepo");
        int numRows = loginsheet.getLastRowNum();
        for(int i = 0; i<=numRows; i++) {
        	XSSFRow row = loginsheet.getRow(i);
        	if(row.getCell(0).getStringCellValue().equalsIgnoreCase(objeName)){
        		objPath= row.getCell(1).getStringCellValue();
        	}
        }
		
		return objPath;
		
	}
	
	
	//login validation
	@Test(dataProvider="loginRepo")
	public void validLogin(String struser, String strpwd) {
		 driver.get(prop.getProperty("url"));
		 driver.findElement(By.xpath(readObjpath("username"))).sendKeys(struser);
		 driver.findElement(By.name(readObjpath("password"))).sendKeys(strpwd);
		 driver.findElement(By.cssSelector(readObjpath("button.radius"))).click();
		 
		 boolean isValidUser = driver.findElement(By.cssSelector(readObjpath("successMsg")));
		 Assert.assertTrue(isValidUser);
	
		}
	
	
	//get data from csv file
	@DataProvider (name="loginData")
	public Object[][] getData() throws CsvValidationException, IOException{
		String path = System.getProperty("user.dir")+
				"//src//test//resources//dataFiles//loginData.csv";
				CSVReader reader = new CSVReader(new FileReader(path));
				String cols[];
				ArrayList<Object> dataList = new 	ArrayList<Object>();
				while((cols=reader.readNext()) !=null) {
					Object record[] = {cols[0], cols[1]};
					dataList.add(record);
					
				}
				
				reader.close();
		
		return dataList.toArray(new Object[dataList.size()][]);
		
	}
	
	
}
