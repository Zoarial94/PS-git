use classicmodels;

SELECT c.customerName as "Customer Name", CONCAT(e.firstName, " ", e.lastName) as "Sales Rep" FROM customers c JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber ORDER BY 1 ASC;

SELECT p.productName as "Product Name", SUM(o.quantityOrdered) as "Total # Ordered", p.buyPrice * SUM(o.quantityOrdered) as "Total Sale" FROM products p JOIN orderdetails o ON p.productCode = o.productCode GROUP BY p.productCode ORDER BY 3 DESC; 

SELECT o.status as "Order Status", COUNT(*) as "# Orders" FROM orders o GROUP BY o.status ORDER BY o.status ASC;

SELECT p2.productLine as "Product Line", SUM(o.quantityOrdered) as "# Sold" FROM products p JOIN orderdetails o ON p.productCode = o.productCode 
JOIN productlines p2 ON p2.productLine = p.productLine 
GROUP BY 1;

SELECT CONCAT(e.lastName, ", ", e.firstName) as "Sales Rep", COUNT(*) as "# Orders", COALESCE(SUM(o2.priceEach * o2.quantityOrdered), 0) as "Total Sales" FROM employees e LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber 
LEFT JOIN orders o ON o.customerNumber = c.customerNumber 
LEFT JOIN orderdetails o2 ON o.orderNumber = o2.orderNumber
WHERE e.jobTitle = "Sales Rep"
GROUP BY e.employeeNumber
ORDER BY 3 DESC;

SELECT DATE_FORMAT(p2.paymentDate, "%M") as "Month", DATE_FORMAT(p2.paymentDate, "%Y") as "Year", FORMAT(p2.amount, 2) as "Payments Recieved" FROM payments p2 
GROUP BY 1, 2 ORDER BY 2 ASC, 1 ASC;

