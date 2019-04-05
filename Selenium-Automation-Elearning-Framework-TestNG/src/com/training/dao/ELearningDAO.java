package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean;
import com.training.connection.GetConnection;
import com.training.bean.ELTC_093Bean;
import com.training.utility.LoadDBDetails;

// Data Access Object 
public class ELearningDAO {
	
	Properties properties; 
	
	public ELearningDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<LoginBean> getLogins(){
		String sql = properties.getProperty("get.logins"); 
		
		GetConnection gc  = new GetConnection(); 
		List<LoginBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<LoginBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				LoginBean temp = new LoginBean(); 
				temp.setUserName(gc.rs1.getString(1));
				temp.setPassword(gc.rs1.getString(2));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new ELearningDAO().getLogins().forEach(System.out :: println);
	}

	public List<ELTC_093Bean> getElearningUsers() {
		
			String sql = properties.getProperty("get.logins"); 
			
			GetConnection gc  = new GetConnection(); 
			List<ELTC_093Bean> list = null;
			try {
				gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
				list = new ArrayList<ELTC_093Bean>(); 
				
				gc.rs1 = gc.ps1.executeQuery(); 
				
				while(gc.rs1.next()) {
				
					ELTC_093Bean temp = new ELTC_093Bean(); 
					
					temp.setFirstName(gc.rs1.getString(1));
					temp.setLastName(gc.rs1.getString(2));
					temp.setEmail(gc.rs1.getString(3));
					
					temp.setPhone(gc.rs1.getString(6));
					temp.setUserNameTwo(gc.rs1.getString(7));
					temp.setPasswordTwo(gc.rs1.getString(8));
					
					//temp.setWebsite(gc.rs1.getString(5));
					
					//temp.setRole(gc.rs1.getString(7));
					
					list.add(temp); 
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return list; 
		}
	}
