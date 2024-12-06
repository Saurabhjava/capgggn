package com.cg.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;
import com.cg.config.MyConnection;

public class EmployeeDao implements IEmployeeDao {
	Connection con=MyConnection.getConnection();
	@Override
	public List<Employee> getAll() {
		List<Employee> employees=new ArrayList<Employee>();
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from employee");
			while(rs.next()) {
				Employee emp=
						new Employee(rs.getInt(1), rs.getString(2),rs.getDate(3).toLocalDate(), rs.getString(6), rs.getLong(4), rs.getDouble(5));
				employees.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees;
	}

	@Override
	public Employee findEmployee(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createEmployee(Employee e) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			ps.setInt(1, e.getEid());
			ps.setString(2, e.getName());
			ps.setDate(3, Date.valueOf(e.getDob()));
			ps.setLong(4, e.getPhone());
			ps.setDouble(5, e.getSalary());
			ps.setString(6, e.getEmail());
			
			int rows=ps.executeUpdate();
			if(rows>0)
				System.out.println("Employee Created..");
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

}
