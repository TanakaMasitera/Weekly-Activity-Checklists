# Week 1

## Activity 1: Your First Program in Kotlin

### What I Learned

In this activity, I was introduced to Kotlin and used Kotlin Playground to run my first program. I learned that a Kotlin program starts from the `main()` function and that `println()` is used when I want to display text in the output.

I also learned the basic parts of a function. A function starts with the `fun` keyword, followed by the function name, parentheses, and curly braces containing the code that should run.

Another thing I learned was that Kotlin is very specific about how code is written. Missing quotation marks, using the wrong brackets, or spelling a function incorrectly can cause an error.

### What I Accomplished

- Ran my first program and displayed `Hello, world!`
- Changed the message to `Hello, Android!`
- Printed the same message more than once
- Changed the program to display my own name
- Practiced printing several lines of text
- Put the days of the week in the correct order
- Fixed errors involving missing quotation marks and curly braces
- Corrected `printLine()` to `println()`
- Practiced keeping each statement on its own line

### Challenges

One challenge was understanding the different symbols used in Kotlin, especially parentheses `()` and curly braces `{}`. I also had to pay attention to quotation marks when printing text.

The troubleshooting exercises were useful because I could see how a small mistake can stop the whole program from running. Reading the error and comparing my code with the expected output helped me find the mistakes.

### My Progress

After completing this activity, I have a better understanding of how a simple Kotlin program is structured. I am still new to Kotlin, but I can now write a basic `main()` function, use `println()` to display information, and identify some simple coding errors.


## Activity 2: Create and Use Variables in Kotlin

### What I Learned
In this activity, I learned how variables are created and used in Kotlin. I learned that Kotlin uses `val` for values that should stay the same and `var` for values that are allowed to change while the program is running.

I also practiced working with different types of data. I used `String` for text, `Int` for whole numbers, `Double` for decimal numbers, and `Boolean` for true or false values. This helped me understand that the type of data stored in a variable affects what I can do with that variable.

Another thing I learned was how to include variables inside printed messages using string templates. Instead of writing separate pieces of text, I can use the `$` symbol to insert the value of a variable directly into a string.

### What I Accomplished
- Created variables using both `val` and `var`
- Practiced storing text, whole numbers, decimal numbers, and Boolean values
- Updated the value of a variable declared with `var`
- Used variables inside `println()` statements
- Used string templates to combine text with variable values
- Performed a simple calculation using integer variables

### Challenges
One challenge was remembering the difference between `val` and `var`. At first they looked very similar, but the exercises helped me understand that a `val` cannot be reassigned after it has been given a value, while a `var` can be changed.

I also had to pay attention to the `$` symbol when using variables inside strings. This was new to me, so practicing it several times helped me understand how Kotlin string templates work.

### My Progress
After completing this activity, I am more comfortable creating and using variables in Kotlin. I can now decide whether a value should use `val` or `var`, work with some basic data types, and display variable values as part of a message.


## Activity 3: Create and Use Functions in Kotlin

### What I Learned
In this activity, I learned more about functions and why they are useful in a program. I learned that a function is a reusable section of code that performs a particular task. Instead of repeating the same code several times, I can create a function and call it whenever I need it.

I practiced creating functions with parameters. Parameters allow information to be passed into a function so that the same function can work with different values. I also learned about arguments, which are the actual values supplied when the function is called.

I also practiced functions that return a value. This helped me understand that a function can perform an operation and send the result back to the part of the program that called it.

### What I Accomplished
- Created and called Kotlin functions
- Practiced using function parameters
- Passed arguments when calling functions
- Worked with return values
- Used data types with function parameters and return values
- Practiced reusing functions instead of repeating code

### Challenges
The main challenge was understanding the difference between a parameter and an argument. I learned that parameters are defined when I create the function, while arguments are the values I provide when I call the function.

I also had to pay attention to where parentheses, curly braces, colons, and return types are placed. Kotlin syntax is very specific, and a small mistake can prevent the program from compiling.

### My Progress
I now have a better understanding of why functions are important. I can create a simple function, pass information to it, return a result, and call the function from `main()`. I still need more practice with functions, but their structure makes much more sense to me now.


## Practice Problems: Kotlin Basics

### What I Learned
The practice problems helped me bring together the different concepts I learned during Week 1. Instead of focusing on only one topic, I had to identify problems in existing code and decide what needed to be changed.

I practiced printing messages, fixing compilation errors, using string templates, working with numbers, creating functions, using default parameters, and following Kotlin naming conventions.

One useful example was learning the difference between numbers and strings. When `"20"` and `"30"` are stored as strings, using `+` joins them together and produces `"2030"`. When `20` and `30` are stored as integers, Kotlin performs addition and produces `50`.

I also learned how default parameters can make a function more flexible. If a value is not provided when the function is called, Kotlin can automatically use a default value.

### What I Accomplished
- Printed several messages on separate lines
- Found and corrected a compilation error caused by incorrect quotation marks
- Used string templates with variables
- Corrected variables that were incorrectly declared as read-only
- Identified the difference between string concatenation and mathematical addition
- Calculated a total salary using numeric variables
- Created reusable `add()` and `subtract()` functions
- Used a default function parameter
- Practiced passing named and positional arguments
- Renamed poorly formatted variables and functions using camelCase
- Used a pedometer example to calculate calories burned from steps

### Challenges
Some of these problems required me to look carefully at code that appeared correct at first. Small details such as quotation marks, capitalization, variable types, and brackets could completely change the result or cause a compilation error.

The string concatenation problem was especially useful because it showed me that code can run successfully but still produce the wrong result. I learned that I need to check both whether my program runs and whether the output is actually correct.

The math and function exercises also required more attention because I had to understand how values move from `main()` into another function and how the result is returned.

### My Progress
After completing the Kotlin Basics practice problems, I feel more confident reading simple Kotlin programs and understanding what each part of the code is doing. I can now recognize some common errors instead of only copying the code and running it.

Week 1 gave me practice with `main()`, `println()`, variables, data types, string templates, functions, parameters, arguments, return values, default parameters, calculations, and camelCase naming. I still need practice as I continue learning Kotlin, but I now have a stronger foundation to build on in the next activities.
