# Habit Tracker

There are two enpoints; **_/activities_** and **_/habits_**. A habit can be created by sending POST request with habbit name in the body:

`curl -X POST http://localhost:8080/habits -H "Content-Type: application/json" -d '{"name": "Running"}'`

After a habit created, now we can create an activity:

`curl -X POST http://localhost:8080/activities -H "Content-Type: application/json" -d '{"habitId": "1"}'`

## H2 Console
Data is stored in in-cache database -H2- Data that posted can be seen from **_/h2-console_**
H2 database login credentials can be changed from _application.properties_. You can login with existing credentials:
  
- `Username: sa`
- `Password: password`

