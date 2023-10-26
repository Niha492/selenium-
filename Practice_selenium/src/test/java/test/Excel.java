package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws Throwable 
	{
	HSSFWorkbook workbook=new HSSFWorkbook();
	HSSFSheet sheet=workbook.createSheet();
	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("Hello");
	sheet.getRow(0).createCell(1).setCellValue("World");
	sheet.createRow(1);
	sheet.getRow(1).createCell(0).setCellValue("Hello");
	sheet.getRow(1).createCell(1).setCellValue("Clean");
	File file=new File("C:\\Users\\sree\\eclipse-workspace\\Practice_selenium\\target\\excelfolder\\Test.xls");
	workbook.write(file);
	workbook.close();
	FileOutputStream fos=new FileOutputStream(file);
	workbook.write(fos);
	workbook.close();
	
	}

}
