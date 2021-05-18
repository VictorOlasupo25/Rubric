# Introduction

Welcome to the CA2 Rubric handbook. This handbook will walk you through the Rubric project , the features it contains and how to run it.

 A Rubric is made up of multiple Criteria (up to a maximum of 10). When a student is graded they are awarded a score for each Criterion in the Rubric, which is an integer value between 1 and 5. This project works simlarly. Users can create a new Rubric, add a Criterion to a Rubric, get a list of all Rubrics, get a specific Rubric by name.

![](2021-05-10-20-57-53.png)

## Scrum sprint backlog and task estimation

![](Scrum.png)

Total Estimated Hrs: 70

Estimate of days needed: 8.75

- Backlog is the order of te tasks by priority.
- SP Accumulated allows you to see how much user stories the team can take in the first sprint summing up their SP
- Estimated Hrs shows the time needed to complete the PBI.

How the estimates were chosen?

Fibonacci was used to set the numeric values for the estimations, following the approach that something that is 2 SP will be twice harder than something that is 1 SP. Each Fibanacci value has a number of Hours associated to denote how much time the team will have to complete a PBI. PBI #1 and #5 have 5 SP because they are about creating and inserting new records into the data which is usually harder than just simply quoting the data.

![](Scrum2.png)

Comparing the difficulty of 2 tasks with different estimates

PBI #9 and PBI #4 they both have 2 SP(story points) and 5 SP respectively because calculating the standard deviation in a programming language is easier than creating a quote to get a specific record from a database (whatever the database is). In my case, Java is easier to use because of the  pre-defined function to calculate Standard Deviation.However, getting an specific record is more difficult because the user needs to write the query and make it efficient so it doesn't take that much time when retrieving the data.

How the velocity metric is calculated at the end of each sprint? and How that feeds into planning for the next Sprint?

The velocity is the amount of work the team gets through in a Sprint. It is calculated by checking all User Stories to make sure its completed and  complies with the Definition of Done set at the beginning of the project. You need to sum all the story points from the completed user stories and  that'd be your Velocity for Sprint 1.
For the next Sprint the team need to take into consideration the Velocity of the previous sprint and take the remaining User Stories from the previous Sprint (user stories that were not completed). They also need to sum up the Story points  and check that the total is not greater than the Velocity of the previous sprint.  

The Scrum master needs to have in mind the sum of the SP for all user stories selected for next sprint plus the SP of all unfinished user stories that's  not greater than the Velocity of the previous sprint. After 3 sprints, the Scrum master can calculate the average velocity and the team can work with that number whenever they are planning new sprints and selecting user stories to work on.

## Unit testing and Test-Driven development

Test driven development is a software development approach where tests are being written, before writing the bare minimum of code required for the test to be fulfilled. The code will then be refactored, as often as necessary, in order to pass the test, with the process being repeated for each piece of functionality.

I followed a sequence of steps for my TDD as below:

1. Write Test.
2. Run Test.
3. Check for failed tests.
4. Make changes to the code.
5. Repeat from step 2.

An example of this was when I was testing my Data.java class which will contain code that provides summary calculations across all graded students. These calculations include getting the average, standard deviation, minimum and maximum score for a Rubric and specific criterion of a Rubric.

Sample Data used for DataTest
10, 25, 15, 30, 65

![](test2.png)

## Test coverage metric

### Team version-control

Gitflow is a branching model for Git. It is a set of guidelines that developers can follow when using version control. GitFlow is not hard core rules but guidelines which are not set in stone.

### Benefit of GitFlow

1. The simplicity of the basic model makes git-flow easy to understand, thus ensuring the highest productivity in a short period of time.
I created three branches excluding the main branch. Develop, Student and Data:

 Develop

- served as a final integration branch for all features.
- Implemented Controller and Rubric with its Criterion Classes.

    Student
- Served as an integration branch for creating Student and their grades and adding it to rubric.

    Data
- Served as an integration branch for getting the statistics and relevant scores of Rubrics and its criterions.


2. Git-flow makes it easy to adapt itself to any stage of the project development life cycle, because it does not have any prerequisites. It does not matter how far or how far you go in the development lifecycle; git-flow can be included and adjusted almost immediately.

For example, When I was testing how to calculate the rubric statistics in the Data branch, I implemented changes to the Controller class, but the changes failed, and I needed the old code back. I was able to get the old code from previous commits in the develop branch thanks to my commitment to the git-flow process.

3. Git-flow ensures that at any specific moment in the project life cycle, the status of the branch is clearly identifiable.

## Code-review checklist
