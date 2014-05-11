
#Introduction
##General description
Mission statement: To write a program that emulates the game ‘2048’ as a means of introducing and getting to know sub versioning, unit testing and integration testing as part of Software Engineering 3. The 2048 game is a sliding block game, where 2s or 4s are randomly inserted into a grid and rows/columns slided to add equal numbers 

##Schedule (iterative every lab/work session)
|Half|what|
|--------------|--------------|
|1st|start writing code|
|2nd|write test cases (as unit tests)|
Note: It is recognised that it should be reversed, that is, write tests before code.

#Required resources
Hardware

|What		|why|
|--------------|--------------|
|		|no specific hardware is required|

Software

|What		|why|
|--------------|--------------|
|Github 		|for version control|
|C compiler	|to compile the source code|

Testing tools

|What		|why|
|--------------|--------------|
|-		|no testing tools|

Staff

|What		|why|
|--------------|--------------|
|me		|to do all the coding and testing|

#Testable aspects
Unit tested functions
* Tilting a row left
More specifically the following rules/functionality is tested using one or more test per each:
 * empty rows stay empty 
 * values move to the left
 * values combine
 * non-combinable values don't combine
 * combining is not affected by position
 * combines leftmost and doesn’t combine twice
 * mixtures of combines and non combines works as expected
* Tilting a row right 
 * As per the above except to the right
* Tilting the board left (uses tilt row left)
 * output is expected
* Tilting the board right (uses tilt row right)
 * output is expected
* Tilting the board up (uses tilt left with flip Left before and after)
 * output is expected
* Tilting the board down (uses tilt right with flip Left before and after)
 * output is expected
* flip left ( flips across the diagonal such that rows become columns and columns become rows)
 * rotates as expected NOTE: There is little chance of error as swapping the row and column variables in a loop of the original board can be used to check a flipped.
* Create an empty board
 * board is empty
* random insertion
 * insertion position changes
 * insertion number is always 2 (changed from 2 and 4)
 * insertion does not occur every move
 * does not insert if not available space
 
Integration testing aspects
* Test tilting left then tilting right (not sure if this is needed)

#Non Testable aspects
* Any graphical user interface that uses these methods

#Test Produced documents
* The specifics of each test
* Demonstration that all of the test pass

#Risks and dependencies
* That the staff do not have the ability to write the program for lack of programming knowledge
* That there will not be enough time to complete the project given other staff commitments

#Project Criteria
Goal

Success and Failure measured by
Success will be measured based on the amount of tests that pass combined with their relevance to the core functionality of the program
	
#References
* Using outline as per http://www.wikihow.com/Write-a-Test-Plan
* Markdown as per https://help.github.com/articles/markdown-basics and https://help.github.com/articles/github-flavored-markdown
