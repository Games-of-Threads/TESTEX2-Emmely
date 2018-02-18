# Static Test Techniques Exercise (10 Study points - non-mandatory) 

Emmely Lundberg - cph-el69

GitHub repo: https://github.com/Games-of-Threads/TESTEX2-Emmely

## 1.
 9.5
## 2. Static Code Analysis of Triangle program (4 SP) 
###### *a) Install Metrics software in your IDE (see tool examples in slides)* 

I have instaleed [MetricsReloaded](https://plugins.jetbrains.com/plugin/93-metricsreloaded) compatible with IntelliJ IDEA.

[![https://gyazo.com/e09dacb427a1d5cd0a08226e18b71ac9](https://i.gyazo.com/e09dacb427a1d5cd0a08226e18b71ac9.png)](https://gyazo.com/e09dacb427a1d5cd0a08226e18b71ac9)

###### *b) Check coding standards in your Triangle program*
In IntelliJ IDEA I opened up Settings -> Editor -> Code Style -> Java
[![https://gyazo.com/88a23d5915a2b86ad233b261a42e85fb](https://i.gyazo.com/88a23d5915a2b86ad233b261a42e85fb.png)](https://gyazo.com/88a23d5915a2b86ad233b261a42e85fb)

###### *c) Calculate central metrics in your Triangle program – make screen dump* 
[![https://gyazo.com/b9eac1e4d63a936e1e142860dd8bd791](https://i.gyazo.com/b9eac1e4d63a936e1e142860dd8bd791.png)](https://gyazo.com/b9eac1e4d63a936e1e142860dd8bd791)

###### *d) Find out what CC variation that your metrics tool uses*
In the picture above: The right column v(G) uses CC2 and the middle column iv(G) uses CC.

###### *e) Possibly refactor your code based on static testing results. You might also want somebody else to review your code  Write down what changes you make base on static techniques used.* 
The code is within recommended maximum 10 CC. 

###### *f) Write test cases in xUnit tool. Possibly refactor your code once (or twice more) in order to make the tests pass!*
I have used Javas jUnit4 library to write [my test cases of the Triangle program](https://github.com/Games-of-Threads/TESTEX2-Emmely/blob/master/tests/TriangleTest.java).





## 3. Peer Review Checklist (2 SP) 
###### *SmartBear has made a “Best practices for Code Review. One of the things on their list is to use checklists in the review process (tip #6). Explain their checklist in your own words, make comments on what you especially find useful in the list and possibly provide with examples.* 

[The SmartBear Checklist](https://smartbear.com/learn/code-review/guide-to-code-review-process/) compiles tips and bests practices when it comes to code reviewing. 
They are guidelines to follow to obtain most out of code reviewing process thus making reviewing more effective and bring more value such as creating better quality code and finding bugs early. 
Finding bugs in the review process is much cheaper than finding them later down the lines. 
This is why code reviewing is such an important process. The checklist helps us do the process in a effective and professional way where we also take into consideration the person being reviewed.

Here are what I find most useful and some examples:

> (1). Set Early Expectations With The Developer About Annotating Their Source Code Before The Review

> By having the author carefully read through and annotate their own code,
> prior to giving it to their team for review, fewer defects were found.

My reflection on point 1 is that the annotation in the code automatically leads to better code standard and comments in the code.
This in turn could make the code easier to read and maintain by other developers in the future. An extra bonus.

> (10).Do A Certain Amount Of Code Review Each Day, Even If It's Not Every Line.
It's state that 
> "A developer will be more conscientious of their own code 
> beforecode-complete is declared because it's known a team of developers will be reviewing the code daily."


My reflection on point 1 and 10 is that they both make the programmer more reflective of and conscious
of his/her work thus self improving their own code which is what we strive for.

My reflection regarding point 10 is also that a daily interaction to review code also opens up for
questions. Lets say that a programmer is in doubt of either Requirements, the solution or implementation.
A daily interaction helps clarify Requirements and technical implementation.
In Agile we strive as much as possible for interaction and communication often.


> (3). Have A System To Capture Metrics So You Can Improve Your Processes

> "Quantifiable Metrics allows you to judge how effective and efficient the code review precess is for you team."

The metrics should be something that could be measured in a indisputable way. It's important because we want to know that the time we put into a process adds value.
Our goal is to deliver good quality software. Lesser issue reports from customer could be such a metrics to measure that the code reviewing process leads to that.



## 4. Review code that mysteriously fails its unit tests (1 SP) 
###### *Please review this code, as the tests do not succeed as expected. Can you fix it?*

In class TestCatalog the following method will fail:

addingAnAdultShouldSucceed()

The reason for this is that 

1) We don't have a test in addingAMinorShouldThrowException() to capture the fact that a person under 18 is being added to the list.
We don't discover that until the second test where we see that the list is not empty.
```
//To fix it add assertion statement after the method addPerson has been called.
//In class TestCatalog:

    @Test(expected = IllegalArgumentException.class)     
	public void addingAMinorShouldThrowException() {         
		assertEquals(0, underTest.getNrOfPeople());          
		Person p = new Person(2015);         
		underTest.addPerson(p);
		assertEquals(0, underTest.getNrOfPeople());          
	
	}
```
	
2) We are missing an else statement in the code under test.
```
//Wrap the addPerson method in a else statement
//In class Catalog	
	public void addPerson(Person person) { 
		if (Calendar.getInstance().get(Calendar.YEAR)-person.getYearOfBirth() < 18){ 
			throw new IllegalArgumentException("Only adults admitted."); 
		}
		else{	
			people.add(person);     
		}
	}
```


## 5. Coding Standard Document (1 SP) 
###### *List the coding standards - best practices and code conventions - that you find most important for a team to follow (½ - 1 page).* 

##### Coding standards that I find the most important:
	
1) Correctly and consistent code indentation according to the programming language.
2) Consistent naming conversions, according to best practise. CamelCase is usually best practice for Java and JavaScript. Some properties within the language as special naming conversions such as constants that we usually capitalize in Java and JavaScript
3) Best practices for naming and structuring files and folders. For example structure third party library in a separate folder according to best practice. 
4) Code Refactoring. Refactor when methods, functions or files become to lengthy. The motto is refactor early, refactor often.
5) Capitalize SQL Special Words. To avoid confusion.
6) Use same file format and white space. Different file formats and white spaces in a team can lead to unnecessary Git conflicts when Git or other versioning tools merge the code.




## 6. Highlights from lecture by Gitte Ottosen, Gapgemini-Sogeti  (1 SP) 
###### *Describe the three most essential things – in your opinion - that were mentioned in the guest lecture on February 12th (½-1 page description).* 

Here are the three most essential things mentioned during the presentation in my own interpretation: 

##### Build quality in - because it's cheaper

As Software Developers it's a must to use tools like Unit tests and Automated tests, Continues Delivery and Integration and other tools and techniques to assure quality in software. 

Minimum testing that should be performed on any software:

These techniques is what we should have as a minimum to assure quality when developing software:
- Review
- Unit Test
- Exploratory Test of User Stories
- Automated Regression Test - Testing GUI

##### Avoid bugs early

Gitte showed slides of how most of the Software "bugs" are created in the Requirements phase when the software hasn't even been developed.
This statistics and facts were new to me, an eye opener for me personally.
She showed for every phase we introduce more bugs and the total adds up to a very big number in the final product.
We need to avoid bugs being created as early as possible starting with Requirements. 
Creating Test Cases of the Requirements is one way to make sure we have understood the Requirements and avoiding bugs.
By talking through the Requirements and Test Cases with users and stakeholders we make sure that we understand what they need and that we as Software Developers don't make our own assumptions and interpretations.
User stories leads to Acceptance Criteria. The Acceptance Criteria is our Software Requirements (something we must remember).
The Acceptance criteria should be SMART, Specific, Measurable, Achievable, Relevant, Time Specific.

##### Our job as Software Developers is to create customer value

As developer this is our job and something we must keep in mind all the time.
Stated in the [Agile Manifesto](http://Agilemanifesto.org/) and something Gitte brought up.

She stressed the importance of Agile manifesto. And pointed out that Agile is a way of thinking.
And we should aim at having this way of thinking and not just knowing what Agile is or think that we work Agile when we don't have the Agile way of thinking. 
Knowing the Agile manifesto and doing it are different things.
It's more important than ever (because of time to market becoming important factor) to work Agile and testing is a part of that.
Testing should not be done in a different department by test specialized team. It should be as close to the the development team as possible in Agile.
Preferable in Agile we should work in teams where the team has many different competences. Testers and developers should be in the the same team. 
Preferable all developers should be the testers as well. We as software developer should be T-shaped meaning that we have a broad competence (tesing included) but deep competence in one area.


