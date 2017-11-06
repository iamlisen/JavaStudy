package Sqlserver;

import java.util.List;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBHelper dbHelper = new DBHelper();
		if (dbHelper.TestConn("sa", "19900629")) {
			System.out.println("数据库连接成功");
			/*获取
			String sql = "SELECT * FROM t_brand WHERE ID=?";
			Object[] params = new Object[1];
			params[0] = 1;
			ResultSet resultSet = dbHelper.GetResultSet(sql, params);
			System.out.println(resultSet.toString());
			*/
			/*
			String sql="UPDATE t_brand SET name='飘柔修改2' where ID=?";
			Object[] params = new Object[1];
			params[0]="1";ul
			int count = dbHelper.update(sql, params);
			System.out.println(count);
			*/
			List<Brand> brands = dbHelper.getList();
			for(Brand brand:brands) {
				System.out.println(brand.name);
			}
		} else {
			System.out.println("数据库连接失败");
		}
	}

}
