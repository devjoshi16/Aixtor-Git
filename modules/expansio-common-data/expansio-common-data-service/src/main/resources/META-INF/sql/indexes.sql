create index IX_88E3443C on expensio_Budgets (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_7E9BB84 on expensio_Category (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_584F04F on expensio_Departments (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_8E5DBCE2 on expensio_Designations (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_A9A7B73 on expensio_Employees (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_F4E01121 on expensio_Expenses (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_4FF3C5E2 on expensio_Loginlogs (uuid_[$COLUMN_LENGTH:75$]);

create index IX_5FF087CC on expensio_SubCategory (uuid_[$COLUMN_LENGTH:75$], companyId);