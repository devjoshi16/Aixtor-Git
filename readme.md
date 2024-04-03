# Project - Expensio

Expensio is a company-level expense management portal.

## Project Modules:

1. Registration
2. Login Module
3. Category/Subcategory Module
4. Budgeting
5. Expense Management

## Tables:

# Entity Definitions from service.xml

## login_logs Entity

| Column Name    | Type   | Primary Key | Description                 |
|----------------|--------|-------------|-----------------------------|
| loginLogId     | long   | true        | Unique identifier for login logs. |
| userName       | String |             | Username of the user.       |
| email          | String |             | Email address of the user.  |
| ipAddress      | String |             | IP address of the user.     |
| uri            | String |             | URI accessed during login.  |
| host           | String |             | Hostname of the user's system. |
| loginDateTime  | Date   |             | Date and time of the login event. |

## Employees Entity

| Column Name     | Type    | Primary Key | Description                 |
|-----------------|---------|-------------|-----------------------------|
| employeeId      | long    | true        | Unique identifier for employees. |
| companyId       | long    |             | ID of the company.          |
| userId          | long    |             | ID of the user.             |
| userName        | String  |             | Username of the employee.   |
| createDate      | Date    |             | Date of employee creation.  |
| modifiedDate    | Date    |             | Date of last modification.  |
| employeeUserId  | Long    |             | User ID of the employee.    |
| department      | String  |             | Department of the employee. |
| designation     | String  |             | Designation of the employee.|
| status          | Boolean |             | Status of the employee.     |

## Category Entity

| Column Name   | Type   | Primary Key | Description                 |
|---------------|--------|-------------|-----------------------------|
| categoryId    | long   | true        | Unique identifier for categories. |
| companyId     | long   |             | ID of the company.          |
| userId        | long   |             | ID of the user.             |
| userName      | String |             | Username of the user.       |
| createDate    | Date   |             | Date of category creation.  |
| modifiedDate  | Date   |             | Date of last modification.  |
| categoryName  | String |             | Name of the category.       |

## SubCategory Entity

| Column Name      | Type   | Primary Key | Description                 |
|------------------|--------|-------------|-----------------------------|
| subCategoryId    | long   | true        | Unique identifier for subcategories. |
| companyId        | long   |             | ID of the company.          |
| userId           | long   |             | ID of the user.             |
| userName         | String |             | Username of the user.       |
| createDate       | Date   |             | Date of subcategory creation. |
| modifiedDate     | Date   |             | Date of last modification. |
| subCategoryName  | String |             | Name of the subcategory.   |
| categoryId       | Long   |             | ID of the associated category. |

## Expenses Entity

| Column Name     | Type   | Primary Key | Description                 |
|-----------------|--------|-------------|-----------------------------|
| expenseId       | long   | true        | Unique identifier for expenses. |
| companyId       | long   |             | ID of the company.          |
| userId          | long   |             | ID of the user.             |
| userName        | String |             | Username of the user.       |
| createDate      | Date   |             | Date of expense creation.   |
| modifiedDate    | Date   |             | Date of last modification. |
| expenseAmount   | Long   |             | Amount of the expense.      |
| categoryId      | Long   |             | ID of the associated category. |
| subCategoryId   | Long   |             | ID of the associated subcategory. |
| employeeUserId  | Long   |             | User ID of the employee.    |
| DocMedia        | String |             | Media attached to the expense. |

## Budgets Entity

| Column Name        | Type   | Primary Key | Description                 |
|--------------------|--------|-------------|-----------------------------|
| budgetId           | long   | true        | Unique identifier for budgets. |
| companyId          | long   |             | ID of the company.          |
| userId             | long   |             | ID of the user.             |
| userName           | String |             | Username of the user.       |
| createDate         | Date   |             | Date of budget creation.    |
| modifiedDate       | Date   |             | Date of last modification.  |
| budgetAmount       | Long   |             | Amount of the budget.       |
| budgetDuration     | Date   |             | Duration of the budget.     |
| budgetDescription  | Long   |             | Description of the budget.  |
| budgetDepartment   | Long   |             | ID of the associated department. |

## Liferay Modules:

1. Registration: MVC
2. Login: MVC
3. Add/View Expense: MVC
4. Category/Subcategory: MVC
5. Budgeting: MVC
6. Overall Service Builder: service-builder (DONE)
