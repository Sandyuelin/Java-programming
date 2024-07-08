# Java-programming


## Building blocks for programming
- any program you might want to write
- objects, methods, inheritance[^1],encapsulation[^2],polymorphism[^3]
- functions and modules
- graphics, sound, and image i/o
- arrays
- conditionals and loops
- math text i/o
- primitive data types and assignment statements
<br>

***explanations:** 1. creating new classes in existing class*
*2. integrate data and the code that acts upon them as a single unit, other classes cannot access to it*
*3. greek words many forms, the ability of objects take on many forms/ different objects respond to the same methond call in multiple ways*
### Manifestation
- Just start
- Work hard to learn code
- Concepts and topics build on one another so take your required classes as fast as possible, and back to back
- Brakes will break you
- Work smarter and efficiently
- Master the basics, dont move forward unless you understand something fully, this is always the case in AMCS
- Things worth having dont come easily
- Always come to your own conclusion, ppl said suck things often which disturbs you
- You can solve any problem w/ enough time and effort
- Doing is the best way to learn coding
- Train your ability to translate thoughts into code
### interesting spots:
- println() means start a new line but print will not add a new row
- sum += i means sum = sum + i
- t *= (x/i) means t = t *(x/i) which is used in Taylor expansion
### data type

- data type: a set of values and a set of operations on those values
### built-in data types in Java

- string: for **input and output** * Java like put things into string
- int: integers, for math calculations
- double: with floating points, for science and math apps
- boolean: true or false, for decision-making in program

### convert
- Integer.parseInt()
- toString()

### control flow
- the *sequance* of statements that are actually executed in a program
- <span style="color:"> conditionals and loops </span>enable us to choreograph control flow

### if statement 
<br> 
execute certain statements depending on the values of variables

- evaluate a **boolean expression**
- if true, execute a statement
- if false, use else option

### while loop
<br>
execute statements repeatedly until certain conditions are met

- boolean
- true, execute,repeat

### for loop
- evaluate an **initialization** statement; eg: int a = 0
- boolean
- true, execute,increment repeat if satisfies boolean

```java
// This demonstrates "every for loop has a while statement
// for loop is more compact obviously
public class PowerOfTwo {
    public static void main(String[] args){
        int v = 1;
        int n = Integer.parseInt(args[0]);
        for (int i = 0; 1<= n; i++){ // the difference lies in  the initialization statement
            System.out.println(i + " " + v);
            v = 2*v;
        }
    }
}
public class PowerOfTwo {
    public static void main(String[] args){
        int v = 1;
        int n = Integer.parseInt(args[0]);
        int i = 0;
        while (i<= n;){
            System.out.println(i + " "+ v);
            v = 2*v;
            i++;
        }
    }
}
```
### Nesting
- Any statement within a conditional or loop may ifself a conditional or loop
- enables complex control flow
- adds to challenge of debugging

### Debugging
- programming is primarily a process of finding and fixing mistakes
- is challenging because conditionals and loops increase the number of possible outcomes
and most programs contain numerous conditionals and loops, with nesting
- **Good news:** conditionals and loops provide structure that helps us understand our programs
<br>

**Step of Debugging a program**
- syntax errors: java compiler can help you find out, eg: terminating semicolons
- semantic and runtime
- testing
- performance: fast enough to solve your problem, increasing problem sizes to find out
<br>
 
***explanation time:** compile time is the phase in a program's lifecycle when the source code is translated into machine code before the program is run*
*run time is on the contrary, period of program actually executing*
*When initialize an array with specific values as compile time,, it dirrectly provides source code the contents of the array*


## Arrays
### Definition
- store and process (manipulate) huge amounts of data 
- my first data structure: an arrangement of data that enables efficient processing 
- def: an **indexed sequence** of values of **the same type**

### Memory representation of an array
<br>
a computer's memory is an indexed sequence of memroy locations

- each primitive type value occupies a fixed number of locations
- array values are stored in *contiguous locations*

```java
 // if copying an array w the same values
double [] a = new double [n];
 double[] b = new double [n];
 for (int i = 0; i<n; i++)
     b[i] = a[i];
 // however if just denote b = a, it indicates b and a are the same arrays
 ```

### two-dimensional arrays
- doubly-indexed sequence of values of the same type
- declare: double [][] a;
- create an array of a given length: a = new double [1000] [1000];
- refer to an array entry by index  
- refer to the number of **rows**:  a.length;
- refer to the number of **columns**:  a[i].length
- refer to row i: a[i];

```java
// vector addition / 1D array
double [] c = new double [N];
for (int i = 0; i< N;i++)
    c[i] = a[i] + b[i];

//Matrix addition / 2D array
double [] [] c = new double [N][N];
for (int i = 0; i<N; j++)
    c[i][j]= a[i][j] + b[i][j];

// vector dot product
double sum = 0.0;
for (int i = 0; i<N; i++)
    sum += a[i]*b[i];

// matrix multiplication
double [][] c = new double [N][N];
for (int i = 0; i<N; i++)
    for (int j = 0; j < N; j++)
        for (int k = 0; k < N; k++)
            c[i][j]+= a[i][k]* b[k][j];
```

```java
public class Deck {
    public static void main(String[] args) {
        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[52];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                deck[4*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }


        // print shuffled deck
        for (int i = 0; i < n; i++) {
            System.out.println(deck[i]);
        }
    }    
}

```
It seems that I got confused about some concepts when I had week 3 test1; here are some things i need to mention again:
- creating one-dimensional array of length n will also initialize n elements w/ default values
- two-dim arrays are not necessarily rectangular. In java, two-dim array is an array of arrays, so each row can have a different number of elements. 
- int [] c = b seems equal to c = b which means change in c also = change in b
- i personally feel proud of myself when debugging this [BinomialCoefficient.java](https://github.com/Sandyuelin/Java-programming/blob/e3aea5b1281e5b8232798d681dc087bbd318f594/week_3/BinomialCoefficient.java); it includes jagged arrays and an error *Arrayoutboundsindexexception* that new to me
- [jagged/ragged arrays](https://www.geeksforgeeks.org/jagged-array-in-java/) in case you forget
- boolean checks whether an element in an array by using eg：birthdays[birthday]= true, another "milestone" problem I'm solving, proud of myself [BirthdayParadox](https://github.com/Sandyuelin/Java-programming/blob/0f59775a8c0931764d60a52d62a28858238fde7f/week_3/Birthday.java)


### input & output
<br>
to install std.jar into intellij

- Open your installed IntelliJ IDEA Project and.
- Go to the File > Project Structure.
- Select Modules at the left panel and select the Dependencies tab.
- Select the + icon and select 1 JARs or Directories option.
- select your JAR file or you can select the directories.
- Click on the OK button.

<br>

  interact w/ outside world through manipulating text,image, and sound 

- input: *command-line arguments*
- standard input stream: an abstraction(an opinion) for an **infinite input** sequence
- standard output: some methods like System.out.print() and System.out.println() 

- *interactive input:* (1) prompt user to type inputs on standard input stream; (2) mix input stream and output stream

```java
public class AddTwo{  
    public static void main(String [] args){
        StdOut.print("Type the first integer");
        int x = StdIn.readInt();
        StdOut.print("Type the second");
        int y = StdIn.readInt();
        int sum = x+y;
        StdOut.println("There sum is "+ sum);
    }
}
```

redirection: keep data in files on the computer 
- redirect standard output to a file
- from a file to standard input
<br>

piping: avoid saving data
- connect standard output of one program to standard input of another

#### Standard drawing

![StdDraw](https://raw.githubusercontent.com/Sandyuelin/Java-programming/main/week_4/Screenshot%202024-05-14%20183318.png)

iterated function systems: simple iterative computations yield patterns that are similar to those found in the natural world
#### animation
- clear the screen
- move the object
- draw the object
- display and pause briefly

### functions, libraries, and modules
modular programming: organize programs as independent modules that do a job together
<br>
#### functions (aka static method)
- input--> output w/ side effects
- example: built-in functions(Math.random(), Math.abs()), I/O libraries
- library: a set of functions
- module: a .java file
- scope: a variable's scope is the code following its declaration, in the same block(keep scope low to better understand the code)

#### using a library
- put a copy of Gaussian.java in your working directory
- call Gaussian.pdf() or Gaussian.cdf() from any other module in that directory
- learn to use OS "classpath" mechanism if found w/ too many copies


#### modular programming
fundamental abstractions: 

- client: library's methods
- API (applications programming interface): defines signatures, describes methods
- implementation: module containing java code

### recursion
- base case: return a value for small positive integer N
- reduction step

### dynamic programming
- save subproblem's answer to avoid exponential waste pitfalls

## Algorithms and data structures
- performance
- sorting and searching
- stack and queue

### performance
- binary logarithms:
   - the number of bits in the binary representation of N is
      $$1 + lg N$$ 
   - *bit (binary digit)* is the smallest unit of data that a computer can process and store, a byte is a sequence of eight bits

- doubling method
   - to estimate the time of simulation
   - for debugging?
   
![StdDraw](https://github.com/Sandyuelin/Java-programming/blob/51149e57ca5f90a41ba9abf7dab21e62645e846f/week_7/Screenshot%202024-06-02%20144022.png)



## Object-oriented programming (OOP)
- abstract data types:a data type whose representation is hidden from the client
- OOP
   - create ur own data types (representation is hidden from the client)
   - use them in ur programs
   - clients can use ADTs w/o knowing implementation details
   - **a natural vehicle to study abstract models of the real world** 

### creating a data type
![StdDraw](https://github.com/Sandyuelin/Java-programming/blob/62177a50351b291af11afd0b27480d55ad4da84d/week_9/Screenshot%202024-06-06%20140332.png)
### designing data type

- encapsulation
   - separate client from implementation
   - enable modular programming
   - facilitate debugging
   - clarify program code
## Sorting and searching
- whitelist case: use of ```compareTo()``` which is based on the unicode value of each character in the strings.
return 0 is the string is equal to the other string
- binary search
- sorting: rearrange items into ascending order
- Moore's law: the number of transistors in an integrated circuit doubles about every two years
   - implications: memory size doubles
   - processor speed doubles every two years
- scalability: an algorithm _scales_ if its running time doubles when the problem size doubles
   - bottom line: need algorithm scales to keep pace w/ Moore's law.
- mergesort:
  - divide array into two halves
  - recursively sort each half
  - merge two halves to make sorted whole
- longest repeats in a string(LRS)
  - form suffix strings
    (suffix of string: any substring of the string which includes
  the last letter)
  - sort suffix strings
  - find longest lcp among adjacent entries

## Stack and queue 
```
- two data types for manipulating arbitrarily large collections of jects
- each is characterized by four operations:
create the collection,
insert an item,
remove an item,
test emptiness
- always remember the graph that shows stack and queue
```

#### stack operations: 
- __take in and out at the beginning__
  - add an item to the collection
  - remove and return the item most recently added
  - test if the collection is empty
  - return the size of the collection
- postfix arithmetic expression evaluation
  - value: push onto the stack
  - operator: pop operands, apply operator, push the result
```java
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>();

        while (!StdIn.isEmpty()) {
            String token = StdIn.readString();

            if (token.equals("+")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = operand1 + operand2;
                stack.push(result);
            } else if (token.equals("-")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = operand1 - operand2;
                stack.push(result);
            } else if (token.equals("*")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = operand1 * operand2;
                stack.push(result);
            } else if (token.equals("/")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = operand1 / operand2;
                stack.push(result);
            } else {
                // Assuming token is a numbber, push it onto the stack
                double number = Double.parseDouble(token);
                stack.push(number);
            }
        }

        // The final result will be at the top of the stack
        if (!stack.isEmpty()) {
            double finalResult = stack.pop();
            System.out.println("Result: " + finalResult);
        } else {
            System.out.println("No valid expression provided.");
        }
    }
}

```
- PostScript: a virtual machine with stack application
- JVM(java virtual machine) 
#### queue operations: __take from the beginning and add to the end__

