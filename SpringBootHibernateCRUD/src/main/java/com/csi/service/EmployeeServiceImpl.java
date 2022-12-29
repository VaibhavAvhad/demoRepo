package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Empolyee;

@Service
public class EmployeeServiceImpl implements EmployeeDao{

	@Autowired
	EmployeeDao employeeDaoimplDao;
	
	@Override
	public void saveData(Empolyee employee) {
		// TODO Auto-generated method stub
		employeeDaoimplDao.saveData(employee);
	}

	@Override
	public List<Empolyee> getAllData() {
		// TODO Auto-generated method stub
		return employeeDaoimplDao.getAllData();
	}

	@Override
	public void updatedata(int empId, Empolyee employee) {
		// TODO Auto-generated method stub
		employeeDaoimplDao.updatedata(empId, employee);
	}

	@Override
	public void deleteData(int empId) {
		// TODO Auto-generated method stub
		employeeDaoimplDao.deleteData(empId);
	}

}
