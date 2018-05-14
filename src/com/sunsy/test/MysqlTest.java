package com.sunsy.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MysqlTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
    	//MysqlTest mysqlTest = new MysqlTest();
    	//mysqlTest.mysqlConn();
    }
    @Test
    public void test() {
    	try {
			mysqlConn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void mysqlConn() throws ClassNotFoundException, SQLException{
        String URL="jdbc:mysql://127.0.0.1:3306/recipe?serverTimezone=GMT%2B8&useSSL=false";
        String USER="recipe";
        String PASSWORD="recipe";
        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库链接
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st=conn.createStatement();
        
        ResultSet rs=st.executeQuery("select * from recipe");
        //4.处理数据库的返回结果(使用ResultSet类)
        while(rs.next()){
            System.out.println(rs.getString("dish_name")+" "
                          +rs.getString("dish_details")+" "
                                  +rs.getString("id"));
        }
        rs.close();
        st.close();
        conn.close();
        
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn2=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_9griddiary?serverTimezone=GMT%2B8&useSSL=false", "9grid", "9grid");
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st2=conn2.createStatement();
        
        ResultSet rs2=st2.executeQuery("select * from tb_user");
        //4.处理数据库的返回结果(使用ResultSet类)
        while(rs2.next()){
            System.out.println(rs2.getString("id"));
        }
        
        //关闭资源
        rs2.close();
        st2.close();
        conn2.close();
    }
}
