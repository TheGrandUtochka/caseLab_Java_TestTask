SELECT surname
FROM (
    SELECT surname, experience, RANK() OVER (ORDER BY experience DESC) AS exp_rank
    FROM employees
) AS emp_ranked
WHERE exp_rank = 2;
