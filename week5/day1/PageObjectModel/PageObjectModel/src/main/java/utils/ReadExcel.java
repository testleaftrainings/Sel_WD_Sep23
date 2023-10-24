package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./data/"+fileName+".xlsx");

		XSSFSheet sheet = book.getSheetAt(0);

		XSSFRow row = sheet.getRow(1);

		int rowCount = sheet.getLastRowNum();

		int colCount = row.getLastCellNum();

		//to integrate the data read from the excel push to the testcase
		String[][] data = new String[rowCount][colCount];//empty @D string array with row size and col size

		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j]=stringCellValue;  
				//System.out.println(data);
				//data[1][0] =wipro 0,0
				//1,1=Aruna			0,1
				//1,2=S				0,2
				
				//2,0=TCs			1,0
				//2,1=Mythili		1,1
				//2,2=B				1,2
				
				//3,0=wipro			2,0
				//3,1=Manikandan	2,1
				//3,2=V				2,2
			}
			
			
			
			
		}
		
		book.close(); //mandatory step
		return data;

	}

}
