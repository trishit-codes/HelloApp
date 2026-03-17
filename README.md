# HelloApp

## Overview
HelloApp is a simple Java console application that demonstrates core Java concepts through a series of use cases, starting from printing "Hello World" to more complex interactions.

## Purpose
To practice and document fundamental Java programming concepts using a structured, use-case driven approach.

## Project Structure
HelloApp/
├── src/          # Java source files
├── bin/          # Compiled binaries (excluded from tracking)
├── docs/         # Documentation and use case files
├── pom.xml       # Maven build configuration
└── README.md

## How to Run
Make sure you have Java and Maven installed.

mvn compile
mvn exec:java

To specify the main class explicitly:
mvn exec:java -Dexec.mainClass="HelloApp"