## Problem statement 
# Create a base class called Person with the following attributes:

id (int)
name (String)
age (int)
# Implement a parameterized constructor to initialize these attributes and provide getters and setters.

# Create a derived class called Student that inherits from the Person class. Add the following additional attributes:

studentId (int)
grade (char)
# Implement a parameterized constructor that takes the attributes of both the base class and the derived class. Include getters and setters for the new attributes.

# Create another derived class called Professor that also inherits from the Person class. Add the following additional attributes:

employeeId (int)
department (String)
# Implement a parameterized constructor that takes the attributes of both the base class and the derived class. Include getters and setters for the new attributes.

Encapsulation:
Ensure that all the attributes in the Person, Student, and Professor classes are private and provide public getter and setter methods to access and modify these attributes.
Additional Requirements:
# Implement a method in the Person class called displayDetails() that prints the details of the person (id, name, age).

Override the displayDetails() method in both the Student and Professor classes to include their specific details (studentId and grade for Student, employeeId and department for Professor).

In the main method of another class (e.g., UniversityDemo), create instances of the Student and Professor classes, set their attributes using the setter methods, and display their details using the displayDetails() method.