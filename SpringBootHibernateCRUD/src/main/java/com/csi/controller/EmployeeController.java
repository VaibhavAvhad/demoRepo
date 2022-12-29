package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Empolyee;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
	EmployeeService employeeServiceImpl;
	
    @PostMapping("/savedata")
    public String saveData(@RequestBody Empolyee empolyee) {
    	employeeServiceImpl.saveData(empolyee);
    	return"Data saved successfully";
    }
    @GetMapping("/getdata")
    public List<Empolyee>getAllData(){
    	return employeeServiceImpl.getAllData();
    }
    
    @PutMapping("/updatedata/{}empId")
    public String updateData(@PathVariable int empId, @RequestBody Empolyee employee) {
    	employeeServiceImpl.updatedata(empId, employee);
    	return "Data Updated Successfully";
    }
    
    @DeleteMapping("/deletedata/{}empId")
    public String deleteData(@PathVariable int empId) {
    	employeeServiceImpl.deleteData(empId);
    	return"Data Deleted Successfully";
    }
    
}
