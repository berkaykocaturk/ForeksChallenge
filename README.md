# ForeksChallenge
The challenge of Foreks before hiring the tester employees to the company.

# Getting Started

# Prerequisites
Selenium Web Driver, JUnit 4.0 or higher and Eclipse IDE for Java EE Developers is required.

# Installing
1. Download Eclipse IDE for Java EE Developers from Eclipse web site.
2. Your JRE or JDK should be inside of IDE's folder to run the application.
3. Run the IDE.
4. Right after determining the name of the project, click right on your class.
5. Click Build Path / Configure Build Path...
6. Click Libraries on the top.
7. Click External JARs at the right of the window.
8. Select Selenium Web Driver and JUnit which you downloaded before.
9. You're ready to go.

# Running the Tests
The scenario of the challenge was followed. The test was executed automatically via the program. I decided to use hepsiburada.com instead of n11 because I was told that it was the other alternative.
Initially, the program opens the website of hepsiburada. The program makes the window full screen before the test starts. At first it checks whether the website is true or not and shows it on console. 
After these events, the program opens the login page of the website, enters the ID and password and logs in to the system. Originally, i was asked to log in to the site via a Facebook log in button, but i wanted to make it a little more challenging. After logging in, the program searches the word which is iphone7. The program 
clicks on the first element of the results page, controls if it is the first page or not from the title. Console shows if the clicked product is the same with the required one or not. The program takes a screenshot for troubleshooting in both conditions.
The programs logs out from the web site after these progresses.

# Author
Berkay Kocatürk
