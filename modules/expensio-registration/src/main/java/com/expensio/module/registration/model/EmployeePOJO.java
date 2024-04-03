package com.expensio.module.registration.model;

import java.util.Date;

public class EmployeePOJO {
	long employeeId;
	long userId;
	long employeeUserId;
	long companyId;
	String userName;
	String department;
	String designation;
	Date createDate;
	Date modifiedDate;
	boolean status;
	public EmployeePOJO(long employeeId, long userId, long employeeUserId, long companyId, String userName,
			String department, String designation, Date createDate, Date modifiedDate, boolean status) {
		super();
		this.employeeId = employeeId;
		this.userId = userId;
		this.employeeUserId = employeeUserId;
		this.companyId = companyId;
		this.userName = userName;
		this.department = department;
		this.designation = designation;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.status = status;
	}
	public EmployeePOJO(long employeeId, long userId, long employeeUserId, long companyId, String userName,
			String department, String designation, Date createDate, Date modifiedDate) {
		super();
		this.employeeId = employeeId;
		this.userId = userId;
		this.employeeUserId = employeeUserId;
		this.companyId = companyId;
		this.userName = userName;
		this.department = department;
		this.designation = designation;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getEmployeeUserId() {
		return employeeUserId;
	}
	public void setEmployeeUserId(long employeeUserId) {
		this.employeeUserId = employeeUserId;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	

}
