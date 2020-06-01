# Departments Coding Challenge
## **This supplements the beginner Java course I teach**

**Problem Statement**
Create a small application that can report data about an organization based based on the number and types of employees that are in it. Each employee will have a job function and a monthly cost based on that function.

**Specific Requirements**
• Developers warrant an allocation of $2000 each.
• QA Testers warrant an allocation of $1000 each.
• Managers warrant an allocation of $600 each.
• Managers can have QA Testers, Developers, and other managers report to them.
• Departments may have one or more managers at the top level.
• Users of this application should be able to:
o Determine the monthly expense allocation warranted a manager who has various employee types reporting to him/her at least two levels deep (Manager -> Manager -> Developer). The level of depth of the hierarchy should be flexible ideally.
o Determine the monthly expense allocation warranted a department
o List any managers who have no people reporting to them

**Example Scenario**
• For the given hierarchy:
o Manager A
▪ Manager B
• Developer
• QA Tester
o Manager C
▪ Manager D
o Manager E
▪ Developer
• Manager A’s allocation should be: $4200
• Manager B’s allocation should be $3600
• Manager C’s allocation should be $1200
• Manager D’s allocation should be $600
• Manager E’s allocation should be $2600
• The Department’s allocation should be: $8000
• Manager D has no one reporting to them

**Project Details & Constraints**
• No user interface is necessary to prove your project solution works. You can prove it works with Unit tests following whatever best-practices you deem appropriate.
• The project should be zipped and emailed upon completion.
• You may use any design patterns and frameworks you deem necessary to accomplish this task.
