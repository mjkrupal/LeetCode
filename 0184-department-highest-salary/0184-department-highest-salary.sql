/* Write your PL/SQL query statement below */
WITH cte AS
(SELECT d.name AS Department, e.name AS Employee ,e.salary AS Salary,
MAX(e.salary) OVER(PARTITION BY d.name) AS mx_salary FROM 
Employee e JOIN Department d
ON e.departmentId = d.id
WHERE salary IS NOT NULL)
SELECT department, Employee, Salary FROM cte
WHERE Salary = mx_salary;
