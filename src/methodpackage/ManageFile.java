package methodpackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.StandardCopyOption;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.io.Files;

public class ManageFile 
{
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static String fileName="C:\\Project Tracking\\Document\\OutputFile\\ExecutionStatus.xlsx";
	public static String destFileName="C:\\Project Tracking\\Document";
/*	public static String sourceFile;*/
	public static String dest;

	public static void main(String[] args)
	{
		instantiateIOStream();
		moveFile();
	}


	public static void instantiateIOStream()
	{
		try
		{
		/*fis= new FileInputStream(fileName);*/
		
		fos= new FileOutputStream(fileName);
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createFile()
	{
		try
		{
		/*It would contain code for saving the file as well*/
		instantiateIOStream();
		wb= new XSSFWorkbook();
		ws=wb.createSheet();
		writeFile();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void renameFile()
	{

	}

	public static void moveFile()
	{
		try
		{
			File srcFile= new File (fileName);
			File destFile= new File (destName);
			Thread.sleep(5000);
			System.out.println("msg 1");
			Files.move(srcFile, srcFile);
			/*Files.copy(srcFile, destFile);*/
			System.out.println("msg 2");
		}
		catch (Exception e)
		{
			System.out.println("msg 3");
			e.printStackTrace();
		}
			
	}

	public static void readFile()
	{

	}

	public static void writeFile()
	{
		try
		{
		wb.write(fos);
//		fos.flush();
		fos.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void deleteFile()
	{
	
	}

}
