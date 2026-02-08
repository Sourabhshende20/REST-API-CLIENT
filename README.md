# REST API Client
*Company name*: CODTECH IT SOLUTIONS

*Name*: Shende Sourabh Gopal

*Intern ID*: CTIS3927

*Domain*: Java Programming

*Duration*: 4 Weeks

*Mentor*: Neela Santhosh Kumar 

# Project Overview
This project is a Java application that consumes a public REST API and displays the fetched data in a structured.​
The main goal is to learn how to make HTTP requests from Java, handle responses, and parse JSON data to extract relevant information.
A typical example is calling an open weather API or any other public endpoint to retrieve live or sample data and present it in a clean console output or simple UI.
The project demonstrates how back-end services communicate with external APIs in modern applications.

# Features
Send HTTP GET requests to a public REST API endpoint using Java libraries such as HttpURLConnection or java.net.http.HttpClient (for newer JDKs).
​
Receive and handle JSON responses, including status codes and error messages.

Parse JSON content using a JSON library (e.g., org.json, Gson, or Jackson) to extract fields like temperature, humidity, description, or any domain-specific values.

Display the parsed data in a structured output format (well-aligned console output or formatted text).

Basic error handling for invalid URLs, network issues, or unexpected API responses.

# Tools and Technologies Used
Programming language: Java.

HTTP/JSON Libraries (example options):

java.net.http.HttpClient (JDK 11+), or

HttpURLConnection (for compatibility with older JDKs).

JSON parser library such as Gson or Jackson for converting JSON strings to Java objects.

# Editor/IDE: 
IntelliJ IDEA for coding, dependency management, and execution.

Build system (optional): Maven or Gradle if external libraries are used.

# Project Structure (Example)
src/

Main.java – Entry point that triggers API calls and displays results.

ApiClient.java – Contains methods for building requests and sending them to the REST API.

models/ – Java classes representing response objects (e.g., WeatherData).

utils/ – Helper methods for formatting and error handling.

# How to Run
Clone the repository and open it in IntelliJ IDEA.

Ensure JDK and any JSON libraries are properly configured (via Maven/Gradle or manual JAR addition).

Update the API endpoint and key (if required) in configuration or constants.

Run the Main class and observe the structured output printed in the console.

# Real-World Applications
Integrating weather, news, stock, or any third-party data into desktop or server-side Java applications.
​
Building microservices that consume external APIs as part of a larger distributed system.

Creating dashboards or monitoring tools that pull data from multiple endpoints and aggregate them.

Learning the fundamentals of REST communication, which is essential for back-end, full-stack, and Android development.
