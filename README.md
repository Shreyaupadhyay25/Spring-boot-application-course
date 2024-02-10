To run your Spring Boot application locally on port 8080, you typically need to follow these steps:

Ensure Dependencies: Make sure you have all the necessary dependencies in your pom.xml or build.gradle file.

Build the Application: You can use Maven or Gradle to build your application. If you're using Maven, you can run:

''mvn clean install''

Run the Application: Once the build is successful, you can run your Spring Boot application. You can do this from your IDE or using the command line. If you're using Maven, you can run:
mvn spring-boot:run

Access the Application: Once your application is running, you can access it in your web browser or using a tool like cURL or Postman. Assuming your application is running locally, you can access endpoints 
http://localhost:8080/course/create,
http://localhost:8080/course/update/{id},
and http://localhost:8080/course/get/{id}.

Test the Endpoints: You can test your endpoints using tools like cURL, Postman, or by simply visiting the URLs in your browser.
