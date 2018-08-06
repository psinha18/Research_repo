package methodpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class customFont {

	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static String outputFile="C:\\Project Tracking\\Document\\OutputFile\\TestStatus.xlsx";
	public static  XSSFCellStyle my_style;
	public static XSSFFont my_font;

	public static void fileContainer()
	{
		try 
		{
			fis= new FileInputStream(outputFile);
			System.out.println("test msg 1");
			wb= new XSSFWorkbook(fis);
			ws=wb.getSheetAt(0);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fontBold()
	{
		wb= new XSSFWorkbook();
		ws= wb.createSheet("Employee");
		my_font = wb.createFont();
		my_font.setBold(true);
	}

	public static void fontItalic()
	{
		wb= new XSSFWorkbook();
		my_style=wb.createCellStyle();
		my_font = wb.createFont();
		my_font.setItalic(true);
	}

	public static void fontSize()
	{
		wb= new XSSFWorkbook();
		my_style=wb.createCellStyle();
		my_font = wb.createFont();
		my_font.setFontHeightInPoints((short) 14);
	}

	public static XSSFCellStyle fontColor()
	{
		wb= new XSSFWorkbook();
		my_style=wb.createCellStyle();
		my_font = wb.createFont();
		my_font.setColor(IndexedColors.RED.getIndex());
		return my_style;
	}
}