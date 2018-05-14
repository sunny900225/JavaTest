package com.sunsy.day016.section1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void insert(String dish_name,String dish_details,int calories) throws ClassNotFoundException, SQLException {
		//0：新增
		//1:注册一个驱动--》加载到jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:获得一个数据库连接
		//连接字符串
		String url = "jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
		String user = "recipe";
		String password = "recipe";
		Connection conn = DriverManager.getConnection(url, user, password);
		//3:准备sql语句
		String sql = "insert into recipe(dish_name,dish_details,calories) values (?,?,?);";
		//4:陈述对象
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//占位符
		pstmt.setString(1, dish_name);
		pstmt.setString(2,dish_details);
		pstmt.setInt(3, calories);
		//5:语句执行
		pstmt.execute();
		//6:资源的关闭
		pstmt.close();
		conn.close();
	}
	public static void delete(String dish_name) throws ClassNotFoundException, SQLException {
		//0：新增
		//1:注册一个驱动--》加载到jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:获得一个数据库连接
		//连接字符串
		String url = "jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
		String user = "recipe";
		String password = "recipe";
		Connection conn = DriverManager.getConnection(url, user, password);
		//3:准备sql语句
		String sql = "delete from recipe where dish_name=?;";
		//4:陈述对象
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dish_name);
		//5:语句执行
		pstmt.execute();
		//6:资源的关闭
		pstmt.close();
		conn.close();
	}
	public static void query(int id) throws ClassNotFoundException, SQLException {
		//0：新增
		//1:注册一个驱动--》加载到jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:获得一个数据库连接
		//连接字符串
		String url = "jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
		String user = "recipe";
		String password = "recipe";
		Connection conn = DriverManager.getConnection(url, user, password);
		//3:准备sql语句
		String sql = "select * from recipe where id=?;";
		//4:陈述对象
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		//5:语句执行
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()){
			System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(5));
		}
		//6:资源的关闭
		pstmt.close();
		conn.close();
	}
}
