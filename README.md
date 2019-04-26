# Snap
A Java implementation of the card game "Snap", played by two computer-controlled players.

## Contents

src/main: contains the main source files.

src/test: contains unit tests.

## Compiling and running

Snap can be compiled, tested and run via [maven](https://maven.apache.org/) (all the given commands should be done in a command-line interface in the project root folder unless stated otherwise):

NOTE: maven will install required dependencies the first time the commands are run

1. Run ```mvn clean compile```. This will create the class files.
2. Run ```mvn exec:java``` to run the program.

If you wish to create an executable jar file instead:

1. Run ```mvn clean package```. This will create a jar file called "Snap-1.0.0.jar" in the (project root)/target folder and run the unit tests.
2. Navigate to the folder containing the jar file (```cd target``` if you didn't move the file).
3. Run ```java -jar Snap-1.0.0.jar``` to run the program.

If you wish to only run the unit tests, run ```mvn test```
