# Employee Directory Spring Boot App wiht Thymeleaf

Task: Design an app to track employees in a web browser.

The app shows a table of employees from the database.

Functionality allows:
- adding new employees to database
- updating employee data in the database
- deleting employees from the database

Table looks as follows:
TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

Assumption: Data in database filled (see /sql-scripts/employee-directory).
Default url for the app: http://localhost:8080/.
