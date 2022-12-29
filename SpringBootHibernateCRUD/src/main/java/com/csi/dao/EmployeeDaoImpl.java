package com.csi.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.csi.model.Empolyee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public void saveData(Empolyee employee) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();

	}

	@Override
	public List<Empolyee> getAllData() {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		return session.createQuery("from Employee").list();
	}

	@Override
	public void updatedata(int empId, Empolyee employee) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction()
		
		Empolyee employee2 = (Empolyee) session.get(Empolyee.class, empId);
        if (employee2.getEmpId()==empId) {
			employee2.setEmpName(employee.getEmpName());
			employee2.setEmpAddress(employee.getEmpAddress());
			employee2.setEmpContactNo(employee.getEmpContactNo());
			employee2.setEmpSalary(employee.getEmpSalary());
			employee2.setEmpDob(employee.getEmpDob());
			
			session.update(employee2);
			transaction.commit();
			
			
		} else {
System.out.println("employee record not available");
		}
	}

	@Override
	public void deleteData(int empId) {
		// TODO Auto-generated method stub

		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Empolyee employee2=(Empolyee) session.get(Empolyee.class, empId);
		session.delete(employee2);
		transaction.commit();
		
	}

}
