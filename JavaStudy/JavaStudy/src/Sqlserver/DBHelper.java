package Sqlserver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.microsoft.sqlserver.jdbc.*;;

public class DBHelper {
	Connection connection = null;

	private Connection getConnection(String sUser, String sPwd) {
		try {
			String sDriveName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String sDbUrl = "jdbc:sqlserver://114.115.214.130;databaseName=JavaStudy";
			Class.forName(sDriveName);
			connection = DriverManager.getConnection(sDbUrl, sUser, sPwd);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}

	public boolean TestConn(String sUser, String sPwd) {
		if (getConnection(sUser, sPwd) == null) {
			connection = null;
			return false;
		}
		return true;
	}

	private void CloseConn() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				connection = null;
			}
		}
	}

	public ResultSet GetResultSet(String sql, Object[] params) {
		getConnection("sa", "19900629");
		ResultSet resultSet = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					preparedStatement.setObject(i + 1, params[i]);
				}
			}
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
			CloseConn();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			CloseConn();
		}
		return resultSet;
	}

	public int update(String sql, Object[] params) {
		getConnection("sa", "19900629");
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			if (params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					preparedStatement.setInt(i + 1, Integer.parseInt(params[i].toString()));
				}
			}
			int count = preparedStatement.execute() == true ? 1 : 0;
			CloseConn();
			return count;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			CloseConn();
			return -1;
			// TODO: handle exception
		}
	}

	public List<Brand> getList() {
		List<Brand> brands = new ArrayList<Brand>();
		try {
			getConnection("sa", "19900629");
			String sql="SELECT ID,name FROM t_brand";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Brand brand = new Brand();
				brand.ID = resultSet.getInt("ID");
				brand.name = resultSet.getString("name");
				brands.add(brand);
			}
			return brands;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public void GetDataByProcedure() {
		try {
			getConnection("sa", "19900629");
			CallableStatement callableStatement = connection.prepareCall("{call Get_Data(?)}");
			callableStatement.setInt(1, 1);
			ResultSet resultSet = callableStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
