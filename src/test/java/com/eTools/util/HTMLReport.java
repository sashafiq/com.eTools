package com.eTools.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class HTMLReport {
	

	         private BufferedWriter   _reportWriter;
	       //  System.IO.StreamWriter createReportSummary;
	         public String TestCaseName; 
	         private String _ReportTime;
	         private String _ReportPath;
	       
	          public  HTMLReport(String ReportPath, String ReportTitle ) throws IOException 
	          {
	        	  _reportWriter = new BufferedWriter(new FileWriter(ReportPath,false));
	              Date dNow = new Date();
	              SimpleDateFormat ft = new SimpleDateFormat ("yyyy-dd-MM.hh.mm.ss");
	              _ReportTime = ft.format(dNow);
	              _ReportPath = ReportPath;
	              WriteReportTitleAndHeader(ReportTitle);
	          //    WriteReportHeader();
	                
	          }

	          private void WriteReportTitleAndHeader(String TitleName) throws IOException
	          {
	        	
	        	  _reportWriter = new BufferedWriter(new FileWriter(_ReportPath,false));	        	
	             
	            	  _reportWriter.append("<html><head><title>" + TitleName + " </title></head>");
	            	  _reportWriter.append("<body bgcolor='#FFFFFF'><p align='lefSyt' size=9></p><p size=30><center><h2   style=color:Brown;> eTools FAM-Audit Automated Test Report</h2></center></p><p align='right' size=12><b>Date:"  +_ReportTime+ "</b></p>");
	            	  _reportWriter.append("<table width='100%' border='1' class='invocation-passed'><tr><td width='15%' td bgcolor='#ADD8E6'><b>TEST STEP NAME</b></td><td width='20%' bgcolor='#ADD8E6'><b>EXPECTED RESULT</b></td><td width='20%' bgcolor='#ADD8E6'><b>ACTUAL RESULT</b></td><td width='8%' bgcolor='#ADD8E6'><b>RESULTS</b></td><td width='10%' bgcolor='#ADD8E6'><b>COMMENTS</b></td></tr>");

	            	  _reportWriter.close();
	            			
	              
	          }


	        private void WriteReportHeader() throws IOException
	        {
	        	
	        	_reportWriter = new BufferedWriter(new FileWriter(_ReportPath,false));
	            {
	               
	                _reportWriter.close();
	            }
	        }

	        public void WriteResult(String TestStep, String ExpectedResult, String ActualResult, String Status, String Comments) throws IOException
	        {
	        	try
	        	{
	        		File file = new File (_ReportPath);
	        	FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
			
				//String TestCaseName="ZipCodeTaxValidation";
				//String TestStep1="Test step";
				int row =0;
				while (( bufferedReader.readLine()) != null) {
					if (row==0)
					{
					System.out.println("Contents of file:"+ bufferedReader.readLine());
						_reportWriter = new BufferedWriter(new FileWriter(_ReportPath,true));
		           
		               
		                _reportWriter.write("<tr>");
		              //  _reportWriter.write("<td>" + TestCaseName + "</td>");
		               _reportWriter.write("<td>" + TestStep + "</td>");
		               _reportWriter.write("<td>" + ExpectedResult + "</td>");
		               _reportWriter.write("<td>" + ActualResult + "</td>");
		               if (Status.toLowerCase().equalsIgnoreCase("fail"))
		               {
		               _reportWriter.write("<td style=color:#FF0000>" + Status + "</td>");
		               }
		              else if(Status.toLowerCase().equalsIgnoreCase("Pass"))
		               {
		            	  _reportWriter.write("<td>" + Status + "</td>");
				              	   
		              }
		               _reportWriter.write("<td>" + Comments + "</td>");
		                _reportWriter.write("</tr>");
		                _reportWriter.close();
		                row=row+1;
					}
		          
				}
				fileReader.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
  
	                
	      }
	        }

	
	        
	 