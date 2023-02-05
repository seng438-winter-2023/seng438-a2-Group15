**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:   15   |     |
| -------------- | --- |
| Student Names: |     |
|Carlos Morera Pinilla                |     |
|Neil Adrian Sarmiento             |     |
|Hassan Anwar                |     |
|Toshi Biswas                |     |

# 1 Introduction

This lab is designed to put into practice writing smart and concise JUnit Test Cases, developing Test Suites,
and Mocking Framework using Mockito or JMock to see how we can pass values and throw exceptions as well as investigate
as to why the behaviour acts this way, which gives it more functionality that a simple test stub.
We will also gain understanding of two main types of Black Box Techniques such as Equivalence Class Partitioning and 
Boundary Value Testing and what values and classes are appropriate given a set of Ranges.

# 2 Detailed description of unit test strategy

For the Range class located in the org.jfree.data package, this is the perfect class to test BVT since the entire class depends on a set range of
numerical values. Since under BBT, we can only rely on the documentation provided to us without access to the source code, we expect the class methods to compile and pass or fail under proper test inputs and ranges. For example, in the method Range.contains(double value) which returns a boolean value to denote whether or not a value is contained in the range defined by the constructor. We can create a range such as [100, 999]
and split it into 3 ranges. Values less than 100, a value in the range, a value greater than 999.

# 3 Test cases developed

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

Text…

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
