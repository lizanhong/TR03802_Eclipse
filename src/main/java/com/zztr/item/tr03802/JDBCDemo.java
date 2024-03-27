package com.zztr.item.tr03802;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {
	public void query() throws Exception{
		//加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//创建连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yf03001?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8", "root", "123456");
		//执行sql语句
		PreparedStatement stmt = conn.prepareStatement("select * from dept");
		//获取返回的结果
		ResultSet rs = stmt.executeQuery();
		//读取结果
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		//释放资源 
		rs.close();
		stmt.close();
		conn.close();
	}
	
	public static void main(String[] args) throws Exception{
		new JDBCDemo().query();
	}
}
