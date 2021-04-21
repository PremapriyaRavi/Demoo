package org.report;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	public static void main(String[] args) throws IOException{
		//to get the physical file
		ExtentHtmlReporter report=new ExtentHtmlReporter("./ExtentReports/report.html");

		//to maintain the history
		report.setAppendExisting(true);


		// to get the actual report
		ExtentReports extent=new ExtentReports();

		//to integrate physical file with actual report
		extent.attachReporter(report);

		// to create testcase with the testcase details
		ExtentTest testcase1 = extent.createTest("Login"," FaceBook login");
		testcase1.assignAuthor("Prema");
		testcase1.assignCategory("Smoke");


		testcase1.pass("userName Priyaa@123 entered sucessfully",
				MediaEntityBuilder.createScreenCaptureFromPath(".././Snapshot/userName.png").build());
		
		//testcase1.pass("userName Priyaa@123 entered sucessfully");
		testcase1.pass("passWord Qwerty entered sucessfully");
		testcase1.pass("Login clicked sucessfully");
		testcase1.fail("Login not clicked sucessfully");

		//to have the information in to the flush
		extent.flush();

	}

}
