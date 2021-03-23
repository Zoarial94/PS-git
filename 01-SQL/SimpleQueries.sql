use classicmodels;

SELECT productName as "Name", productLine as "Product Line", buyPrice as "Buy Price" FROM products p ORDER BY buyPrice DESC;

SELECT contactFirstName as "First Name", contactLastName as "Last Name", city as "City" FROM customers c ORDER BY contactLastName ASC;

SELECT status FROM orders GROUP BY status ORDER BY status;

SELECT * FROM payments p WHERE paymentDate >= "2005-01-01" ORDER BY paymentDate ASC;

SELECT lastName, firstName, email, jobTitle FROM employees e2 JOIN offices o2 on e2.officeCode = o2.officeCode
WHERE o2.city = "San Francisco" ORDER BY lastName;

SELECT productName, productLine, productScale, productVendor FROM products p WHERE productLine in ("Classic Cars", "Vintage Cars") ORDER BY productLine DESC, productName ASC; 


