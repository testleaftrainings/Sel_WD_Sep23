package testcase;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {

		// Step:1 Set the path of the excel file
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
		// Step:2 Identify the sheet from the book
		XSSFSheet sheet = book.getSheetAt(0);
		// Step:3 From sheet identify the row
		XSSFRow row = sheet.getRow(1);
		// Step:4 Form the row get into the column
		XSSFCell cell = row.getCell(0);
		// Step:5 read data from the cell
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);

		// to get the rowCount which ignores the first row in excel sheet by default
		// considering as header
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);

		// to get the row count including the row 1
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		int colCount = row.getLastCellNum();
		System.out.println(colCount);

		// to read all the data from the sheet
		// Sheet -->getRow(index)-->getCell(index)-->cellValue

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
		}

		
		
		
	}

}
