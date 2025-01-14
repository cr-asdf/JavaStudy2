package com.winter.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
	
	
	public void m1() {
		System.out.println("DB 접속");
		String username="hr";
		String password="hr";
		String url="jdbc:oracle:thin:@192.168.0.216:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			//1. driver를 메모리 로딩(객체 생성)
			Class.forName(driver);
			
			//2. DB에 연결
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//3. Query문 작성(SQL문 작성)
			String sql ="SELECT * FROM LOCATIONS WHERE LOCATION_ID=1000";
			
			//4. SQL문을 미리 전송
			PreparedStatement st = connection.prepareStatement(sql);
			
			//5. ? 
			
			//6. 최종 전송 후 결과 처리
			ResultSet resultSet = st.executeQuery();
			
			if(resultSet.next()) {
				System.out.println(resultSet.getInt("LOCATION_ID"));
				System.out.println(resultSet.getString("STREET_address"));
				System.out.println(resultSet.getString("POSTAL_CODE"));
				System.out.println(resultSet.getString("CITY"));
				System.out.println(resultSet.getString("STATE_PROVINCE"));
				System.out.println(resultSet.getString("COUNTRY_ID"));
				
			}else {
				System.out.println("Data가 없다");
			}
			
			//7. 자원해제
			resultSet.close();
			st.close();
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
