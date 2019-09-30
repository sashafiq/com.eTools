package com.eTools.util;

import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.ArrayList;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	// This class contains functions to manage the excel
	public class ExcelLib {

		public ArrayList<String> cols = new ArrayList<String>();
		public String filepath;
		public File file;
		public XSSFWorkbook  workbook;
		public  FileInputStream inputStream;
		public Sheet sht;
		public String sheetname;
		public FileOutputStream outputstream;
	
		//Constructor to initialize path and sheet
		 public ExcelLib(String path,String name) throws IOException
		 {
			 filepath=path;
			 sheetname=name;
		     load(filepath,sheetname);
		  
		 }
	//load the excel 
		 public void load(String path,String sheetname) throws IOException
		 {
			 try
			 {
			//   file =    new File(path);
				 inputStream = new FileInputStream(filepath);
					 workbook = new XSSFWorkbook(inputStream);
			   setSheet(sheetname);
			   System.out.println( "load the excel");
			 }
			 catch(FileNotFoundException f )
			 {
				 
			  System.out.println("Error in Load function:"+f);
			 }
			    
		 }
		 // Set sheet 
		 public void setSheet(String sheetname)
		 {
			  sht = workbook.getSheet(sheetname);
			  readColname();
		 }
		 
		 //get rows count
		 public int getrowsCount()
		 {
	      int rowCount = sht.getLastRowNum()-sht.getFirstRowNum();
			System.out.println("Row cont:" + rowCount);
			 return rowCount;
		 }
		 
		 // read colums names
		public void readColname()
		{
			
			 int cur_row=0;
			 int cur_col=0;
			Row row = sht.getRow(cur_row);
			// System.out.println( "current row"+row);
	        int  colcount= row.getPhysicalNumberOfCells();
	   //   System.out.print("Col count:"+colcount);
	 	            //Col and row star with '0' as index
	 	      while (cur_col < colcount)
	 	      {
	 	    	 String val=row.getCell(cur_col).getStringCellValue(); 
	 	         cur_col = cur_col + 1;
	 	        cols.add(val);
	 	      }
	 	     System.out.print("Col names"); 
	 	    System.out.print(cols.get(0)); 
	 	//   System.out.print(cols.get(1));
	 	 // System.out.print(cols.get(2));
		}
		 // Get the cell value based on cloumn name and row
		 
		public String getCellValue(int row1,String colname)
		 {
			
			 String cellvalue = null;
		//String	 sheetName="Comparision";
			// sht = workbook.getSheet(sheetName);
			 int rowCount = sht.getLastRowNum()-sht.getFirstRowNum();
			//	System.out.println("Row cont in getcell methd:" + rowCount);
			//	int row1=1;
			//	 System.out.println( "row value passing"+row1);
			 Row row2 = sht.getRow(row1);
			 
		//	 System.out.println( "current row"+row2);

			 Cell cc =  row2.getCell(cols.indexOf(colname));
		//	 System.out.println( "col name"+colname);
			// cellvalue= cc.getStringCellValue();
			
			// System.out.println( "cell value"+cellvalue);
			// System.out.println( "cell type"+cc.getCellType());
			 switch (cc.getCellType())
		        {
		            case Cell.CELL_TYPE_STRING:
		            	
		                System.out.print("cell type string");
		                cellvalue= cc.getStringCellValue();
		                System.out.println( "cellvalue value"+cellvalue);
		                break;
		            case Cell.CELL_TYPE_NUMERIC:
		            	System.out.print("cell type integer");
		                int val = (int)cc.getNumericCellValue();
		                cellvalue= String.valueOf(val);
		                //cellvalue= String.valueOf(cc.getNumericCellValue());
		                break;
		                
		        }
			//  System.out.println( "cellvalue value"+cellvalue);
			  
			return cellvalue;
			
		  }
		 
		 // Write the data based on column name and row
		 public void writeCellValue(int row,int col, String Value) throws IOException
		 {
			//
			 Cell cc;
			 file =    new File(filepath);
			   outputstream= new FileOutputStream(file);
			 Row curow = sht.getRow(row);	
	//	 System.out.println("current row");
		//	 System.out.println(curow);
			 if (curow == null)
					 {
				  curow =sht.createRow(row);
				//   cc =  curow.createCell(cols.indexOf(colname));
				  cc =  curow.createCell(col);
					 }
		 else
			 {
			//  cc =  curow.getCell(cols.indexOf(colname));
			 cc =  curow.createCell(col);
		 }
			  
			cc.setCellValue(Value);
			workbook.write(outputstream);	
			
			
			  outputstream.close();
		 }
		 
		 //close workbook
		 public void close() throws IOException
		 {
			 workbook.close();
	         inputStream.close();
		 }
		 
		 
	}
