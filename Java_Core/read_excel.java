import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  
public class ReadExcelFileDemo  
{  
public static void main(String args[]) throws IOException  
{    
FileInputStream fis=new FileInputStream(new File("C:\\demo\\student.xls"));  
HSSFWorkbook wb=new HSSFWorkbook(fis);   
HSSFSheet sheet=wb.getSheetAt(0);  
FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
for(Row row: sheet)      
{  
for(Cell cell: row)   
{  
switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
{  
case Cell.CELL_TYPE_NUMERIC:     
System.out.print(cell.getNumericCellValue()+ "\t\t");   
break;  
case Cell.CELL_TYPE_STRING:     
//getting the value of the cell as a string  
System.out.print(cell.getStringCellValue()+ "\t\t");  
break;  
}  
}  
System.out.println();  
}  
}  
}  