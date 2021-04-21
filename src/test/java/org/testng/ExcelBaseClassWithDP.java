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
import org.testng.annotations.DataProvider;

public class ExcelBaseClassWithDP {
	@DataProvider(name="rep")
	private Object[][] data() throws Throwable {
	return getData();
	}
	public Object[][] getData() throws Throwable {
		String value = null;
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Demo\\Excel\\Datas.xlsx");
		FileInputStream in=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(in);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(0);
		int rowCount = s.getPhysicalNumberOfRows();
		int cellCount = r.getPhysicalNumberOfCells();
		System.out.println("rowCount:"+rowCount);
		System.out.println("cellCount:"+cellCount);
		Object[][] obj=new Object[rowCount][cellCount];
		for (int i = 0; i < rowCount; i++) {
			Row r1 = s.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				Cell c = r1.getCell(j);

				//System.out.println(c);
				//System.out.println(c.getCellType());
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
				obj[i][j]=value;
			}    
		}
		return obj;
	}
}
