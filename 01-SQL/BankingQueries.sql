use banking;

SELECT p.name as "Product", p.product_type_cd as "Type" FROM product p JOIN product_type pt ON p.product_type_cd = pt.product_type_cd;

SELECT b.name, b.city, e.last_name, e.title FROM branch b JOIN employee e ON e.assigned_branch_id = b.branch_id;

SELECT e.title FROM employee e GROUP BY e.title;

SELECT e.last_name, e.title, m.last_name, m.title FROM employee e JOIN employee m ON e.superior_emp_id = m.emp_id;

SELECT p.name, a.avail_balance, i.last_name FROM account a JOIN customer c ON a.cust_id = c.cust_id JOIN product p ON p.product_cd = a.product_cd JOIN individual i ON i.cust_id = c.cust_id;

SELECT i2.last_name, at2.* FROM individual i2 JOIN customer c2 ON c2.cust_id = i2.cust_id JOIN account a ON a.cust_id = c2.cust_id JOIN acc_transaction at2 ON at2.account_id = a.account_id WHERE i2.last_name LIKE "T%";
