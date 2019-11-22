# JavaWorkshop
>Learn about basic Java programs including methods, user input, and command line arguments

## Get Started
Download JGrasp or another Java IDE <http://spider.eng.auburn.edu/user-cgi/grasp/grasp.pl?;dl=download_jgrasp.html>   Make sure you also download the JDK <https://courses.cs.washington.edu/courses/cse14x/software/jdk.html>

## Uses
Java is a low-level programming language, often used in online applications, like Twitter, and Android apps. Java uses a RunTime environment and a Java Virtual Machine. You can use Java Plug-In to run your program on your browser. Because Java is an Object-Oriented Programming language, many graphic user interfaces are based on Java.

## Purpose
This workshop addresses math operations, printing from your program, gathering user input using Scanner, and creating java methods

## Goal
Create a java program, make a method, call a method from main, use Java Scanner

## Challenges
Create a java program with a main method.
Create field variables and a method.
The method should contain if statements based on a choose your own adventure game.
Input for the if statements should be based on Java Scanner user input.
Program should print the outcome of the choose your own adventure.


## Cheat Sheet
```java
if(false)
  System.out.println("false");
else
  System.out.println("true");
  
public static void main(String[]args)
{
  System.out.println("This is the main method, and the program executes the methods you call within it.");
}

public class ClassName{}

public static int methodName()
{
  return 1;
}

public static String methodName2(int param)
{
  return param + "";
}

import java.util.Scanner;

Scanner userInput = new Scanner(System.in);

int x = userInput.nextInt();

String b = userInput.nextLine();
```
## Resources for Further Learning
* freeCodeCamp.org
* YouTube.com: Programming with Mosh
* Java API: <https://docs.oracle.com/javase/7/docs/api/>
* <https://www.codecademy.com/learn/learn-java>
* <https://stackoverflow.com/>
