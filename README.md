# TextProcessingTool

[Loom video link here](https://www.loom.com/share/3e14232fd24a4cb5981f7f92e4b4df8c?sid=f07c67ec-edb2-4d92-88cf-df367a4726fd)

## Overview

The Text Processing Tool is designed to provide a comprehensive solution for processing text data using regular expressions (regex) and managing collections of data. 
## Project Structure

- `datamanagement`: Contains the classes for data management (`DataEntry`, `DataManager`).
- `regex`: Holds the utility class for regex operations (`RegexUtility`).
- `ui`: Contains the main application entry point and the controller for the user interface (`TextProcessingApp`, `TextProcessingAppController`).

## Features

1. **Regular Expressions (Regex) Module:**
    - Functionality to search, match, and replace text using regular expressions.
    - Support for sets, ranges, alternations, shorthands, and quantifiers in regex patterns.
    - A user-friendly interface for inputting regex patterns and text data.

2. **Text Processing Module:**
    - Methods to search for patterns and replace characters in text data using regex.
    - Utilization of Java's `Pattern` and `Matcher` classes for regex operations.
    - Display of match results and replaced text to the user.

3. **Data Management Module:**
    - Utilization of Java collections (e.g., ArrayList, Set, Map) for managing collections of data.
    - Functionality to create, update, and delete entries in collections.
    - Implementation of `hashCode` and `equals` methods for custom data objects to ensure proper collection operations.

4. **User Interface:**
    - Development of a user interface using JavaFX for interacting with the tool.
    - Options for inputting text data, regex patterns, and performing operations.
    - Display of results of regex operations and collection manipulations to the user.

## Setup Instructions

### Prerequisites

- Java 21
- Maven (for managing dependencies and building the project)
- IDE (e.g., IntelliJ IDEA, Eclipse)
- JavaFX SDK

### Step-by-Step Guide

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Ivan-Muhumuza/TextProcessingTool
   cd TextProcessingTool
   ```

2. **Build the Project**

   Ensure you have Maven installed, then run the following command to build the project and download dependencies:

   ```bash
   mvn clean install
   ```

3. **Run the Application**

   Use your IDE to run the `TextProcessingApp.java` file located in the `ui` package.

4. **Running Tests**

   To run the unit tests, execute the following command:

   ```bash
   mvn test
   ```

## Usage

### User Interface

The application uses JavaFX to provide a user-friendly interface. The main features include:

- **Regex Operations**: Input regex patterns and text data to search, match, and replace text.
- **Data Management**: Create, update, and delete entries in data collections.
- **Results Display**: View the results of regex operations and data manipulations.

### Core Functionalities

- **Regex Utility (`RegexUtility.java`)**:
    - `matchPattern(String text, String regex)`: Checks if the regex pattern matches any part of the text.
    - `replaceText(String text, String regex, String replacement)`: Replaces occurrences of the regex pattern in the text with the replacement string.

- **Data Management (`DataEntry`, `DataManager`)**:
    - `DataEntry`: Represents a data entry with appropriate attributes.
    - `DataManager`: Manages a collection of `DataEntry` objects, providing methods to add, update, and delete entries.

- **User Interface (`TextProcessingApp`, `TextProcessingAppController`)**:
    - `TextProcessingApp`: Entry point of the application.
    - `TextProcessingAppController`: Manages user interactions, including inputting text and regex patterns, performing operations, and displaying results.