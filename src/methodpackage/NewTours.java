package methodpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours {

	public static WebDriver driver;
	public static boolean uname;
	public static String[] rowHead;
	public static String[] region;
	public static String[] lob;

	public static void main(String[] args) {


		/*	driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");*/
		passRowHead();
		/*passRegion();
		passLOB();*/
	}
	
	
	public static String[] passRowHead()
	{
		try
		{
			String[] rowHead= {"Computer Name", "Computer User ID", "Time Zone", "Region", "LOB", "Policy #", "Start Time", "End Time", "Status", "Login", "Notification", "Task",
					"Notes", "Party Search", "Search By Specific Criteria", "Broker Info", "Policy Info", "Policy/Coverage Details", "Additional Named Insured", "Manu Script End",
					"Pricing", "Attachment Details", "Dashboard", "Overall"};	
			System.out.println("length of rowHead array is: "+rowHead.length);
			writeResult.createRowHeader(rowHead);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return rowHead;
	}

	/*public static String[] passRegion()
	{
		try
		{
			writeResult.createResult();		
			String[] region = {"US", "Canada", "Australia", "New Zealand", "Hong Kong", "Singapore", "Irwin Siegal"};
			System.out.println("length of Region array is: "+region.length);
			writeResult.createRegion(region);

			if (driver.findElement(By.xpath("//input[@name='userName']")).isEnabled())
			{
				System.out.println("User Name field is present on the Login Page");
			}
		}

		catch(Exception e)
		{
			System.out.println("Exception: User Name field is missing on the Login Page");
		}
		return region;
	}
	

	public static String[] passLOB()
	{
		try
		{
			String[] lob= {"Casualty", "Casualty", "E&P", "E&P", "WC", "WC", "WC"};
			System.out.println("length of LOB array is: "+lob.length);
			writeResult.createLOB(lob);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return lob;
	}*/

	public void closeDriver()
	{
		driver.close();
	}

}
