# Java_beginner
This repository contains some elementary projects that I created during my Java programming course: they are used to acquire minimal experience with the basic topics of object-oriented programming.The projects are written in Italian, in the future I will add an English version.
These projects aim to define, as described in the respective PDF, all the necessary classes to build and manage some situation and sometimes ends with the development of a small application that, through the terminal, allows the management of one's study plan (adding exams, including external ones, credit points, grades, etc.).
## Compiling and Running the Project
To compile and run this project, you can use the javac and java commands from the terminal.

## Compiling the Java Files
First, you need to compile the Java files using the javac command. Open your terminal, navigate to the directory containing the Java files, and run the following command:

javac *.java

This command compiles all .java files in the current directory. If you want to compile only specific files (such as the ones for the main application), you can run:
(Supposing exist a file written in java named AppPianodiStudi.java)
javac AppPianodiStudi.java

This will compile the Java files related to the project, including all classes that are involved (such as for instance Esame, Voto, PianoDiStudi, etc.). The result will be the creation of .class files for each class in the project.

Running the Application
Once the Java files are compiled, you can run the main application using the java command. If the entry point of your project is the class AppPianoDiStudi, run the following command:

java AppPianodiStudi

This will execute the compiled Java program and allow you to interact with the study plan management system via the terminal.
## The project i defined:…


## Understanding the Compilation Process (a quick reminder)
In Java, the compilation process takes the source code written in .java files and converts it into bytecode, stored in .class files. These .class files are then executed by the Java Virtual Machine (JVM) when you run the application using the java command. The classes that are compiled first (e.g., Esercizio, AppPianoDiStudi) will also automatically compile any other related classes they depend on (e.g., Esame, Voto, etc.), ensuring that the entire project is built correctly.

