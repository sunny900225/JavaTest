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
        //1.������������
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.������ݿ�����
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        //3.ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ飨ʹ��Statement�ࣩ
        Statement st=conn.createStatement();
        
        ResultSet rs=st.executeQuery("select * from recipe");
        //4.�������ݿ�ķ��ؽ��(ʹ��ResultSet��)
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
        //3.ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ飨ʹ��Statement�ࣩ
        Statement st2=conn2.createStatement();
        
        ResultSet rs2=st2.executeQuery("select * from tb_user");
        //4.�������ݿ�ķ��ؽ��(ʹ��ResultSet��)
        while(rs2.next()){
            System.out.println(rs2.getString("id"));
        }
        
        //�ر���Դ
        rs2.close();
        st2.close();
        conn2.close();
    }
}
