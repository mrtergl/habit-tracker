# Habit Tracker


Dockerized simple habit tracker service. GitHub actions used for making a package after successful merge to master branch. Package can be pulled via:

`docker pull ghcr.io/mrtergl/habit-tracker:master`


It can be run as `docker run -p 8080:8080 ghcr.io/mrtergl/habit-tracker:master` after the image successfuly pulled

---

There are two enpoints; **_/activities_** and **_/habits_**. A habit can be created by sending POST request with habbit name in the body:

`curl -X POST http://localhost:8080/habits -H "Content-Type: application/json" -d '{"name": "Running"}'`

After a habit created, now we can create an activity:

`curl -X POST http://localhost:8080/activities -H "Content-Type: application/json" -d '{"habitId": "1"}'`

## H2 Console

Data is stored in in-cache database -H2-. It can be seen from **_/h2-console_**
H2 database login credentials can be changed from _application.properties_. You can login with existing credentials:
  
- `Username: sa`
- `Password: password`

