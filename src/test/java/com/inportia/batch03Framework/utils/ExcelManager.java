package com.inportia.batch03Framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class ExcelManager {
     
	
	 XSSFWorkbook  excelFile;
	
	  public ExcelManager(String file_name)
	  {
		  try 
		  {
	    	  File sheet = new File(file_name);
	    	  FileInputStream input = new FileInputStream(sheet);
	    	  excelFile = new XSSFWorkbook(input);
	    	  if(sheet.exists())
	    	  {
	    		  System.out.println("file eixists");
	    	  }
		  }
		  catch(Exception io)
		  {
			  io.printStackTrace();
		  }
	  }
	  
	  
	  public void openSheet(String filename)
	  {
		  
	  }
	  
	  public String getValue(String key)
	  {
		  String value = "No Value Found !!!";
		  
		  XSSFRow row;
		  XSSFSheet  sheet  = excelFile.getSheetAt(0);
          Iterator<Row> row_iter = sheet.iterator();
          
          while(row_iter.hasNext())
          {
        	  row = (XSSFRow) row_iter.next();
        	  Iterator<Cell> cell_iter = row.iterator();
        	  
        	  
        	  while(cell_iter.hasNext())
        	  {
        		  Cell cell = cell_iter.next();
        		  Iterator<Cell> temp_cell_iter = cell_iter;
        		  switch(cell.getCellType())
        		  {
        		  case Cell.CELL_TYPE_STRING:
        			  if(cell.getStringCellValue().contains(key) )
        			  {
        				  Cell cell_temp = temp_cell_iter.next();
        				  value = cell_temp.getStringCellValue();
        			  }
        		      break;
        		  default:
        			  value = cell.getStringCellValue();
        			  break;
        		  }
        	  }
        		  
          }
  
		  return value;
	  }
	  
	  
	  
}