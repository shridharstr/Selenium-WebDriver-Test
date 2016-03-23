package ExcelReader;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIClass
{
	public static XSSFCell cell;
	
	public static void main(String[] args) throws IOException
	{
		int rowCount, cellCount;
		
	  String excelFile = "C:\\Users\\shridhars\\Documents\\Selenium Test\\SomePrivateLimited.xlsx";
	  FileInputStream inputStream = new FileInputStream(new File(excelFile));
	  
	  XSSFWorkbook wbook = new XSSFWorkbook(inputStream);
	  XSSFSheet Sheet = wbook.getSheet("Designations");
	  XSSFRow row;
	  rowCount = Sheet.getLastRowNum() - Sheet.getFirstRowNum();
	  
 for(int i=0; i< wbook.getNumberOfSheets();i++)
 {
	 System.out.println("\n\nGetting data from the Sheet: "+wbook.getSheetName(i));
	 Sheet = wbook.getSheetAt(i);
	 
	 for(int j=0; j<= rowCount; j++)
 
	  {
		  row = (XSSFRow) Sheet.getRow(j);
		  cellCount = row.getLastCellNum()-row.getFirstCellNum();
		  System.out.println("\nRow Number: "+row.getRowNum());
		  
		  for(int k=0; k<cellCount;k++) 
		  {
			  cell = row.getCell(k);
			  switch(cell.getCellType())
			  {
			  case XSSFCell.CELL_TYPE_STRING:
				  System.out.print(" [Cell No. " + k + " ]: " + cell.getStringCellValue() + " ");
				  break;
				  
			  case XSSFCell.CELL_TYPE_NUMERIC:
				  System.out.print(" [Cell No. " + k + " ]: " + cell.getNumericCellValue() + " ");
				  break;
			  default:
                   System.out.println("None of String / Numeric values detected");
	     	  }
	      }
        } 
    }
   wbook.close();
  }
}
