package test_utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static String fetchDataFromExcelSheet(int  row, int col) throws IOException{
		
		 String path="C:\\Users\\WorkSmart\\Desktop\\datails.xlsx";
		 FileInputStream file=new FileInputStream(path);
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			XSSFSheet sheet= workbook.getSheetAt(0);
		
			int rows=sheet.getLastRowNum();
			int cols=sheet.getRow(1).getLastCellNum();
			
			for(int r=0; r<=rows; r++)
			{
				XSSFRow Row=sheet.getRow(r);
				
				for(int c=0; c<cols; c++)
				{
					XSSFCell cell=Row.getCell(c);
					
					System.out.print("    "+cell);
				}			
				System.out.println();
			}
		
		return"data";
	}
	
	public static void captureScreenShot(WebDriver driver) throws IOException {
		
		LocalDateTime d=java.time.LocalDateTime.now();
	
	 String FileName = d.toString().replace(":", "_").replace(" ", "_");
		
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\software testing\\screenshot\\image"+FileName+".jpg" );
	FileHandler.copy(source, dest);
	}
	
}
