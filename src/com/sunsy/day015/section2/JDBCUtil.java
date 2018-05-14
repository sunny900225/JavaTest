package com.sunsy.day015.section2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


public class JDBCUtil {
	/**
	 * jdbc������
	 * @param sql
	 * @param params
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	//дһ���������������ӡ�ɾ�����޸�
	//�ɱ����==����
		public static void excute(String sql,Object...params) throws ClassNotFoundException, SQLException {
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
			//String sql = "insert into recipe(dish_name,dish_details,calories) values (?,?,?);";
			//4:��������
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//ռλ��,�����ɱ���������飩
			for (int i = 0;i < params.length;i++){
				Object paramObj = params[i];
				pstmt.setObject(i+1,params[i]);
			}
			//5:���ִ��
			pstmt.execute();
			//6:��Դ�Ĺر�
			pstmt.close();
			conn.close();
		}
		
		public static List<LinkedHashMap<String, Object>> query(String sql,Object...params) throws ClassNotFoundException, SQLException {
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
			//String sql = "select * from recipe;";
			//4:��������
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0;i < params.length;i++){
				//Object paramObj = params[i];
				pstmt.setObject(i+1,params[i]);
			}
			//5:���ִ��:�õ������
			ResultSet rs = pstmt.executeQuery();
			//������ļ�¼������¼���ֶ����ǲ�ȷ����
			//�Ѵ����ݿ��ѯ�����ļ�¼���浽һ��list�м�
			//һ��excel��һ��=���ݿ���һ��=һ��java�Զ��������=hashmap
			List<LinkedHashMap<String, Object>> recordsList = new ArrayList<LinkedHashMap<String, Object>>();
			//��ý������Ԫ����
			ResultSetMetaData metaData = rs.getMetaData();
			//����
			int columCount = metaData.getColumnCount();
			
			while(rs.next()){
				//ÿ����¼��װ��һ��map
				LinkedHashMap<String, Object> recordMap= new LinkedHashMap<>();
				//recordMap.put(��������Ӧ��ֵ����
				//�ֶ�����ȷ�����ǲ����з����ܹ��õ��ֶ�����
				for (int i = 1;i <= columCount; i++){
					String m=metaData.getColumnName(i);
					//System.out.println(m);
					Object r= rs.getObject(i);
					//System.out.println(r);
					recordMap.put(m, r);
				}
				recordsList.add(recordMap);
				//System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(5));
			}
			//6:��Դ�Ĺر�
			pstmt.close();
			conn.close();
			return recordsList;
		}
}
