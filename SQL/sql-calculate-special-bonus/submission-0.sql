SELECT employee_id, salary AS bonus
FROM employees
WHERE employee_id % 2 != 0 
  AND name LIKE 'M%';