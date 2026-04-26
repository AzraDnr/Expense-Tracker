## 🛠️ Setup

### 1. MySQL Connection Settings (Required)
Each user must enter their own local password for the project to access the database:

- Open the `src/ExpenseTracker/SqlConnection.java` file.
- Replace the `YOUR_PASSWORD` part in the line `private final String PASSWORD = "YOUR_PASSWORD";` with your own MySQL root password.
- If you don’t have a password, leave it as `""` (empty quotes).

### 2. How to Fix the "Access Denied" Error
If you get a connection error even though your password is correct, run the following command in the MySQL terminal (or Workbench) to update the authentication method:

Note: Replace YOUR_PASSWORD with your own password.

```sql
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'YOUR_PASSWORD';
FLUSH PRIVILEGES;

