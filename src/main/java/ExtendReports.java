import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReports {

	ExtentHtmlReporter html;
	ExtentReports extent;
	ExtentTest test;
	
	public  void runReport() {
		html = new ExtentHtmlReporter("./Report/extentReport.html");
		extent = new ExtentReports();
		html.setAppendExisting(true);
		extent.attachReporter(html);
		test = extent.createTest("TC001_Login", "Login to Leaftab");
		test.assignAuthor("Anand");
		test.assignCategory("Sanity");
		
	
			try {
				test.fail("user name DemoSalesManger entered successfully...",
						
						MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
			} catch (IOException e) {
		
				e.printStackTrace();
			}
			
			extent.flush();
			
	
		
	}
	}

