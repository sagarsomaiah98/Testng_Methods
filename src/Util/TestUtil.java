package Util;

import java.util.ArrayList;

import org.apache.batik.ext.awt.image.rendered.LRUCache.LRUObj;

public class TestUtil {
	
	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData= new ArrayList<>();
		
		Xls_Reader xls = new Xls_Reader("S:\\WORKSPACE\\Testng_Methods\\src\\TestData\\REGISTER_USERS.xlsx");
		
		int rowCount = xls.getRowCount("USER_DETAILS");
		System.out.println(rowCount);
		
		for(int i=2;i<=rowCount;i++) {
			String uname=xls.getCellData("USER_DETAILS", "USERNAME", i);
			String fname=xls.getCellData("USER_DETAILS", "FNAME", i);
			String lname=xls.getCellData("USER_DETAILS", "LNAME", i);
			String email=xls.getCellData("USER_DETAILS", "EMAIL", i);
			String pwd=xls.getCellData("USER_DETAILS", "PASSWORD", i);
			System.out.println(uname+" "+fname+" "+lname+" "+email+" "+pwd);
			
			Object[] obj= {uname,fname,lname,email,pwd};
			
			myData.add(obj);
			
		}
		return myData;
	}

	public static void main(String[] args) {
		getDataFromExcel();

	}

}
