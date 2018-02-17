# TESTEX2-Emmely
## 1
## 2. Static Code Analysis of Triangle program (4 SP) 
_*a) Install Metrics software in your IDE (see tool examples in slides)*_ 
[![https://gyazo.com/e09dacb427a1d5cd0a08226e18b71ac9](https://i.gyazo.com/e09dacb427a1d5cd0a08226e18b71ac9.png)](https://gyazo.com/e09dacb427a1d5cd0a08226e18b71ac9)

_*b) Check coding standards in your Triangle program*_
[![https://gyazo.com/88a23d5915a2b86ad233b261a42e85fb](https://i.gyazo.com/88a23d5915a2b86ad233b261a42e85fb.png)](https://gyazo.com/88a23d5915a2b86ad233b261a42e85fb)

_*c) Calculate central metrics in your Triangle program – make screen dump*_ 
[![https://gyazo.com/05956fc247ca143da41a8f1992e78b29](https://i.gyazo.com/05956fc247ca143da41a8f1992e78b29.png)](https://gyazo.com/05956fc247ca143da41a8f1992e78b29)

_*d) Find out what CC variation that your metrics tool uses*_
The right column uses CC2 and the middle column uses CC.

_*e) Possibly refactor your code based on static testing results. You might also want somebody else to review your code  Write down what changes you make base on static techniques used.*_ 
-

_*f) Write test cases in xUnit tool. Possibly refactor your code once (or twice more) in order to make the tests pass!*_
-




## 3. Peer Review Checklist (2 SP) 
###### *Smartbear has made a “Best practices for Code Review. One of the things on their list is to use checklists in the review process (tip #6). Explain their checklist in your own words, make comments on what you especially find useful in the list and possibly provide with examples.* 

My reflection:

(1).Set Early Expectations With The Developer About Annotating Their Source Code Before The Review

By having the author carefully read through and annotate their own code,
prior to giving it to their team for review, fewer defects were found.



(10).Do A Certain Amount Of Code Review Each Day, Even If It's Not Every Line.
It's state that "A developer will be more conscientious of their own code 
beforecode-complete is declared because it's known a team of developers will be reviewing the code daily."


My reflection on point 1 and 10 is that they both make the programmer more reflective of and conscious
of his/her work thus self improving their own code.

My reflection regarding point 10 is also that a daily interaction to review code also opens up for
questions. Lets say that a programmer is in doubt of either requirements or the solution or implementation.
A daily interaction helps clarify requirements and technical implementation.
In Agile we strive as much as possible for transparency and communication.


(3). Have A System To Capture Metrics So You Can Improve Your Processes

*"Quantifiable Metrics allows you to judge how effective and efficient the code review precess is for you team."*

The metrics should be something that could be measured in a indisputable way. It's important because we want to know that the time we put into a process adds value.
Our goal is to deliver good quality software. Lesser issue reports from customer could be such a metrics to messure that.



## 4. Review code that mysteriously fails its unit tests (1 SP) 
*Please review this code, as the tests do not succeed as expected. Can you fix it?*

In TestCatalog the following method will fail:

addingAnAdultShouldSucceed()

The reason for this is that 

1) We don't have a test in addingAMinorShouldThrowException() to capture the fact that a person under 18 is being added to the list.
We don't discover that until the second test where we see that the list is not empty.
To fix it add assertion statement after the method addPerson has been called.
In class TestCatalog:

    @Test(expected = IllegalArgumentException.class)     
	public void addingAMinorShouldThrowException() {         
		assertEquals(0, underTest.getNrOfPeople());          
		Person p = new Person(2015);         
		underTest.addPerson(p);
		assertEquals(0, underTest.getNrOfPeople());          
	
	}
	
2) Wrap method in a else statement
In class Catalog	
	public void addPerson(Person person) { 
		if (Calendar.getInstance().get(Calendar.YEAR)-person.getYearOfBirth() < 18){ 
			throw new IllegalArgumentException("Only adults admitted."); 
		}
		else{	
			people.add(person);     
		}
	}

	
	Coding standards that I find the most important:
	
1) Correctly indent the code.
2) Use best practices for the specific language for naming conversions.
3) Use best practices for naming and structuring files and folders.





