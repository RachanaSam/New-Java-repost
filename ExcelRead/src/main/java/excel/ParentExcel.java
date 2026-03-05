package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParentExcel {
	static FileInputStream f;//java IO package class to read data
	static XSSFWorkbook wb;// apache class to read data from workbook
	static XSSFSheet   sh;// apache class to read data from sheet
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("D:\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");//getSheet is a method used to get data from sheet
		XSSFRow r =sh.getRow(a);//XSSFROW is a apache class and getrow is a method used to read data from row
		XSSFCell c = r.getCell(b);//XSSFCell is a apache class and getcell is a method used to read data from cell
		return c.getStringCellValue();//getStringCellValue is a method used to get string value
	}
	public static String getintData(int a,int b) throws IOException
	{
		f = new FileInputStream("D:\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		//return c.getNumericCellValue();
		int value=(int)c.getNumericCellValue();//getNumericCellValue()is a method
		return String.valueOf(value);// Type conversion 
		
	}
	public static float getfloatData(int a,int b) throws IOException
	{
		f = new FileInputStream("D:\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		//return c.getNumericCellValue();
		float value=(float)c.getNumericCellValue();//getNumericCellValue()is a method
		return value;// Type conversion 
		
	}

}
