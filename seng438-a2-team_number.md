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
and test AUB = 1000, BUB = 900, UB = 999, LB = 100, BLB = 60, ALB = 105, NOM = 550
As with the DataUtilies class that accepts interfaces as arguements, we need Mocking framework such as Mockito to create dummy objects of the interfaces. After creating the dummy objects we will use ECT partitioning. Dividing cases depending on what values are allowed into the table or that are currently in the table and a case if there is invalid input in the table which should return 0 in DataUtilities.calculateRowTotal() for example.

# 3 Test cases developed
Range Class Test Stubs:   
1.) boolean contains(double value)
-    Returns true if the specified value is within the range and false otherwise.
-    Variable domains: value: a double numberical value in the table.
-    BBT Technique: BVT
-    Example range and boundary values chosen: 1, 0

2.) static Range combine(Range r1, Range r2):
-    Returns a combined range from the arguements. If a range is null, it returns the existing range.
-    If both ranges are null, it should return null.
-    BBT Techiques: BVT and ECT
-    Checking the boundaries and nominal values, checking out of bound ranges, and checking if the return value
is a range or is null.

3.) static Range expandToInclude(Range range, double value)
-    Returns a range that includes all the values in the specified range AND contains the specified value.
-    Variable domain: range --> the current range object we created, value --> the value that we want the new range to contain.
-    BBT Technique: ECP --> Classes: [Lower Bound], [Upper Bound], [Nominal Value], [Arguement Value], [Invalid Value].

4.) boolean	intersects(double lower, double upper)
-    Returns true if the range intersects (overlaps) with the specified range, and false otherwise.
-    Variable domain: lower and upper bounds, numerical values in the table.
-    BBT Technique: ECP --> Classes: [A range that overlaps], [A range that does not overlap].

5.) public static Range shift(Range base, double delta)
-    Shifts the range given by "delta" spaces over to the right or left if delta is negative. 
Effectively changing the upper and lower bounds by delta.
-    Variable domain: base --> the current Range. double delta --> How much to shift the range by.
-    BBT Technique: BVT for testing the new ranges after shifting by delta.
# 4 How the team work/effort was divided and managed

Text…

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
