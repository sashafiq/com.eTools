package com.eTools.util;

import java.io.File;
import java.io.*;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.Arrays;
//import org.apache.commons.io.FileUtils;

//import helpers.ExcelLib;	// This class contains functions to manage the excel
	public class Utility {

		 
		public static void capturefailure(ITestResult testResult,WebDriver driver,ExcelLib datatable,int row,int col) throws IOException {
			if (testResult.getStatus() == ITestResult.FAILURE) {
				System.out.println(testResult.getStatus());
				  datatable.writeCellValue(row,col,"Fail");
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//	FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() +  ".jpg"));
			}
				else
				{
					System.out.println(testResult.getStatus());
					  datatable.writeCellValue(row,col,"Pass");
				}
		}
		 
		 
	}
