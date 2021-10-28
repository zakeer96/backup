package pom_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		 String path="C:\\Users\\WorkSmart\\Desktop\\datails.xlsx";
		 FileInputStream file=new FileInputStream(path);
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			XSSFSheet sheet= workbook.getSheetAt(0);
		
			int rows=sheet.getLastRowNum();
			int cols=sheet.getRow(1).getLastCellNum();
			
			for(int r=0; r<=rows; r++)
			{
				XSSFRow row=sheet.getRow(r);
				
				for(int c=0; c<cols; c++)
				{
					XSSFCell cell=row.getCell(c);
					
					System.out.print("    "+cell);
				}			
				System.out.println();
			}
		}
}


