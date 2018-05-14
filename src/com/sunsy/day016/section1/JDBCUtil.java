package com.sunsy.day016.section1;

import java.io.IOException;
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
import java.util.Properties;

/**
 * jdbc������
 * 
 * @param sql
 * @param params
 * @throws ClassNotFoundException
 * @throws SQLException
 * @throws IOException
 */
public class JDBCUtil {
	/**
	 * 
	 */
	private static String url;
	private static String user;
	private static String password;

	// ֻ����һ��properties����ʡio
	static {
		try {
			Properties properties = new Properties();
			properties.load(JDBCUtil.class.getResourceAsStream("/jdbc.properties"));
			String driverName = properties.getProperty("jdbc.driver");

			Class.forName(driverName);
			// 2:���һ�����ݿ�����
			// �����ַ���
			url = properties.getProperty("jdbc.url");
			user = properties.getProperty("jdbc.user");
			password = properties.getProperty("jdbc.password");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���һ������
	private static Connection getConnection() {
		Connection conn = null;
		// 0������
		// 1:ע��һ������--�����ص�jvm
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3:׼��sql���
		// String sql = "insert into recipe(dish_name,dish_details,calories)
		// values (?,?,?);";
		// 4:��������
		return conn;
	}

	// дһ���������������ӡ�ɾ�����޸�
	// �ɱ����==����
	 public static void excute(String sql, Object... params) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ռλ��,�����ɱ���������飩
			for (int i = 0; i < params.length; i++) {
				Object paramObj = params[i];
				pstmt.setObject(i + 1, params[i]);
			}
			// 5:���ִ��
			pstmt.execute();
			// 6:��Դ�Ĺر�

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static List<LinkedHashMap<String, Object>> query(String sql, Object... params) {
		// ������ļ�¼������¼���ֶ����ǲ�ȷ����
		// �Ѵ����ݿ��ѯ�����ļ�¼���浽һ��list�м�
		// һ��excel��һ��=���ݿ���һ��=һ��java�Զ��������=hashmap=json=xml
		List<LinkedHashMap<String, Object>> recordsList = null;
		try {
			Connection conn = getConnection();
			// 3:׼��sql���
			// String sql = "select * from recipe;";
			// 4:��������
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				// Object paramObj = params[i];
				pstmt.setObject(i + 1, params[i]);
			}
			// 5:���ִ��:�õ������
			ResultSet rs = pstmt.executeQuery();
			recordsList = new ArrayList<LinkedHashMap<String, Object>>();
			// ��ý������Ԫ����
			ResultSetMetaData metaData = rs.getMetaData();
			// ����
			int columCount = metaData.getColumnCount();

			while (rs.next()) {
				// ÿ����¼��װ��һ��map
				LinkedHashMap<String, Object> recordMap = new LinkedHashMap<>();
				// recordMap.put(��������Ӧ��ֵ����
				// �ֶ�����ȷ�����ǲ����з����ܹ��õ��ֶ�����
				for (int i = 1; i <= columCount; i++) {
					String m = metaData.getColumnName(i);
					// System.out.println(m);
					Object r = rs.getObject(i);
					// System.out.println(r);
					recordMap.put(m, r);
				}
				recordsList.add(recordMap);
				// System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(5));
			}
			// 6:��Դ�Ĺر�
			pstmt.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (pstmt != null) {
				try {
					pstmt.close();
					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return recordsList;
	}
}
