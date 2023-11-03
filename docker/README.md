# Getting started

## Setup
docker for windows/mac

## Start Sonar

- start docker
- execute command
   ```
   ./sonar.sh
   ```
- then you can login to web dashboard available under http://localhost:9000 with admin/admin credentials (Need to change credentials to yours)
- configure the following enw properties

   ```
   export SONAR_USERNAME=your_username
   export SONAR_PASSWORD=your_password
   export SONAR_HOST=http://localhost:9000
   ```
  
-  or use token more secure 

```
  export SONAR_USERNAME=your_token
 ```


- execute command to run test and to see the result

   ```
   ./mvnw clean test -Dmaven.test.failure.ignore=true sonar:sonar
   ```



