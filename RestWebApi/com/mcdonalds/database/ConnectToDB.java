package com.mcdonalds.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mcdonalds.rest.entities.Menu;

public class ConnectToDB {

	private static String USERNAME = "root";
	private static String PASSWORD = "Happy4sure";
	private static String CONSTRING = "jdbc:mysql://localhost:3306/";
	private static String DATABASE = "macdonalds_db";
	private static Connection connection;

	public static Connection getConnectionToDB() {
		try {
			String url = CONSTRING + DATABASE;
			Properties properties = new Properties();
			properties.setProperty("useSSL", "false");
			connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
			if (connection != null) {
				System.out.println("Connected");
			} else {
				System.out.println("Connection faild");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong before establishing the connection");
		}
		return connection;

	}

	public List<Menu> getMenus() {
		connection=getConnectionToDB();
		String query = "SELECT * FROM macdonalds_db.menus;";
		List<Menu> menuList = new ArrayList<>();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				menuList.add(new Menu(id, name));
			}
			return menuList;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return menuList;
	}
/*
	public User getUser(int id) {
		connection = getConnectionToDB();
		String query = "SELECT * FROM users_db.user_info where id=?;";
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet userFound = statement.executeQuery();
			if (userFound.next()) {
				String name = userFound.getString(2);
				String profession = userFound.getString(3);
				return new User(id, name, profession);

			} else {
				System.out.println("no user found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void registerUser(int id, String name, String profession) {
		String query = "Insert into users_db.user_info values(?,?,?);";
		connection = getConnectionToDB();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setString(3, profession);
			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteUser(int id) {
		connection = getConnectionToDB();
		String query = "DELETE FROM users_db.user_info WHERE id=?;";

		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateUser(int id, String name, String profession) {

		String query = "UPDATE users_db.user_info SET name = ?,profession=? WHERE id=?;";
		connection = getConnectionToDB();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, name);
			statement.setString(2, profession);
			statement.setInt(3, id);
			statement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}*/

}
