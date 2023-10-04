Virtual Classroom Manager
Educational Initiatives Campus Drive
Coding Assessment
K.L.N College of Engineering
   Name: Vidya B P
    Department: Computer Science and Engineering(Final Year)
    Email: bpvidya04@gmail.com
    Contact: 8778791332
1. Introduction
2. Purpose
3. Object-Oriented Programming (OOP)
4. Classes
4a.Classroom
4b.Student
4c.Assignment
4d.VirtualClassroomManager
5. Classes and Objects
6. Usage
     6a.Menu Options
7. Inheritance
8. Encapsulation
9. Polymorphism
10. Abstraction
11. Sample Code Explanation
12. Author and Date

1.Introduction:
Object-Oriented Programming (OOP) is a programming paradigm that uses objects, which are instances of classes, to model and represent real-world entities and their interactions in software. Java is a popular object-oriented programming language that follows OOP principles.


2.Purpose:
The primary purpose of this program is to simulate the backend of an educational platform, allowing administrators to perform the following tasks:

* Create virtual classrooms.
* Enroll students in specific classrooms.
* Schedule assignments for classrooms.
* Track assignment submissions by students.

3.Object-Oriented Programming (OOP):
OOP is based on several key concepts:

4.Classes:
4a.Classroom 
* Represents a virtual classroom.
* Contains:
      Private name attribute to store the classroom name.
* Provides:
o Constructor to initialize the classroom with a name.
o getName() method to retrieve the classroom name.
4b.Student 
* Represents a student.
* Contains:
o Private id attribute to store the student ID.
o Private className attribute to store the name of the classroom the student is enrolled in.
* Provides:
o Constructor to initialize a student with an ID and classroom name.
o getId() method to retrieve the student's ID.
o getClassName() method to retrieve the name of the classroom the student is enrolled in.
4c.Assignment 
* Represents an assignment scheduled for a classroom.
Contains:
o Private className attribute to store the classroom name associated with the assignment.
o Private details attribute to store the assignment details.
* Provides:
o Constructor to initialize an assignment with a classroom name and details.
o getClassName() method to retrieve the associated classroom name.
o getDetails() method to retrieve assignment details.
4d.VirtualClassroomManager 
* The main class that manages the program's logic and user interactions.
Contains:
o Private classrooms attribute as a HashMap to store virtual classrooms.
o Private students attribute as a HashMap to store student data.
o Private assignments attribute as a HashMap to store assignment information.
* Provides:
o Constructor to initialize the data structures.
o addClassroom(String className) method to add a new classroom.
o addStudent(int studentId, String className) method to enroll a student.
o scheduleAssignment(String className, String assignmentDetails) method to schedule an assignment.
o submitAssignment(int studentId, String className, String assignmentDetails) method to mark an assignment as submitted by a student.

5.Classes and Objects
Class: A class is a blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of that class will have. Classes in Java are defined using the class keyword.
Example from the code:
class Classroom {
    // Class properties and methods
}
Object: An object is an instance of a class. It is a concrete realization of the class blueprint. Objects have their own state (attributes) and can perform actions (methods).
Example from the code:	
Classroom classroom = new Classroom("Math101");

6.Usage:
To use the Virtual Classroom Manager, follow these steps:
1. Run the program.
2. Choose from the menu options to perform specific actions.
3. Follow the prompts to provide necessary input data.
4. Receive feedback messages confirming the success of the actions.
6a.Menu Options 
1. Add Classroom: Create a new virtual classroom by providing a unique name.
2. Add Student: Enroll a student in a specific classroom by entering their ID and the classroom name.
3. Schedule Assignment: Schedule an assignment for a classroom by specifying the classroom name and assignment details.
4. Submit Assignment: Mark an assignment as submitted by a student. Provide the student ID, classroom name, and assignment details.
5. Exit: Quit the program.

7.Inheritance:
Inheritance: Inheritance is a mechanism in OOP that allows a class (subclass or child class) to inherit properties and behaviors from another class (superclass or parent class). It promotes code reusability.
Example from the code:
class Student {
    // Properties and methods
}

class Assignment extends Student {
    // Inherits properties and methods from Student
}	

8.Encapsulation:
Encapsulation: Encapsulation is the practice of bundling data (attributes) and methods that operate on the data into a single unit called a class. It restricts direct access to an object's internal state and enforces data protection.
Example from the code:
class Classroom {
    private String name; // Encapsulation - private attribute
    // Getter and setter methods for name
}

9.Polymorphism:
Polymorphism: Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables method overriding and dynamic method binding.
Example from the code:
class Classroom {
    // ...
    public void scheduleAssignment(String className, String assignmentDetails) {
        // ...
    }
}

class Assignment extends Student {
    // ...
    @Override
    public void scheduleAssignment(String className, String assignmentDetails) {
        // Polymorphism - method overriding
        // ...
    }
}

10.Abstraction:
Abstraction: Abstraction is the process of simplifying complex reality by modeling classes based on essential properties and behaviors while hiding unnecessary details.
Example from the code:
abstract class VirtualEntity {
    // Abstract class - represents a common abstraction
}

11.Sample Code Explanation:
The provided code for a Virtual Classroom Manager demonstrates several OOP concepts:
* Classes (Classroom, Student, Assignment) define blueprints for objects.
* Inheritance is used, where Assignment inherits properties from Student.
* Encapsulation is employed with private attributes and getter/setter methods.
* Polymorphism is shown through method overriding (scheduleAssignment).
* Abstraction is implemented with an abstract class (VirtualEntity) representing a common abstraction.
* These OOP principles make the code organized, reusable, and easier to understand and maintain.

12.Author
 Vidya B P

13.Date
04/10/2023 



























































