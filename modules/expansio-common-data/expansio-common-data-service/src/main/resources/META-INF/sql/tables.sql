create table expensio_Budgets (
	uuid_ VARCHAR(75) null,
	budgetId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	budgetAmount LONG,
	budgetDuration DATE null,
	budgetDescription VARCHAR(75) null,
	budgetDepartmentId LONG
);

create table expensio_Category (
	uuid_ VARCHAR(75) null,
	categoryId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryName VARCHAR(75) null
);

create table expensio_Departments (
	uuid_ VARCHAR(75) null,
	departmentId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	departmentName VARCHAR(75) null
);

create table expensio_Designations (
	uuid_ VARCHAR(75) null,
	designationId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	designationName VARCHAR(75) null,
	departmentId LONG
);

create table expensio_Employees (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	employeeUserId LONG,
	department VARCHAR(75) null,
	designation VARCHAR(75) null,
	status BOOLEAN
);

create table expensio_Expenses (
	uuid_ VARCHAR(75) null,
	expenseId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	expenseAmount LONG,
	categoryId LONG,
	subCategoryId LONG,
	employeeUserId LONG,
	docMedia VARCHAR(75) null
);

create table expensio_Loginlogs (
	uuid_ VARCHAR(75) null,
	loginLogId LONG not null primary key,
	userName VARCHAR(75) null,
	email VARCHAR(75) null,
	ipAddress VARCHAR(75) null,
	uri VARCHAR(75) null,
	host VARCHAR(75) null,
	loginDateTime DATE null
);

create table expensio_SubCategory (
	uuid_ VARCHAR(75) null,
	subCategoryId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	subCategoryName VARCHAR(75) null,
	categoryId LONG
);