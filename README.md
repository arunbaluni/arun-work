# Project Name : arun-work


# Description

This is a REST API test automation framework written in JAVA. This framework is built with the help of [Rest-Assured](http://rest-assured.io/), [TestNG](https://testng.org/doc/). The goal of this basic maven framework is to test the REST API for HTTP GET. This framework consists of 3 test cases to demo the functionality of the framework. This framework also supports the logging. 

# Design
# Key Concepts

One of the goal while developing this project was to improve the speed of REST API test development. Logical lines of code required to create a given test was reduced with the help of abstraction of repetitive code. Further, flexibility of usage through modularity is implemented in this basic framework.


# Components and Extensibility

#helper: This consists of Resuable methods and properties files. 
1. ReusableMethods.java: Consists of resuable functions. a) Response of the REST API in JsonPath b) Function for reading environmental properties
2. env.properties: To avoid hard coded values in code, HOST URL of the REST API is stored in this property file.
3. Resources.java: This class function returns the resources path of the REST API.


## Toolset
* Programming Language - [Java](https://www.java.com/en/)
* Testing Framework - [TestNG](http://testng.org/doc/)
* Dependency Management - Maven Packages deployed on
* REST API Automation - [REST Assured](http://rest-assured.io/)
* IDE - [Eclipse](https://eclipse.org/) or [IntelliJ](https://www.jetbrains.com/idea/)

# Command Line

Maven allows for simple execution of tests as outlined below.

mvn clean compile test

# Jenkins

http://ec2-18-222-89-131.us-east-2.compute.amazonaws.com:8080/login?from=%2F 

After opening the link, login to Jenkins though valid credentials. Afterwards, run the Jenkins jobs to run the maven based REST API automation framework.

TestNG reports can be referred to understand the automated test results.


# Key Contributors:
Arun Kumar Baluni
