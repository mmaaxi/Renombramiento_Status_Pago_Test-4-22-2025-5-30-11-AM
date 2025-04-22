package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_011Page {

    private Workbook workbook;
    private Sheet sheet;

    public void loadExcelFile(String filePath) {
        try {
            FileInputStream excelFile = new FileInputStream(new File(filePath));
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheetAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inspectExcelHeader() {
        // This method can be used for setup or additional inspection if needed
    }

    public String getExcelHeader() {
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0); // Assuming header is in the first cell of the first row
        return cell.getStringCellValue();
    }
}