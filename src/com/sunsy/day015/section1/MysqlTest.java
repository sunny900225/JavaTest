package com.sunsy.day015.section1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert();
		//delete();
		//update();
		select();
	}

	private static void insert() throws ClassNotFoundException, SQLException {
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
		String sql = "insert into recipe(dish_name,dish_details,calories) values ('水煮肉片','煮','100');";
		//4:陈述对象
		Statement stmt = conn.createStatement();
		//5:语句执行
		stmt.execute(sql);
		//6:资源的关闭
		stmt.close();
		conn.close();
	}
	private static void delete() throws ClassNotFoundException, SQLException {
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
		String sql = "delete from recipe where dish_name='水煮肉片';";
		//4:陈述对象
		Statement stmt = conn.createStatement();
		//5:语句执行
		stmt.execute(sql);
		//6:资源的关闭
		stmt.close();
		conn.close();
	}
	private static void update() throws ClassNotFoundException, SQLException {
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
		String sql = "update recipe set dish_name = '水煮肉片2' where id=6;";
		//4:陈述对象
		Statement stmt = conn.createStatement();
		//5:语句执行
		stmt.execute(sql);
		//6:资源的关闭
		stmt.close();
		conn.close();
	}
	private static void select() throws ClassNotFoundException, SQLException {
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
		String sql = "select * from recipe;";
		//4:陈述对象
		Statement stmt = conn.createStatement();
		//5:语句执行
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(5));
		}
		//6:资源的关闭
		stmt.close();
		conn.close();
	}
}
