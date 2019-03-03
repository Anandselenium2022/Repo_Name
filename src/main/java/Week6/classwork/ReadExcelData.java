package Week6.classwork;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wBook = new XSSFWorkbook("./Data/TC001.xlsx");
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();

		// String data[][] = new String[rowCount][colCount];

		String cellValue = cell.getStringCellValue();

		System.out.println(cellValue);

		System.out.println(rowCount);

		System.out.println(colCount);

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cells = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cells);
			}

			// data[i-1][j] = cells.getStringCellValue();
		}
	}

}
