package com.winter.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class LocationDAO {
	
	public void getList()throws Exception{
		Connection con = DBConnection.getConnection();
		String sql="SELECT * FROM LOCATIONS";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("LOCATION_ID"));
		}
		
		DBConnection.disConnect(rs, st, con);
		
	}
	
	public void getDetail() throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql="SELECT * FROM LOCATIONS WHERE LOCATION_ID=1000";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getInt("LOCATION_ID"));
		}else {
			System.out.println("Data 없다");
		}
		
		DBConnection.disConnect(rs, st, connection);
	}

}
