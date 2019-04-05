package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.ELTC_093Bean;
import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object[][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins();

		Object[][] result = new Object[list.size()][];
		int count = 0;
		for (LoginBean temp : list) {
			Object[] obj = new Object[2];
			obj[0] = temp.getUserName();
			obj[1] = temp.getPassword();

			result[count++] = obj;
		}

		return result;
	}
/*
	@DataProvider(name = "db-inputs1")
	public Object[][] getDBData1() {

		List<ElearningBean> list = new ELearningDAO().getElearningUsers();

		Object[][] result = new Object[list.size()][];
		int count = 0;
		for (ElearningBean temp : list) {
			Object[] obj = new Object[7];
			obj[0] = temp.getUserName();
			obj[1] = temp.getEmail();
			obj[2] = temp.getFirstName();
			obj[3] = temp.getLastName();
			obj[4] = temp.getWebsite();
			obj[5] = temp.getPassword();
			obj[6] = temp.getRole();

			result[count++] = obj;
		}

		return result;
	}*/
	@DataProvider(name = "db-inputs1")
	public Object[][] getDBData1() {

		List<ELTC_093Bean> list = new ELearningDAO().getElearningUsers();

		Object[][] result = new Object[list.size()][];
		int count = 0;
		for (ELTC_093Bean temp : list) {
			Object[] obj = new Object[8];
			obj[0] = temp.getFirstName();
			obj[1] = temp.getLastName();
			obj[2] = temp.getEmail();
			obj[3] = temp.getPhone();
			obj[4] = temp.getUserNameTwo();
			obj[5] = temp.getPasswordTwo();
			obj[6] = temp.getLanguage();
			obj[7] = temp.getProfile();

			result[count++] = obj;
		}

		return result;
	}

	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData() {
		String fileName = "C:\\project-framework\\Testing.xlsx";
		String sheetname = "ELTC_091";
		return new ApachePOIExcelRead().getExcelContent(fileName, sheetname);
	}

	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1() {
		String fileName = "C:\\project-framework\\Testing.xlsx";
		String sheetname = "ELTC_092";
		return new ApachePOIExcelRead().getExcelContent(fileName, sheetname);
	}
	
	@DataProvider(name = "excel-inputs2")
	public Object[][] getExcelData2() {
		String fileName = "C:\\project-framework\\Testing.xlsx";
		String sheetname = "ELTC_094";
		return new ApachePOIExcelRead().getExcelContent(fileName, sheetname);
	}
	
	@DataProvider(name = "excel-inputs3")
	public Object[][] getExcelData3() {
		String fileName = "C:\\project-framework\\Testing.xlsx";
		String sheetname = "ELTC_095";
		return new ApachePOIExcelRead().getExcelContent(fileName, sheetname);
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData() {
		// ensure you will have the title as first line in the file
		return new ReadExcel().getExcelData("C:\\project-framework\\Testing.xlsx", "Sheet1");
	}
}
