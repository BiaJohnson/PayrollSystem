# User and Employee Management System
Overview
This Java-based User and Employee Management System is designed to facilitate user and employee management through a user-friendly interface. Developed in NetBeans, the application connects to a database for storing and managing user and employee information, enabling efficient handling of various administrative tasks.

## Features

- Login Interface: login that pulls user credentials from a database.
- User Management Dashboard: Register new users by providing username, password, and role.
- Manage existing users: Edit or delete user accounts with all changes saved in the database.
- Employee Management Dashboard: Register employees with the following fields:
  - Name
  - Department
  - Salary
  - Loan
  - Deduction
  - Deduction Count
  - Loan Balance
  - Net Salary
- Manage employees: Update or delete employee records from the database.
- Salary Report: Generate a PDF salary report for employee payroll management.
- Logoff: Securely log out from the application.
  
## Technologies Used
- Java
- NetBeans IDE
- SQLite (or your chosen database)
- Java PDF library (iText) for generating PDF reports
  
## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- NetBeans IDE for running and modifying the code.
- SQLite-JDBC - https://www.java2s.com/Code/Jar/s/Downloadsqlitejdbc372jar.htm

### Installation

1. Clone the repository:

   ``bash
    git clone https://github.com/BiaJohnson/PayrollSystem
    cd PayrollSystem
  ``

2. Open the project in NetBeans.

3. Open Database file: Payroll.sqlite under database folder. To see the data, go to "Browse Data" and choose the table: Employees or Users
   
## Usage

- Launch the application.
- Login
- Navigate through the dashboard to manage users and employees.
- Use the options provided to register, edit/update, or delete records.
- Generate PDF salary reports as needed. The PDF path is ./Report/
- Log off to exit the application securely.
