# Project - Expensio

Expensio is a company-level expense management portal.

## Project Modules:

1. Registration
2. Login Module
3. Category/Subcategory Module
4. Budgeting
5. Expense Management

## Tables:

### 1. Employees

| Field       | Description          |
| ----------- | -------------------- |
| employeeId  | Employee ID          |
| audit       | Audit (themeDisplay) |
| userId      | User ID              |
| department  | Department           |
| designation | Designation          |
| status      | Status               |

### 2. Category

| Field        | Description   |
| ------------ | ------------- |
| categoryId   | Category ID   |
| audit        | Audit         |
| categoryName | Category Name |
| createDate   | Create Date   |

### 3. Subcategory

| Field           | Description      |
| --------------- | ---------------- |
| subCategoryId   | Subcategory ID   |
| audit           | Audit            |
| subCategoryName | Subcategory Name |
| createDate      | Create Date      |

### 4. Expense

| Field         | Description              |
| ------------- | ------------------------ |
| expenseId     | Expense ID               |
| expenseAmount | Expense Amount           |
| categoryId    | Category ID              |
| subCategoryId | Subcategory ID           |
| date          | Date                     |
| userId        | User ID                  |
| link          | Link (GDrive / DocMedia) |

### 5. Budgeting

| Field             | Description        |
| ----------------- | ------------------ |
| budgetId          | Budget ID          |
| budgetAmount      | Budget Amount      |
| budgetDuration    | Budget Duration    |
| budgetDescription | Budget Description |
| budgetDepartment  | Budget Department  |

## Liferay Modules:

1. Registration: MVC
2. Login: MVC
3. Add/View Expense: MVC
4. Category/Subcategory: MVC
5. Budgeting: MVC
6. Overall Service Builder: service-builder (DONE)
