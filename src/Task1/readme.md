# Задача 1

В реляционной БД есть таблица сотрудников с полями: id
(уникальный идентификатор, NUMBER), surname (фамилия
сотрудника, VARCHAR), experience (опыт работы, NUMBER).
Необходимо составить SQL-запрос, который вернет фамилию
сотрудника со вторым максимальным опытом работы.

Пример:
**id**|**surname**|**experience**
-----|-----|-----
1|Иванов|10
2|Петров|12
3|Сидоров|14

Для данного случая
результатом выполнения
запроса будет "Петров".