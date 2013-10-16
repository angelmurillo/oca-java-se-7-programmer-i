Exercise 1-3: Compiling and Interpreting Packaged Software

When you compile and run packaged software from an IDE, the execution process can be as easy as clicking a run icon, as the IDE will maintain the classpath for you and will also let you know if anything is out of sorts. When you try to compile and interpret the code yourself from the command line, you will need to know exactly how to path your files. Consider our sample application that is placed in the com.ocajexam.tutorial package (that is, the com/ocajexam/tutorial directory).

package com.ocajexam.tutorial;
public class GreetingsUniverse {
  public static void main(String[] args) {
    System.out.println("Greetings, Universe!");
  }
}

This exercise will have you compiling and running the application with new classes created in a separate package.

    Compile the program:

    javac -d . GreetingsUniverse.java

    Run the program to ensure it is error-free:

    java -cp . com.ocajexam.tutorial.GreetingsUniverse

    Create three classes named Earth, Mars, and Venus and place them in the com.ocajexam.tutorial.planets package. Create constructors that will print the names of the planets to standard out. The details for the Earth class are given here as an example of what you will need to do:

    package com.ocajexam.tutorial.planets;
    public class Earth {
      public Earth {
        System.out.println("Hello from Earth!");
      }
    }

    Instantiate each class from the main program, by adding the necessary code to the GreetingsUniverse class.

    Earth e = new Earth();

    Ensure that all of the source code is in the paths src/com/ocajexam/tutorial/and src/com/ocajexam/tutorial/planets/.

    Determine the command-line arguments needed to compile the complete program. Compile the program, and debug where necessary.

    Determine the command-line arguments needed to interpret the program. Run the program.


Resolution:

compile :
javac -d . GreetingsUniverse.java planets\*.java

interpret:
java com.ocajexam.tutorial.GreetingsUniverse

Output:
Greetings, Universe!
Hello from Earth!
Hello from Venus!
Hello from Mars!
