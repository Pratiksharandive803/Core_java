package com.assjdbc;
import java.sql.Connection;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DemoConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn;
		 Statement st;
		String query="Insert into employee values(8,'python')";
		
		try {
		
		MysqlDataSource ds=new MysqlDataSource();
		
		
		ds.setUser("root");
		ds.setPassword("pratiksha@2004");
		ds.setDatabaseName("sof_j2ee");
		ds.setServerName("localhost");
		ds.setPort(3306);
		
		conn=ds.getConnection();
		
		st=conn.createStatement();
		int row=st.executeUpdate(query);
		if(row>0)
			System.out.println("success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
        
	}
}
