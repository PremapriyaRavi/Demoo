package org.testng;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBaseClass {
	public static String getData(int row,int cell)throws Throwable {
		String value = null;
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Demo\\Excel\\Fb.xlsx");
		FileInputStream in=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(in);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(row);
		Cell c=r.getCell(cell);
				int type = c.getCellType();
				if(type==1) {
					System.out.println(c.getStringCellValue());
				}else if(type==0) {
					if(DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat f=new SimpleDateFormat("dd/mm/yyyy");
						 value = f.format(date);
						//System.out.println(value);
					}else {
						double d = c.getNumericCellValue();
						long l=(long)d;
						 value = String.valueOf(l);
						//System.out.println(value);
					}
				}
		return value;
	}
}
