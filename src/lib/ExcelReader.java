package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public FileInputStream fis= null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	String path = null;
	
	//Constructor
	public ExcelReader() throws IOException{
		
		path = System.getProperty("user.dir") + "\\testdata\\testdata.xlsx";
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
	}
	
	//provide total no of rows in sheet--testcase
	public int getSheetRows(String sheetName){
		
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		return(sheet.getLastRowNum() + 1);
		
	}
	
	//provide total no of columns in sheet--testcase
    public int getSheetColumns(String sheetName){
		
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(0);
		return(row.getLastCellNum());
		
	}
    
  //provide cell value--testcase
    public String getCellData(String sheetName,int colNum,int rowNum ){
		
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		return(cell.getStringCellValue());
		
	}
    
    
	
	public static void main(String agrs[]) throws IOException{
		
		ExcelReader reader = new ExcelReader();
		System.out.println(reader.getSheetRows("LoginTest"));
		System.out.println(reader.getSheetRows("SignupTest"));
		System.out.println(reader.getSheetColumns("LoginTest"));
		System.out.println(reader.getSheetColumns("SignupTest"));
		System.out.println(reader.getCellData("LoginTest",0,3));
		
	}
	

}
