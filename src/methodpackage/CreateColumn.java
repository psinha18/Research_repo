package methodpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CreateColumn {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static String filePath="C:\\Project Tracking\\Document\\InputFile\\DataSource.xlsx";
	public static int rowCount;
	public static int colCount;
	public static Row row; 
	public static Cell cell;
	public static CellReference cellReference; 
	public static FormulaEvaluator evaluator;
	public static InetAddress myHost;

	public static void main(String[] args) {
		
		try {
			wb = new XSSFWorkbook(filePath);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		ws=wb.getSheetAt(0);
		rowCount=ws.getLastRowNum();
		System.out.println("Total count of row is: "+ rowCount);
		System.out.println("****************************************************************************");
		colCount=ws.getRow(0).getLastCellNum();
		System.out.println("Total count of column is: "+ colCount);
		
		computerName();
		computerUserID();
		timeZone();
		printData();
	}
	

	
	public static void printData()
	{
		System.out.println("Printing message from inside printData() method");
		
		 Iterator rows = ws.rowIterator();
	        while (rows.hasNext())
	        {
	            row=(XSSFRow) rows.next();
	            Iterator cells = row.cellIterator();
	            while (cells.hasNext())
	            {
	                cell=(XSSFCell) cells.next();   
	                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
	                {
	                    System.out.print(cell.getStringCellValue()+" ");
	                }
	                else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
	                {
	                    System.out.print(cell.getNumericCellValue()+" ");
	                }
	                else
	                {
	                }
	            }
	            System.out.println();
	        }
		
	}
	
	public static String computerName()
	{
		try {
            myHost = InetAddress.getLocalHost();
//            System.out.println("Computer Name: "+myHost.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
		return myHost.getHostName();
	}
	
	public static String computerUserID()
	{
//		System.out.print("Computer User ID.: ");
//		System.out.println(System.getProperty("user.name"));
		return System.getProperty("user.name");
	}
	
	public static String timeZone()
	{
		//get Calendar instance
	    Calendar now = Calendar.getInstance();
	    
	    //get current TimeZone using getTimeZone method of Calendar class
	    TimeZone timeZone = now.getTimeZone();
	    
	    //display current TimeZone using getDisplayName() method of TimeZone class
//	    System.out.println("Current TimeZone is : " + timeZone.getDisplayName());
		return timeZone.getDisplayName();
	}

}
