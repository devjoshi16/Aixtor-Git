create table expensio_login_logs (
	uuid_ VARCHAR(75) null,
	loginLogId LONG not null primary key,
	userName VARCHAR(75) null,
	email VARCHAR(75) null,
	ipAddress VARCHAR(75) null,
	uri VARCHAR(75) null,
	host VARCHAR(75) null,
	loginDateTime DATE null
);