package com.utilities.oem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.asm.Advice.Return;

public class ExcelUtilSerialNumber {
	static FileInputStream file;
	public static String getCellData(String path, String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		String value = "";
		try {
			file	 = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(file);

			Sheet Sheet = wb.getSheet("Searchdata1");
			Row row = Sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);

			wb.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return value;
	}

}
