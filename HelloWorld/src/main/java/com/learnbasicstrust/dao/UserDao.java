/**
 * Copyright(C) 2018 MTA
 * UserDao.java Mar 31, 2020  HoangDinhThi
 */
package com.learnbasicstrust.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learnbasicstrust.model.User;
import com.learnbasicstrust.utils.JDBCConnection;
import com.mysql.cj.jdbc.PreparedStatement;

/**
 * @author HoangDinhThi
 *	
 */
public class UserDao {
	public User getUserById(int id) {
		User userInfor = new User();
		String sql = "SELECT * FROM tbl_user WHERE user_id = ?";
		Connection connection = JDBCConnection.getJDBCConnection();
		try {
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			userInfor.setLoginName(resultSet.getString("login_name"));
			userInfor.setFullName(resultSet.getString("full_name"));
			userInfor.setFullNameKana(resultSet.getString("full_name_kana"));
			userInfor.setEmail(resultSet.getString("email"));
			userInfor.setTel(resultSet.getString("tel"));
			userInfor.setBirthday(resultSet.getDate("birthday"));
			userInfor.setGroupId(resultSet.getInt("group_id"));
			userInfor.setRole(resultSet.getInt("role"));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfor;
	}
}
