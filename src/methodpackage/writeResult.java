package methodpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeResult {

	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static String outputFile="C:\\Project Tracking\\Document\\OutputFile\\TestStatus.xlsx";
	public static int rowCount;
	public static int colCount;
	public static Row row;
	public static Cell cell;
	public static String ComputerName;
	public static String ComputerUserID;
	public static String TimeZone;
	public static  XSSFCellStyle my_style;
	public static  XSSFCellStyle my_style1;
	public static XSSFFont my_font;
	public static XSSFFont my_font1;
	public static  XSSFCellStyle return_my_style;
	public static String regionRcvd;
	public static String lobRcvd;
	public static String timeStamp;
	public static String fileName;

	public static void main(String[] args) 
	{
		/*createFont();*/
		getFileName();
		/*createWorkBook();*/
		/*createAuthentication();*/
		
	}


	public static void createFont()
	{
		my_style=wb.createCellStyle(); /*Bold only*/
		my_style1=wb.createCellStyle(); /*Italic only*/

		/* Create XSSFFont object from the workbook */
		my_font=wb.createFont();
		my_font1=wb.createFont();

		/* set the weight of the font */
		my_font.setBold(true);
		my_font1.setItalic(true);
		/* attach the font to the style created earlier */
		my_style.setFont(my_font);
		my_style1.setFont(my_font1);
	}

	public static void createWorkBook()
	{
		try {

			fis= new FileInputStream(outputFile);
			wb= new XSSFWorkbook(fis);
			ws=wb.getSheetAt(0);
			ws.autoSizeColumn(0);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void createAuthentication()
	{
		ComputerName= CreateColumn.computerName();
		System.out.println("My Msg ComputerName is: "+ComputerName);
		ComputerUserID=CreateColumn.computerUserID();
		System.out.println("My Msg ComputerUserID is: "+ComputerUserID);
		TimeZone=CreateColumn.timeZone();
		System.out.println("My Msg TimeZone is: "+TimeZone);

	}

	public static void createRowHeader(String[] rowHead) /*Write all row headers in this method*/
	{
		/*Create row once
		Call CreateRegion;*/
		try
		{
			fis= new FileInputStream(outputFile);
			wb= new XSSFWorkbook(fis);
			ws=wb.getSheetAt(0);
			ws.autoSizeColumn(0);
			for (int i=0; i<rowHead.length;i++)
			{ 
				System.out.println("Row Head at index "+i+" is: "+rowHead[i]);
				row=ws.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue(rowHead[i]);
			}
			writeWorkbook();
			System.out.println('\n');
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void pupulateExeData() /*Here region & lob-wise execution data will be populated*/
	{
		try
		{
			for (int i=0;i<rowCount;i++)
			{
			
				
			}
		}
		catch (Exception e)
		{
			
		}
	}
	
	/*public static void createResult()	New Method to createResult
	{
		try
		{

			System.out.println("Message from inside writeResult.createResult()");
			fis= new FileInputStream(outputFile);
			wb= new XSSFWorkbook(fis);
			ws=wb.getSheetAt(0);
			ws.autoSizeColumn(0);

			 Get access to XSSFCellStyle 
			my_style=wb.createCellStyle(); Bold only
			my_style1=wb.createCellStyle(); Italic only

			 Create XSSFFont object from the workbook 
			my_font=wb.createFont();
			my_font1=wb.createFont();

			 set the weight of the font 
			my_font.setBold(true);
			my_font1.setItalic(true);
			 attach the font to the style created earlier 
			my_style.setFont(my_font);
			my_style1.setFont(my_font1);

			*//***********For Computer Name***********//*

			row=ws.createRow(0);
			cell=row.createCell(0);
			cell.setCellStyle(my_style);      Attach the style to the cell 
			cell.setCellValue("Computer Name");

			cell=row.createCell(1);
			cell.setCellStyle(my_style1);
			return_my_style=customFont.fontColor();
			cell.setCellValue(ComputerName);
			cell.setCellValue(status);

			*//***************************************//*

			*//***********For Computer User ID***********//*
			row=ws.createRow(1);
			cell=row.createCell(0);
			cell.setCellStyle(my_style);      Attach the style to the cell 
			cell.setCellValue("Computer User ID");

			cell=row.createCell(1);
			cell.setCellStyle(my_style1);
			cell.setCellValue(ComputerUserID);
			*//***************************************//*


				**********For Time Zone**********
			row=ws.createRow(2);
			cell=row.createCell(0);
			cell.setCellStyle(my_style);      Attach the style to the cell 
			cell.setCellValue("Time Zone");

			cell=row.createCell(1);
			cell.setCellStyle(my_style1);
			cell.setCellValue(TimeZone);
			*//***************************************//*
			writeWorkbook();

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}*/




	/*public static void createRegion(String[] region)
	{
		row=ws.createRow(3);
		cell=row.createCell(0);
		cell.setCellStyle(my_style);
		cell.setCellValue("Region"); Need to delete this once rowHeader() method contains this
		for (int i=0; i<region.length;i++)
		{
			System.out.println("Region at index "+i+" is: "+region[i]);
			cell=row.createCell(i+1);
			cell.setCellValue(region[i]);
		}
		System.out.println('\n');
		writeWorkbook();
	}*/

	/*public static void createLOB(String[] lob)
	{
		row=ws.createRow(4);
		cell=row.createCell(0);
		cell.setCellStyle(my_style);
		cell.setCellValue("LOB"); Need to delete this once rowHeader() method contains this
		for (int i=0; i<lob.length;i++)
		{
			System.out.println("LOB at index "+i+" is: "+lob[i]);
			cell=row.createCell(i+1);
			cell.setCellValue(lob[i]);
		}
		System.out.println('\n');
		writeWorkbook();
	}*/
	
	public static void getFileName()
	{
		timeStamp = new SimpleDateFormat("dd.MMM.yyyy_HH.mm.ss").format(new Date());
		/*System.out.println("timestamp is: "+timeStamp);*/
		timeStamp="Execution_Status-"+timeStamp;
		System.out.println("timestamp is: "+timeStamp);
	}

	public static void writeWorkbook()
	{
		try
		{
			fos= new FileOutputStream(outputFile);
			wb.write(fos);
			fos.flush();
			fos.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
