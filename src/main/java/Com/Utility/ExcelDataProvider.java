package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String Path="C:\\Users\\Anand\\eclipse-workspace\\New_Project\\TestData\\datasheet.xlsx";
		FileInputStream file=new FileInputStream(Path);
		wb=new XSSFWorkbook(file);		
	}
	public String getStringData(String Sheet,int row,int cell) {
		return wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
	}
}