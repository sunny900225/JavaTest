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
		//0������
		//1:ע��һ������--�����ص�jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:���һ�����ݿ�����
		//�����ַ���
		String url = "jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
		String user = "recipe";
		String password = "recipe";
		Connection conn = DriverManager.getConnection(url, user, password);
		//3:׼��sql���
		String sql = "insert into recipe(dish_name,dish_details,calories) values ('ˮ����Ƭ','��','100');";
		//4:��������
		Statement stmt = conn.createStatement();
		//5:���ִ��
		stmt.execute(sql);
		//6:��Դ�Ĺر�
		stmt.close();
		conn.close();
	}
	private static void delete() throws ClassNotFoundException, SQLException {
		//0������
		//1:ע��һ������--�����ص�jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:���һ�����ݿ�����
		//�����ַ���
		String url = "jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
		String user = "recipe";
		String password = "recipe";
		Connection conn = DriverManager.getConnection(url, user, password);
		//3:׼��sql���
		String sql = "delete from recipe where dish_name='ˮ����Ƭ';";
		//4:��������
		Statement stmt = conn.createStatement();
		//5:���ִ��
		stmt.execute(sql);
		//6:��Դ�Ĺر�
		stmt.close();
		conn.close();
	}
	private static void update() throws ClassNotFoundException, SQLException {
		//0������
		//1:ע��һ������--�����ص�jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:���һ�����ݿ�����
		//�����ַ���
		String url = "jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
		String user = "recipe";
		String password = "recipe";
		Connection conn = DriverManager.getConnection(url, user, password);
		//3:׼��sql���
		String sql = "update recipe set dish_name = 'ˮ����Ƭ2' where id=6;";
		//4:��������
		Statement stmt = conn.createStatement();
		//5:���ִ��
		stmt.execute(sql);
		//6:��Դ�Ĺر�
		stmt.close();
		conn.close();
	}
	private static void select() throws ClassNotFoundException, SQLException {
		//0������
		//1:ע��һ������--�����ص�jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:���һ�����ݿ�����
		//�����ַ���
		String url = "jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
		String user = "recipe";
		String password = "recipe";
		Connection conn = DriverManager.getConnection(url, user, password);
		//3:׼��sql���
		String sql = "select * from recipe;";
		//4:��������
		Statement stmt = conn.createStatement();
		//5:���ִ��
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(5));
		}
		//6:��Դ�Ĺر�
		stmt.close();
		conn.close();
	}
}
