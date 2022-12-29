package com.csi.dao;

import java.util.List;

import com.csi.model.Empolyee;

public interface EmployeeDao {

	public void saveData(Empolyee employee);
	
	public List<Empolyee>getAllData();
	public void updatedata(int empId, Empolyee employee);
	public void deleteData(int empId) ;
	
	
}
