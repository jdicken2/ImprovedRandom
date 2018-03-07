Julian-Dickens-CS-445-HW 2-Version 1.0 09/26/2017

Usage notes
---------------------------------------------------------------
-The two programs provided answer the two Homework problems for Homework Problems 4 and 5 for HW 2. Problem 4 creates an ImprovedRandomizer class that inherits the Randomizer class. It does everything the Randomizer class does, and adds a new method,boundaryRandom, that gives a random number between two numbers (inclusive). Problem 5 creates an ImprovedStringTokenizer class that inherits the StringTokenizer class. It does everything the StringTokenizer class does, and includes a method, arrayReturn, that returns all elements in a string seperated by a deliminator in an array.

Run
---------------------------------------------------------------
To run the Acceptance Test, type "make" in the command line.
To run the jUnit Test, type "make test" in the command line.
To clear the class files, type "make clean".

Acceptance Test: java hw2AcceptanceTest
Unit Test: java TestRunner
Installation Notes
---------------------------------------------------------------
Install:
	jdk1.8.0_144
	junit-4.12.jar
	hamcrest-core-1.3.jar	