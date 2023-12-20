create table department(d_id int primary key, d_name varchar(50));

create table employee(e_id int primary key,e_name varchar(50),salary decimal(10,2),d_id int,foreign key(d_id) references department(d_id));

Print employee_id, employee_name and department_name
select e.e_id,e.e_name,d.d_name from employee e, department d where e.d_id=d.d_id;


Write a Query that prints all the employees and their salaries in descending order of their salary
select * from employee order by salary desc;


Write a Query that prints the average salary of employees in each department with the department name
select department.d_id, department.d_name, avg(employee.salary) as avg_salary from department join employee on department.d_id = employee.d_id group by department.d_id, department.d_name;
