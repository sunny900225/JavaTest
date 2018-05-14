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
 * jdbc工具类
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

	// 只加载一次properties，节省io
	static {
		try {
			Properties properties = new Properties();
			properties.load(JDBCUtil.class.getResourceAsStream("/jdbc.properties"));
			String driverName = properties.getProperty("jdbc.driver");

			Class.forName(driverName);
			// 2:获得一个数据库连接
			// 连接字符串
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

	// 获得一次连接
	private static Connection getConnection() {
		Connection conn = null;
		// 0：新增
		// 1:注册一个驱动--》加载到jvm
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3:准备sql语句
		// String sql = "insert into recipe(dish_name,dish_details,calories)
		// values (?,?,?);";
		// 4:陈述对象
		return conn;
	}

	// 写一个方法来处理增加、删除、修改
	// 可变参数==数组
	 public static void excute(String sql, Object... params) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// 占位符,遍历可变参数（数组）
			for (int i = 0; i < params.length; i++) {
				Object paramObj = params[i];
				pstmt.setObject(i + 1, params[i]);
			}
			// 5:语句执行
			pstmt.execute();
			// 6:资源的关闭

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
		// 结果集的记录数、记录的字段数是不确定的
		// 把从数据库查询出来的记录保存到一个list中间
		// 一个excel中一行=数据库中一行=一个java自定义类对象=hashmap=json=xml
		List<LinkedHashMap<String, Object>> recordsList = null;
		try {
			Connection conn = getConnection();
			// 3:准备sql语句
			// String sql = "select * from recipe;";
			// 4:陈述对象
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				// Object paramObj = params[i];
				pstmt.setObject(i + 1, params[i]);
			}
			// 5:语句执行:得到结果集
			ResultSet rs = pstmt.executeQuery();
			recordsList = new ArrayList<LinkedHashMap<String, Object>>();
			// 获得结果集的元数据
			ResultSetMetaData metaData = rs.getMetaData();
			// 列数
			int columCount = metaData.getColumnCount();

			while (rs.next()) {
				// 每个记录封装到一个map
				LinkedHashMap<String, Object> recordMap = new LinkedHashMap<>();
				// recordMap.put(列名，对应的值）；
				// 字段数不确定，是不是有方法能够拿到字段数；
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
			// 6:资源的关闭
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
