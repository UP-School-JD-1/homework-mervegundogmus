
/**EASY QUESTIONS
 */

/**
   1. Which of the following are valid Java identifiers? (Choose all that apply)
   A. A$B
   B. _helloWorld
   C. true
   D. java.lang
   E. Public
   F. 1980_s
   
   Ans: A, B, F

   3. Which of the following are true? (Choose all that apply)
	4: short numPets = 5;
	5: int numGrains = 5.6;
	6: String name = "Scruffy";
	7: numPets.length();
	8: numGrains.length();
	9: name.length();
	
	A. Line 4 generates a compiler error.
	B. Line 5 generates a compiler error.
	C. Line 6 generates a compiler error.
	D. Line 7 generates a compiler error.
	E. Line 8 generates a compiler error.
	F. Line 9 generates a compiler error.
	G. The code compiles as is.
  
	Ans: B, D, E
  
   4. Given the following class, which of the following is true? (Choose all that apply)
	1: public class Snake {
	2:
	3: public void shed(boolean time) {
	4:
	5: if (time) {
	6:
	7: }
	8: System.out.println(result);
	9:
	10: }
	11: }
	A. If String result = "done"; is inserted on line 2, the code will compile.
	B. If String result = "done"; is inserted on line 4, the code will compile.
	C. If String result = "done"; is inserted on line 6, the code will compile.
	D. If String result = "done"; is inserted on line 9, the code will compile.
	E. None of the above changes will make the code compile.
  
 	Ans: E
 	
 	10. Which of the following are legal entry point methods that can be run from the command
line? (Choose all that apply)
	A. private static void main(String[] args)
	B. public static final main(String[] args)
	C. public void main(String[] args)
	D. public static void test(String[] args)
	E. public static void main(String[] args)
	F. public static main(String[] args)
	G. None of the above.
	
 	Ans: A, C, D, E
 	
 	15. Which of the following lines of code compile? (Choose all that apply)
	A. int i1 = 1_234;
	B. double d1 = 1_234_.0;
	C. double d2 = 1_234._0;
	D. double d3 = 1_234.0_;
	E. double d4 = 1_234.0;
	F. None of the above.
	
	Ans: A, E
	
	22. Which of the following are true statements? (Choose all that apply)
	A. Java allows operator overloading.
	B. Java code compiled on Windows can run on Linux.
	C. Java has pointers to specific locations in memory.
	D. Java is a procedural language.
	E. Java is an object-oriented language.
	F. Java is a functional programming language.
	
	Ans: B, D, E, F

 */


/**MEDIUM QUESTIONS
 */

/**
	16. Given the following class, which of the following lines of code can replace INSERT CODE
	HERE to make the code compile? (Choose all that apply)
	public class Price {
	public void admission() {
	INSERT CODE HERE
	System.out.println(amount);
	} }
	A. int amount = 9L;
	B. int amount = 0b101;
	C. int amount = 0xE;
	D. double amount = 0xE;
	E. double amount = 1_2_.0_0;
	F. int amount = 1_2_;
	G. None of the above.
	
	Ans: B, C, D
	
	17. Which of the following are true? (Choose all that apply)
	public class Bunny {
	public static void main(String[] args) {
	Bunny bun = new Bunny();
	} }
	A. Bunny is a class.
	B. bun is a class.
	C. main is a class.
	D. Bunny is a reference to an object.
	E. bun is a reference to an object.
	F. main is a reference to an object.
	G. None of the above.
	
	Ans: A, C, E
	
 */


/**HARD QUESTIONS
 */

/**
	9. Which of the following legally fill in the blank so you can run the main() method from the
command line? (Choose all that apply)
	public class Main{
		public static void main(//Here//)  {
   		}
	} 
	A. String[] _names
	B. String[] 123
	C. String abc[]
	D. String _Names[]
	E. String... $n
	F. String names
	G. None of the above.
	
	Ans: A, C, D , E
	
	23. Which of the following are true? (Choose all that apply)
	A. javac compiles a .class file into a .java file.
	B. javac compiles a .java file into a .bytecode file.
	C. javac compiles a .java file into a .class file.
	D. Java takes the name of the class as a parameter.
	E. Java takes the name of the .bytecode file as a parameter.
	F. Java takes the name of the .class file as a parameter.
	
	Ans: C, D
	
 */

/**EASY QUESTIONS
 */

/**
	1. Which of the following method signatures is a valid declaration of an entry point in a
	Java application?
	A. public void main(String[] args)
	B. public static void main()
	C. private static void start(String[] mydata)
	D. public static final void main(String[] mydata)
	
	Ans: D

	3. What is the proper filename extension for a Java bytecode compiled file?
	A. .java 
	B. .bytecode
	C. .class
	D. .dll
	
	Ans: A

	5. Which of the following is not a facet of traditional object-oriented programming languages?
	A. Objects are grouped as procedures, separate from the data they act on. 
	B. An object can take many forms via casting.
	C. An object can hold data, referred to as attributes.
	D. An object can perform actions, via methods.
	
	Ans: A

	8. Which of the following is not a valid code comment in Java?
	A. // Add 5 to the result
	B. / TODO: Fix bug 12312 /
	C. # Add configuration value 
	D. / Read file from system /
	
	Ans: C

	9. Which statement about a valid .java file is true?
	A. It can only contain one class declaration.
	B. It can contain one public class declaration and one public interface definition.
	C. It must define at least one public class.
	D. It may define at most one public class.
	
	Ans: D

	13. Which statements about Java are true?
	I. The java command can execute .java and .class files.
	II. Java is not object oriented.
	III. The javac command compiles directly into native machine code.
	A. I only 
	B. III only
	C. II and III
	D. None are true.
	
	Ans: A

	19. Which of the following is true of a Java bytecode file?
	A. It can be run on any computer with a compatible JVM. ++
	B. It can only be executed on the same type of computer that it was created on.
	C. It can be easily read and modified in a standard text editor.
	D. It requires the corresponding .java that created it to execute.
	
	Ans: A

	20. What is the correct character for terminating a statement in Java?
	A. A colon (:)
	B. An end-of-line character
	C. A tab character
	D. A semicolon (;)
	
	Ans: D

	23. Which of the following features allows a Java class to be run on a wide variety of computers
	and devices?
	A. Encapsulation
	B. Object oriented
	C. Inheritance
	D. Platform independence 
	
	Ans: D

	24. Which of the following is not a property of a JVM?
	A. It prevents Java bytecode from being easily decoded/decompiled.
	B. It supports platform independence.
	C. It manages memory for the application. 
	D. It translates Java instructions to machine instructions.
	
	Ans: C

	30. Which of the following is a true statement?
	A. The java command compiles a .java file into a .class file.
	B. The javac command compiles a .java file into a .class file. 
	C. The java command compiles a .class file into a .java file.
	D. The javac command compiles a .class file into a .java file.
	
	Ans: B

	31. Which of the following statements about Java is true?
	A. Java is a procedural programming language.
	B. Java allows method overloading. 
	C. Java allows operator overloading.
	D. Java allows direct access to objects in memory.
	
	Ans: B

	35. Which of the following is a valid code comment in Java?
	A. //////// Walk my dog 
	B. #! Go team!
	C. / Process fails at runtime /
	D. None of the above

	Ans: A

	36. Which of the following method signatures is not a valid declaration of an entry point in a
	Java application?
	A. public static void main(String... arguments)
	B. public static void main(String arguments) 
	C. public static final void main(String[] arguments)
	D. public static void main(String[] arguments)
	
	Ans: B

	38. What is required to define a valid Java class file?
	A. A class declaration 
	B. A package statement
	C. At least one import statement
	D. The public modifier
	
	Ans: B

	39. What is the proper filename extension for a Java source file?
	A. .jav
	B. .class
	C. .source
	D. .java 
	
	Ans: D

	42. is the technique of structuring programming data as a unit consisting of attributes, with actions defined on the unit.
	A. Encapsulation
	B. Object orientation 
	C. Platform independence
	D. Polymorphism
	
	Ans: B
 */

/**MEDIUM QUESTIONS
 */

/**
	27. Which is the correct order of statements for a Java class file?
	A. import statements, package statement, class declaration
	B. package statement, class declaration, import statement
	C. class declaration, import statements, package declaration
	D. package statement, import statements, class declaration
	
	Ans: D
 */

/**HARD QUESTIONS
 */
/**
	32. Given the following code, what values inserted in order into the blank lines, allow the code
	to compile?
	agent;
	public Banker {
	private static getMaxWithdrawal() {
	return 10;
		}
	}
	A. import, class, null
	B. import, interface, void
	C. package, int, int
	D. package, class, long 
	Ans: D


	49. Given the following class diagram, which Java implementation most closely matches this
	structure?
	Book
	+ numberOfPages
	+ getRating()
	A. public class Book {
	public int numOfPages;
	B. public class Book {
	public String getRating() {return null;} }
	C. public class Book {
	public int numberOfPages;
	public String getRating() {return null;} } 
	D. public class Book {
	void numberOfPages; }
	
	Ans: C
 */


