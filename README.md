# Cucumber + Java + Selenide Project for google search

This project is an example of using Cucumber, Java, and Selenide tools for automated testing of web applications.

## Project Structure

- **build:** this folder generate screenshots after build test
- **gitignore:** file include all temporary files and folders which generate after build tests  
- **src/test/resources:** This is where your Cucumber scenario files (`.feature` files) are stored.
- **src/test/java/steps:** Before and After steps is steps what execute before and after scenario, also class RunCucumberTest is a settings for Cucumber, and stepDef is our java methods 

## Running Tests

To run the tests, use the following command:

```bash
mvn clean test
