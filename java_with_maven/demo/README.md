# Java

## Compiling/Running Java
Two ways:
- `java App.java` compiles and executes at runtime. `main(String[])` method must be called first
- `javac App.java` runs the compiler and then `java App` executes (main method doesn't need to be called first).
Note `java` needs to be called from root package e.g. `java com.example.FreshJuiceTest`

## Java Tutorial

Java tutorial: https://www.tutorialspoint.com/java/java_basic_datatypes.htm

### Primitive Dtypes
byte (8 -bit) - Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.
short (16 bit) - Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an integer
int (32 bit) - Integer is generally used as the default data type for integral values unless there is a concern about memory.
long (64 bit) - This type is used when a wider range than int is needed
float (32 bit single precision 754 floating point) - Float is mainly used to save memory in large arrays of floating point numbers (Float data type is never used for precise values such as currency (should use Decimal/BigDecimal?)https://stackoverflow.com/questions/37500460/java-double-data-type-should-never-be-used-for-precise-values-such-as-currency/37500512#:~:text=For%20scientific%20and%20engineering%20applications,much%20the%20degree%20of%20precision.)
double (double-precision 64-bit IEEE 754 floating point) - This data type is generally used as the default data type for decimal values, generally the default choice (Double data type should never be used for precise values such as currency)
Boolean - boolean data type represents one bit of information.There are only two possible values: true and false
Char (char data type is a single 16-bit Unicode character) - Char data type is used to store any character

## Modifiers
Access Control Modifiers
Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors. The four access levels are −

Visible to the package, the default. No modifiers are needed.
Visible to the class only (private).
Visible to the world (public).
Visible to the package and all subclasses (protected).
Non-Access Modifiers
Java provides a number of non-access modifiers to achieve many other functionality.

The static modifier for creating class methods and variables.

The final modifier for finalizing the implementations of classes, methods, and variables.

The abstract modifier for creating abstract classes and methods.

The synchronized and volatile modifiers, which are used for threads.

# Ternary Operator
variable x = (expression) ? value if true : value if false

## Exceptions
1. Checked exceptions (compiled exceptions)
2. Unchecked exceptions (runtime)
3. Errors (beyond control of programmer, as programmes cannot recover from these)



## Maven 
Maven Project: https://www.infoworld.com/article/3516426/what-is-maven-build-and-dependency-management-with-apache-maven.html#:~:text=Apache%20Maven%20is%20a%20cornerstone,sharing%20new%20projects%20a%20snap.

Maven is main package manager with Java

### Run tests
`mvn test`

### Build 
`mvn package`
compiles in to jar file which can be installed and used elsewhere with 
`mvn install`

### Hot Deploy Setup
with spring boot

Maven archetypes are project templates. A load of different ones. Spring  boot way of quickly planning out app.

