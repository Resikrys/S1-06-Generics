# SPRINT 1
## TASK 6: Generics

### LEVEL 1 - EXERCISE 1
Create a class called NoGenericMethods that stores three 
arguments of the same type, along with methods for storing 
and retrieving these objects and a constructor to 
initialize all three. Verify that the arguments can be 
placed in any position in the constructor call.

### LEVEL 1 - EXERCISE 2
Create a class called Person with the attributes first 
name, last name, and age. Then create a class called 
GenericMethods with a generic method that accepts three 
arguments of generic type. This method should only print 
the arguments it has received to the screen. In the main() 
of the main class, call the generic method with different 
types of parameters.

Example: an object of the Person class, a String, and a 
primitive type.

In this way you have verified that any type of parameter 
can be passed to it and in any order.

### LEVEL 2 - EXERCISE 1

### LEVEL 2 - EXERCISE 2

### TECHNOLOGIES
| Package                    | Version | Description                |
|----------------------------|---------|----------------------------|
| `java`                     | ^24.0.1 | Principal project language |
| `java.util`                | ^24.0.1 | Java standard library      |

### REQUIREMENTS
- Local environment: `IntelliJ or Eclipse`
- JDK 8 or superior
- Compatible file system (Windows, Linux, etc.)
###  INTELLIJ EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

### 🛠️ SCRIPTS

- Step 1: Create program's font code
- Step 2: Compile & Run the program

```bash
cd C:\Users\elyri\IdeaProjects\S1_06_Generics   # Go to root file directory
javac -d out src\s1_06_Generics\*.java   # -d out indicates that the compiled .classes will be placed in an out folder
java -cp out s1_06_Generics.Task6  # -cp out tells Java where to look for the .class
```