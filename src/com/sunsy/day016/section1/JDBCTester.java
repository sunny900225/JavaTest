package com.sunsy.day016.section1;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

public class JDBCTester {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//JDBCUtils.insert("¹ø°üÈâ", "ÓÍÕ¨", 200);
		//JDBCTest.delete("¹ø°üÈâ");
		//JDBCTest.query(1);
		//insert();
		//delete();
		//update();
		query();
	}

	private static void insert() throws ClassNotFoundException, SQLException {
		String sql = "insert into recipe(dish_name,dish_details,calories) values (?,?,?);";
		JDBCUtil.excute(sql,"¹ø°üÈâ", "ÓÍÕ¨", 200);
	}
	private static void delete() throws ClassNotFoundException, SQLException {
		String sql = "delete from recipe where dish_name=?;";
		JDBCUtil.excute(sql,"¹ø°üÈâ");
	}
	private static void update() throws ClassNotFoundException, SQLException {
		String sql = "update recipe set dish_name = ? where id = ?;";
		JDBCUtil.excute(sql,"¹ø°üÈâ",6);
	}
	private static void query() throws ClassNotFoundException, SQLException {
		String sql = "select * from recipe;";
		List<LinkedHashMap<String, Object>> rsList = JDBCUtil.query(sql);
		for (LinkedHashMap<String, Object> recipeMap : rsList) {
			System.out.println(recipeMap);
		}
	}
}
