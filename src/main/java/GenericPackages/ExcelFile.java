package GenericPackages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile implements FrameWorkConstant{
	public String ToReadDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excel);
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		
		return value;
		
	}

}
